// Address.java
// This class models an address with street, city, state, and zipcode

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;

    // Constructor
    public Address(String street, String city, String state, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    // Method to return the address as a string
    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipcode;
    }
}
