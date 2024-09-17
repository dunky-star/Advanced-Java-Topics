import collections.*;
import generics.GenericList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      //  GenericList<String> list = new GenericList<String>();
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Geoffrey", "geo@mail.com" ,29));
        customers.add(new Customer("Duncan", "dunky@yymail.com",30));
        customers.add(new Customer("Arma", "larmy@yy.com",3));
        customers.add(new Customer("Qwerty", "be@mail.com",33));

//        list.add("Geoffrey");
//        list.add("Duncan");
//        list.add("Lamaro");
//        list.add("Mel");

//        for (String item : list){
//            System.out.println(item);
//        }
        //Collections.sort(customers); // Sorting customer first name using Comparable
        Collections.sort(customers, new EmailComparator()); // Sorting customers by email using Comparator.

        System.out.println("Sorted customer list: " +customers);
        CollectionDemo.show();
        ListDemo.show();
        QueueDemo.show();
    }
}