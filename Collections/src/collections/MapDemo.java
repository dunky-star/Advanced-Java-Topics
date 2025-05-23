package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show(){

        Customer c1 = new Customer("Geoffrey","dunky@mail.com", 33);
        Customer c2 = new Customer("Duncan","kaligs@mail.com", 35);
        Customer c3 = new Customer("Arma","army@mail.com", 4);

        Map<String, Customer> mapCustomer = new HashMap<>();
        mapCustomer.put(c1.getEmail(), c1);
        mapCustomer.put(c2.getEmail(), c2);
        mapCustomer.put(c3.getEmail(), c3);

        Customer unknown = new Customer("Customer doesn't exist", "", 0);
        Customer customer = mapCustomer.getOrDefault("dunky1@mail.com", unknown);
        boolean exists = mapCustomer.containsKey("dunky@mail.com");
        System.out.println("Customer from the database: " +customer);
        System.out.println("Customer exists: " +exists);

        for (Map.Entry<String, Customer> entry : mapCustomer.entrySet()){
            System.out.println("Email: " +entry.getKey() + ", Customer: " +entry.getValue());
        }

    }

}
