package collections;

/*
* It is a good idea to always program to interface.
* This makes our codes become loosely coupled.
* NB: Collections don't support indexing.
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();

        Collections.addAll(collection, "T", "R", "U", "E", "-", "T", "H", "A", "T");
        boolean containsA = collection.contains("a");
        collection.remove("E");


        //collection.clear();
        System.out.println("Collection contains A? " +containsA);
        // To convert collection to an Array of String
        String[] toArrString = collection.toArray(new String[0]);
        System.out.println(Arrays.toString(toArrString));
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
        System.out.printf("Comparing objects by reference: %s\n",collection == other); // Comparing objects by reference is [False]
        System.out.printf("Comparing objects by value: %s",collection.equals(other)); // Comparing objects by value is [True]

    }
}
