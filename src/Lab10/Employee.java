package Lab10;

public class Employee {
    private int id;
    private String name;
    private String position;
    private double salary;

    //constructor
    public Employee(int id,String name,String position,double salary){
        this.id=id;
        this.name=name;
        this.position=position;
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

    public String getPosition() {
        return position;
    }

    public void setPossition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}//Employee

