/**
 * Created by Thomas Tibebu,
 * Date May 20, 2019
 **/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args){
        /* Creating ArrayList of type "String" which means
         * we can only add "String" elements
         */
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        alist.add("Tom");
        //displaying elements
        System.out.println(alist);
        //Adding "Steve" at the fourth position
        //Since the index starts with 0, index 3 would represent fourth position not 3.
        alist.add(3, "Berry");

        //displaying elements
        System.out.println("Add Berry at position 4 or index 3 : " + alist);
//Removing "Steve" and "Angela"
        alist.remove("Steve");
        alist.remove("Angela");

        //displaying elements
        System.out.println("Remove Steve and Angela from list: " + alist);

        //Removing 3rd element
        alist.remove(2);

        //displaying elements
        System.out.println("Remove index 2 element: "+ alist);

        //displayed the ArrayList elements just by referring the ArrayList instance, not good way
        System.out.println("Displayed the ArrayList elements just by referring the ArrayList instance, ths is not good way : " + alist);
        //iterating ArrayList to displayed the ArrayList elements, its good way
        System.out.println("============================================================================");
        System.out.println("Displayed the ArrayList elements using list iterator, this is a good way : ");
        for (String str: alist){
            System.out.println(str);
        }
        //update or replace specific index element with new value, update index 0 with new element Anne
        alist.set(0,"Anne");
        System.out.println("Displayed the ArrayList elements after set index 0 element with Anne : ");
        for (String str: alist){
            System.out.println(str);
        }
        //display index of elemet, if element not exist in the list it will return -1
        System.out.println("Index of element TOM : " + alist.indexOf("Tom"));
        System.out.println("Index of element Smith, element not in the list : " + alist.indexOf("Smith"));
        alist.add("Tom");
        System.out.println("Displayed the ArrayList elements after set index 0 element with Anne : ");
        for (String str: alist){
            System.out.println(str);
        }
        //display index of elemet, if element not exist in the list it will return -1, if element duplicate return first element index
        System.out.println("Index of element TOM : " + alist.indexOf("Tom"));
        System.out.println("Index of element TOM last appearance: " + alist.lastIndexOf("Tom"));
        System.out.println("Get the element with index 0: " + alist.get(0));
        System.out.println("Get the element with index 1: " + alist.get(1));
        alist.remove(4);
        System.out.println("Displayed the ArrayList elements after remove index 4 element : ");
        for (String str: alist){
            System.out.println(str);
        }
        //show size of our ArrayList
        System.out.println("Size or number of elements of our String ArrayList : " + alist.size());
        //check our ArrayList contain specific element
        System.out.println("Is our ArrayList contain element 'TOM' : " + alist.contains("Tom"));
        System.out.println("Is our ArrayList contain element 'Hannan' : " + alist.contains("Hannan"));
        System.out.println("============================================================================");
        /* Creating ArrayList of type "String" which means
         * we can only add "String" elements
         */
        ArrayList<String> obj = new ArrayList<String>();

        /*This is how we add elements to an ArrayList*/
        obj.add("Ajeet");
        obj.add("Harry");
        obj.add("Chaitanya");
        obj.add("Steve");
        obj.add("Anuj");

        // Displaying elements
        System.out.println("Original ArrayList:");
        for(String str:obj)
            System.out.println(str);

        /* Add element at the given index
         * obj.add(0, "Rahul") - Adding element "Rahul" at first position
         * obj.add(1, "Justin") - Adding element "Justin" at second position
         */
        obj.add(0, "Rahul");
        obj.add(1, "Justin");

        // Displaying elements
        System.out.println("ArrayList after add operation:");
        for(String str:obj)
            System.out.println(str);

        //Remove elements from ArrayList like this
        obj.remove("Chaitanya"); //Removes "Chaitanya" from ArrayList
        obj.remove("Harry"); //Removes "Harry" from ArrayList

        // Displaying elements
        System.out.println("ArrayList after remove operation:");
        for(String str:obj)
            System.out.println(str);

        //Remove element from the specified index
        obj.remove(1); //Removes Second element from the List

        // Displaying elements
        System.out.println("Final ArrayList:");
        for(String str:obj)
            System.out.println(str);

        //Ways of initializing ArrayList
//1. Initialization using Arrays.asList
        System.out.println("Initialization ArrayList using Arrays.asList===============================");
        ArrayList<String> list = new ArrayList<String>(
                Arrays.asList("Pratap", "Peter", "Harsh"));
        System.out.println("Elements are:"+list);
//2. Anonymous inner class method to initialize ArrayList
        System.out.println("Initialization ArrayList using Anonymous inner class method==================");
        ArrayList<String> cities = new ArrayList<String>(){{
            add("Delhi");
            add("Agra");
            add("Chennai");
        }};
        System.out.println("Content of Array list cities:"+cities);
//3. Normal way of ArrayList initialization
        System.out.println("Initialization ArrayList using Normal way of ArrayList==================");
        ArrayList<String> books = new ArrayList<String>();
        books.add("Java Book1");
        books.add("Java Book2");
        books.add("Java Book3");
        System.out.println("Books stored in array list are: "+books);
//4: Use Collections.ncopies
        System.out.println("Initialization ArrayList using Collections.ncopies==================");
        ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));
        System.out.println("ArrayList items: "+intlist);
        ArrayList<String> repeatme = new ArrayList<String>(Collections.nCopies(10, "Thomas"));
        System.out.println("ArrayList items: "+repeatme);
        System.out.println("============================================================================");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);
        System.out.println(numbers);


    }
}
