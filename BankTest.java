class BankAccount {
    private String accountNumber;
    private double balance;
    private static int accountCount = 0;
    private final String accountIdentifier;

    BankAccount(String accountNumber, double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        accountCount++;
        this.accountIdentifier = "ACC" + accountCount;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive");
            return;
        }
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive");
        } else if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
    }

    double getBalance() {
        return balance;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    String getAccountIdentifier() {
        return accountIdentifier;
    }

    static int getAccountCount() {
        return accountCount;
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", 5000);
        account.deposit(1500);
        account.withdraw(2000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Identifier: " + account.getAccountIdentifier());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Total Accounts: " + BankAccount.getAccountCount());
    }
}
