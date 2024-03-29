package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class SortArrayListInDescendingOrder {
    public static void main(String args[]) {
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("AA");
        arraylist.add("ZZ");
        arraylist.add("CC");
        arraylist.add("FF");

        /*Unsorted List: ArrayList content before sorting*/
        System.out.println("Before Sorting:");
        for (String str : arraylist) {
            System.out.println(str);
        }

        /* Sorting in decreasing order*/
        Collections.sort(arraylist, Collections.reverseOrder());
        /* Option 2 Sorting in decreasing order*/
//        Collections.sort(arraylist);
//        Collections.reverse(arraylist);


        /* Sorted List in reverse order*/
        System.out.println("===============================");
        System.out.println("ArrayList in descending order:");
        for (String str : arraylist) {
            System.out.println(str);
        }
    }
}
