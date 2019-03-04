package Lab10;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class empDAOImpl implements empDAO {
    private static String driverName = "org.sqlite.JDBC";
    private static String url = "jdbc:sqlite:D:/company.sqlite";
    private static Connection conn = null;


    //Constants Operation
    private static final String GET_ALL_EMP =
            "select *from employee";
    private static final String ADD_EMP =
            "insert into employee (id,name,position,salary)values (?,?,?,?)";
    private static final String FIND_BY_ID =
            "select *from employee where id = ?";
    private static final String UPDARE_EMP =
            "update employee set name=?,position=?,salary=?" + "ehere id=?";
    private static final String DELETE_EMP =
            "Employee deleted where id = +id";


    private static empDAOImpl instant = new empDAOImpl();


    //Constructor
    private empDAOImpl() {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e)

        {
            e.printStackTrace();
        }
        System.out.println("Load Driver Succrssfully.");
    }

    public static empDAOImpl getInstant() {
        return instant;
    }


    @Override
    public List<Employee> getALLEmp() {
        List<Employee> emp = new ArrayList<>();


        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(GET_ALL_EMP);

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String position = rs.getString(3);
                double salary = rs.getDouble(4);

                emp.add(new Employee(id, name, position, salary));
            }
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return emp;

    }


    @Override
    public void addEmp(Employee emp) {

        try {
            conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement(ADD_EMP);

            //set properties
            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getName());
            ps.setString(3, emp.getPosition());
            ps.setDouble(4, emp.getSalary());
            ps.execute();
            System.out.println("Employee with name" + emp.getName() +
                    "was add to datadase already.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Employee getEmpById(int id) {
        Employee emp = null;
        try {
            conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement(FIND_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int idd = rs.getInt(1);
                String name = rs.getString(2);
                String position = rs.getString(3);
                double salary = rs.getDouble(4);
                emp = new Employee(id, name, position, salary);
            } else {
                System.out.println("Not found employee with id = " + id + " not found.");
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException | NullPointerException e) {
            e.printStackTrace();
        }
        return emp;
    }


    @Override
    public void updateEmp(Employee emp) {
        try {
            conn = DriverManager.getConnection(url);
            PreparedStatement ps = conn.prepareStatement(UPDARE_EMP);
            ps.setString(1, emp.getName());
            ps.setString(2, emp.getPosition());
            ps.setDouble(3, emp.getSalary());
            ps.setInt(4, emp.getId());

            int result = ps.executeUpdate();
            if (result != 0) {
                System.out.println("" + "Employee with id \"+emp.getId()+ \" was updated.");
            } else {
                System.out.println("Employee data was not updated.");
                ps.close();
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void deleteEmp(int id) {
        try {
            conn = DriverManager.getConnection(url);
            PreparedStatement stmt = conn.prepareStatement(DELETE_EMP);
            stmt.setInt(1, id);
            int resultSet = stmt.executeUpdate();
            if (resultSet != 0) {
                System.out.println("Employee deleted with id = +id");
                conn.close();
            } else {
                System.out.println("No employee was deleted with id = " + id);
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

