package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show(){
        List<String> list = new ArrayList<>();
        list.add("Abby");
        list.add("Lilly");
        list.add(0, "!");
        list.set(1, "a+");
        Collections.addAll(list, "aa", "bb", "cc");
        System.out.println("\nList:" +list);
        System.out.println("Item at index 0: " +list.get(0));
        System.out.println("Sublist: " +list.subList(0, 3)); // From index 0 to index 2 (exclude index 3)
    }
}
