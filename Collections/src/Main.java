import collections.CollectionDemo;
import collections.ListDemo;
import generics.GenericList;

public class Main {
    public static void main(String[] args) {
        GenericList<String> list = new GenericList<String>();

        list.add("Geoffrey");
        list.add("Duncan");
        list.add("Lamaro");
        list.add("Mel");

        for (String item : list){
            System.out.println(item);
        }

        CollectionDemo.show();
        ListDemo.show();
    }
}