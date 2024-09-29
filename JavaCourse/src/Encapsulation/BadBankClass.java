package Encapsulation;

import java.math.BigDecimal;

public class BadBankClass {

    // Private field to store the balance as a BigDecimal for precise financial calculations
    private BigDecimal balance;

    // Constructor that initializes the balance with a provided value
    // It checks that the initial balance is greater than zero
    public BadBankClass(BigDecimal balance) {
        if (balance.compareTo(BigDecimal.ZERO) <= 0) {
            // If the initial balance is zero or negative, throw an exception
            throw new IllegalArgumentException("Initial balance must be positive");
        }
        // If valid, set the balance
        this.balance = balance;
    }

    // Getter method to retrieve the current balance
    public BigDecimal getBalance() {
        return balance;
    }

    // Method to deposit a positive amount to the balance
    public void deposit(BigDecimal amount) {
        // Check if the amount is positive using a helper method
        validatePositiveAmount(amount);
        // Add the deposit amount to the current balance
        this.balance = this.balance.add(amount);
    }

    // Method to withdraw a specific amount from the balance
    public void withdraw(BigDecimal amount) {
        // Check if the amount to withdraw is positive
        validatePositiveAmount(amount);
        // Ensure that the withdrawal does not exceed the current balance
        if (amount.compareTo(balance) > 0) {
            // Throw an exception if there are insufficient funds
            throw new IllegalArgumentException("Insufficient funds");
        }
        // Subtract the withdrawal amount from the current balance
        this.balance = this.balance.subtract(amount);
    }

    // Private helper method to ensure the amount is positive
    // This is reused by both deposit() and withdraw() to avoid code duplication
    private void validatePositiveAmount(BigDecimal amount) {
        // If the amount is less than or equal to zero, throw an exception
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }
}
