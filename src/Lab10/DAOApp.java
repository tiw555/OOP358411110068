package Lab10;

import java.util.List;

public class DAOApp {
    private static void main(String[] args) {

        empDAOImpl dao = empDAOImpl.getInstant();

        //GET_ALL_EMP
        List<Employee> allEmp = dao.getALLEmp();

        System.out.println("-----Data in Database----");
        for (Employee emp : dao.getALLEmp()) {
            System.out.println(emp.toString());
        }
        System.out.println("-------------------");

        //ADD_EMP
        Employee newEmp = new Employee(
                104,
                "tiw",
                "office",
                30000);
               // dao.addEmp(newEmp);
              //  showAllData (dao);

                //FIND_BY_ID
        Employee e = dao.getEmpById(100);
        System.out.println(e.toString());

        //UPDATE_EMP
        e.setSalary(30000);
        dao.updateEmp(e);

     //
        dao.deleteEmp(100);

    }
}