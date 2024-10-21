// CreditCardDemo.java
// Demo class to test the CreditCard system

public class CreditCardDemo {
    public static void main(String[] args) {
        // Create a Money object for the credit limit
        Money creditLimit = new Money(1000, 0);

        // Create a Person object with address
        Address address = new Address("237J Harvey Hall", "Menomonie", "WI", "54751");
        Person owner = new Person("Diane", "Christie", address);

        // Create a CreditCard object
        CreditCard visa = new CreditCard(owner, creditLimit);

        // Display owner information, balance, and credit limit
        System.out.println(visa.getOwnerInfo());
        System.out.println("Balance: " + visa.getBalance());
        System.out.println("Credit Limit: " + visa.getCreditLimit());

        // Test charging and payments
        Money charge1 = new Money(200, 0);
        Money charge2 = new Money(10, 2);
        Money payment = new Money(25, 0);
        Money charge3 = new Money(990, 0);

        System.out.println("\nAttempt to charge " + charge1);
        visa.charge(charge1);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("\nAttempt to charge " + charge2);
        visa.charge(charge2);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("\nAttempt to make a payment of " + payment);
        visa.makePayment(payment);
        System.out.println("Balance: " + visa.getBalance());

        System.out.println("\nAttempt to charge " + charge3);
        visa.charge(charge3);
        System.out.println("Balance: " + visa.getBalance());
    }
}
