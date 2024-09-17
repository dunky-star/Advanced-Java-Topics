package collections;

// How to sort data using comparable interface.

public class Customer implements Comparable<Customer>{
    private String firstName;
    private String email;
    private int age;

    public Customer(String firstName, String email, int age) {
        this.firstName = firstName;
        this.email = email;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
