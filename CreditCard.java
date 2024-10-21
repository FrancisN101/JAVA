// CreditCard.java
// This class models a credit card with an owner, balance, and credit limit

public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    // Constructor with Person and Money objects
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.balance = new Money(0, 0);
        this.creditLimit = new Money(creditLimit);
    }

    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    // Getter for owner information (as a string)
    public String getOwnerInfo() {
        return owner.toString();
    }

    // Method to charge an amount to the credit card
    public void charge(Money amount) {
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0) {
            balance = newBalance;
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    // Method to make a payment on the credit card
    public void makePayment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
