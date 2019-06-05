import java.util.ArrayList;

/**
 * Created by Thomas Tibebu,
 * Date May 26, 2019
 **/
public class FindLengthOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.println("Initial size: " + al.size());
        al.add(1);
        al.add(13);
        al.add(45);
        al.add(44);
        al.add(99);
        System.out.println("Size after few additions: " + al.size());
        System.out.println("ArrayList after adding element: ");
        for (int num : al) {
            System.out.println(num);
        }
        al.remove(1);
        al.remove(2);
        System.out.println("Size after remove operations: " + al.size());
        System.out.println("Final ArrayList: ");
        for (int num : al) {
            System.out.println(num);
        }
    }
}