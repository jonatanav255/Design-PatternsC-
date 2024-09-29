
import java.math.BigDecimal;

import Encapsulation.BadBankClass;

public class App {

    public static void main(String[] args) throws Exception {

        // Initial greeting message
        System.out.println("Hello, World!");

        // Create a BadBankClass object with an initial balance of 200
        // We are passing "200" as a string to the BigDecimal constructor to ensure precision
        BadBankClass newBankClass = new BadBankClass(new BigDecimal("200"));

        // Display the current balance using getBalance()
        System.out.println("Initial balance: " + newBankClass.getBalance());

        // Withdraw 100 from the balance
        // This subtracts 100 from the balance and ensures there are sufficient funds
        newBankClass.withdraw(new BigDecimal("100"));
        // Display the balance after the withdrawal
        System.out.println("Balance after withdrawal: " + newBankClass.getBalance());

        // Deposit 50 into the account
        // This adds 50 to the current balance
        newBankClass.deposit(new BigDecimal("50"));
        // Display the balance after the deposit
        System.out.println("Balance after deposit: " + newBankClass.getBalance());
    }
}
