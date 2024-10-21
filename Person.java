// Person.java
// This class models a person with a name and an address

public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    // Constructor
    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // Method to return the person information as a string
    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + address.toString();
    }
}
