// Money.java
// This class models money with a value in dollars and cents

public class Money implements Comparable<Money> {
    private int dollars;
    private int cents;

    // Constructor with parameters
    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    public int getDollars() {
        return dollars;
    }

    public int getCents() {
        return cents;
    }

    // Method to return the Money object as a String
    @Override
    public String toString() {
        return String.format("$%d.%02d", dollars, cents);
    }

    // Equals method to compare two Money objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Money money = (Money) obj;
        return dollars == money.dollars && cents == money.cents;
    }

    // CompareTo method to compare two Money objects
    @Override
    public int compareTo(Money other) {
        if (this.dollars != other.dollars) {
            return this.dollars - other.dollars;
        } else {
            return this.cents - other.cents;
        }
    }

    // Method to add an amount of Money
    public Money add(Money other) {
        int newCents = this.cents + other.cents;
        int newDollars = this.dollars + other.dollars + newCents / 100;
        newCents %= 100;
        return new Money(newDollars, newCents);
    }

    // Method to subtract an amount of Money
    public Money subtract(Money other) {
        int totalCents1 = this.dollars * 100 + this.cents;
        int totalCents2 = other.dollars * 100 + other.cents;
        int diff = totalCents1 - totalCents2;
        return new Money(diff / 100, diff % 100);
    }
}
