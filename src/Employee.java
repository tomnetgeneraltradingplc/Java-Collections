/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class Employee {
    private String name;
    private int age;
    private double salary;
    public Employee(String name, int age, double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
    @Override
    public boolean equals(Object obj){
        if(this==obj) return true;// both this and obj point the same memory address
        if(obj==null || obj.getClass() != this.getClass()) return false;// check both object instance of same class
        Employee emp = (Employee) obj;// cast obj into Employee
        return emp.name.equals(this.name) && emp.age == this.age && emp.salary ==this.salary;// compare each field
    }
    @Override
    public int hashCode(){
        int result  = 17;
        result  = 31 * result + name.hashCode();
        result = 31 + result + age;
        result = 31 * result + (int) salary;
        return result;
    }
}
