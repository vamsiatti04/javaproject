class InsufficientFundsException extends Exception {

    InsufficientFundsException(String message) {
        super(message);
    }
}

class AccountService {

    double balance = 5000;

    void withdraw(double amount) throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance");
        }

        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid withdrawal amount");
        }

        balance -= amount;
        System.out.println("Withdrawal successful");
        System.out.println("Remaining Balance: " + balance);
    }
}

public class ExceptionHandling {

    public static void main(String[] args) {

        AccountService account = new AccountService();

        try {

            account.withdraw(7000);

            int x = 10 / 0;
            System.out.println(x);

        } catch (InsufficientFundsException e) {

            System.out.println("Custom Exception: " + e.getMessage());

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");

        } catch (IllegalArgumentException e) {

            System.out.println("Invalid input: " + e.getMessage());

        } finally {

            System.out.println("Transaction completed");
        }

        System.out.println("Program continues");
    }
}

