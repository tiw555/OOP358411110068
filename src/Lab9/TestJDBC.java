package Lab9;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Employee{
    private int id;
    private String name;
    private String possition;
    private double salary;

    //constructor
    public Employee(int id,String name,String position,double salary){
        this.id=id;
        this.name=name;
        this.possition=possition;
        this.salary=salary;
    }

    //toString
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPossition() {
        return possition;
    }

    public void setPossition(String possition) {
        this.possition = possition;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}//Employee

public class TestJDBC {
    public static void main (String []args) throws ClassNotFoundException, SQLException {
        //Step1
        Class.forName("org.sqlite.JDBC");
        System.out.println("Load Driver successfully.");

        //Step2
        String SQCONN = "jdbc:sqlite:D:/OOP358411110068/src/company.sqlite";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(SQCONN);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (conn == null) {
            System.out.println("Could not coonnect to DB.");
        } else {
            System.out.println("Connected to DB.");
        }

        //Step3
        Statement stmt = conn.createStatement();
        String sql = "select * from employee";
        ResultSet rs = stmt.executeQuery(sql);

        //Step4
        List<Employee> emp = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            String position = rs.getString(3);
            double salary = rs.getDouble(4);
//            System.out.println("ID:"+id);
//            System.out.println("Name:"+name);
//            System.out.println("Position:"+position);
//            System.out.println("Salary:"+salary);
//            System.out.println("-----------------");
            emp.add(new Employee(id, name, position, salary));
        }

        //Step5
        rs.close();
        stmt.close();
        conn.close();

        //
        for (Employee e : emp)
            System.out.println("ID: " + e.getId());
        System.out.println("Name: "+emp.toString());
















    }//main
}//Class

