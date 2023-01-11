import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        // standard Java array
        String[] zeroList = new String[5];

        // Big advantage: I don't have to provide a size

        // List is an interface
        //                          // ArrayList is a class that implements List
        List<String> firstList = new ArrayList<String>();
        firstList.add("Ken");
        firstList.add("Tina");
        firstList.add("Josh");
        firstList.add("Tyler");
        firstList.add("Susan");
        firstList.add("Usman");
        System.out.println("first list is: " + firstList);
        String onePerson = firstList.get(2);
        System.out.println(onePerson);

        List<String> secondList = new LinkedList<String>();
        secondList.add("Ken");
        secondList.add("Tina");
        secondList.add("Josh");
        secondList.add("Tyler");
        secondList.add("Susan");
        secondList.add("Usman");
        System.out.println("second list is: " + secondList);
        onePerson = secondList.get(3);
        System.out.println(onePerson);

        Iterator<String> it = secondList.iterator();
        while (it.hasNext()) {
            String temp = it.next();
            System.out.println(temp);
        }



        // Set interface
        //      HashSet class implements Set
        //      TreeSet class implements Set

        // A set is "like" a list, except for a few things:
        //      no indexing / no index numbers
        //      no duplicate items allowed
        Set<String> firstSet = new HashSet<>();
        firstSet.add("Interstellar");
        firstSet.add("Vacation");
        firstSet.add("Toy Story");
        firstSet.add("Frozen");
        firstSet.add("Finding Nemo");

        System.out.println(firstSet);
        firstSet.add("Frozen");
        System.out.println(firstSet);

        // Set will not allow duplicates
        // Very handy when you want to eliminate duplicates/repeated items
        // Example: someone submits a form 6 times, but we only want to count them once

        // int i = 0
        // while i < length of array
        //      print i
        //      i++

        // can't do this: firstSet.get(2);

        // create an iterator variable, initialize it to first item in the set
        Iterator<String> itr = firstSet.iterator();
        // while there are more places to go
        while (itr.hasNext()) {
            // go to next spot, and save out the value
            String name = itr.next();
            System.out.println("we got " + name);
        }

        // check out picture on p. 675 of printed packet I gave you

        // first Set of all words in the English language dictionary
        // second Set of all words in my document (not all spelled correctly)
        // secondSet - firstSet --> any words that are not in dict (misspelled)


    }
}