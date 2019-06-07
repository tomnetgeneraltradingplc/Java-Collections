package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class SortingArrayListObjectWithComparable {
    //we need to sort the ArrayList<Student> based on the student Age property
    //If we sort object only by one field we can use Comparable
    public static void main(String args[]){
        ArrayList<Student> arraylist = new ArrayList<Student>();
        arraylist.add(new Student(223, "Chaitanya", 26));
        arraylist.add(new Student(245, "Rahul", 24));
        arraylist.add(new Student(209, "Ajeet", 32));

        Collections.sort(arraylist);

        for(Student str: arraylist){
            System.out.println(str);
        }
    }
}
