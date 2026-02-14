abstract class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    abstract void calculateInterest();

    void deposit(double amount) {
        balance += amount;
        System.out.println("Updated Balance: " + balance);
    }

    void displayAccountDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    double interestRate = 5.0;

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Savings Interest: " + interest);
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    void calculateInterest() {
        System.out.println("No interest for Current Account");
    }
}

public class Abstraction {

    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("Vamsi", 10000);
        BankAccount acc2 = new CurrentAccount("Ravi", 15000);

        acc1.displayAccountDetails();
        acc1.calculateInterest();
        acc1.deposit(2000);

        System.out.println();

        acc2.displayAccountDetails();
        acc2.calculateInterest();
        acc2.deposit(3000);
    }
}

