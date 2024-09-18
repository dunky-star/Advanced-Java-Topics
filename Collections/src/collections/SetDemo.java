package collections;

import java.util.*;

public class SetDemo {

    public static void show(){
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "Geoffrey", "The", "Sky", "Is", "Blue");

        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "Duncan", "Kaligs", "The", "Sky", "Is", "Blue");

        Collection<String> allList = new ArrayList<>();

        allList.addAll(list1);
        allList.addAll(list2);
        System.out.println("Array List with Dulicate: " +allList);

        Set<String> set = new LinkedHashSet<>(allList); // Removing duplicate and maintains order however,
                                                        // it's slower than HashSet implementation.
        System.out.println("Duplicate removed utilizing set: " +set);

    }
}
