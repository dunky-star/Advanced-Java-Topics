package collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        collection.add("T");
        collection.add("R");
        collection.add("U");
        collection.add("E");
        for (String coll: collection){
            System.out.println(coll);
        }
    }
}
