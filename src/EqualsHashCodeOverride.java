/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class EqualsHashCodeOverride {
    public static void main(String args[]){
        Employee emp1 = new Employee("Thomas",20,95000);
        Employee emp2 = new Employee("Thomas",20,95000);
        Employee emp3 = new Employee("Jerry",20,95000);
        //if we don't implement equals() and hashCode() empl and emp2 are not equal and return false,
        // because, it compare the memory address of emp1 emp2, not compare
        //content of the object data->name,age,salary
        //test emp1 and emp2 are the same/equal
        System.out.println(emp1.equals(emp2));
        System.out.println(emp2.equals(emp1));
        //test emp1 and emp3 are the same/equal
        System.out.println(emp1.equals(emp3));
        System.out.println(emp3.equals(emp1));

    }
}
