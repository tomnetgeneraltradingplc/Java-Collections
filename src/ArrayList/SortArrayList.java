package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
public class SortArrayList {
    public static void main(String args[]){
        ArrayList<String> listofcountries = new ArrayList<String>();
        listofcountries.add("India");
        listofcountries.add("US");
        listofcountries.add("China");
        listofcountries.add("Denmark");

        /*Unsorted List*/
        System.out.println("Before Sorting:");
        for(String counter: listofcountries){
            System.out.println(counter);
        }
        /* Sort statement*/
        Collections.sort(listofcountries);
        /* Sorted List*/
        System.out.println("======================");
        System.out.println("After Sorting:");
        for(String counter: listofcountries){
            System.out.println(counter);
        }ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(11);
        arraylist.add(2);
        arraylist.add(7);
        arraylist.add(3);
        /* ArrayList before the sorting*/
        System.out.println("Before Sorting:");
        for(int counter: arraylist){
            System.out.println(counter);
        }

        /* Sorting of arraylist using Collections.sort*/
        Collections.sort(arraylist);

        /* ArrayList after sorting*/
        System.out.println("=============================");
        System.out.println("After Sorting:");
        for(int counter: arraylist){
            System.out.println(counter);
        }
    }
}
