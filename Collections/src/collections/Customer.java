package collections;

// How to sort data using comparable interface.

public class Customer implements Comparable<Customer>{
    private String firstName;
    private int age;

    public Customer(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    @Override
    public int compareTo(Customer other) {
        return firstName.compareTo(other.firstName);
    }

    @Override
    public String toString() {
        return firstName ;
    }
}
