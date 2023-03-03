

public class Employee {
    private String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString(){
        return name + " " + department + " " + salary;
    }
}
