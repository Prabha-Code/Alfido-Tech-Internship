public class Task3 {
    private String accountHolder;
    private double balance;

    public Task3(String holder, double initialDeposit) {
        this.accountHolder = holder;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient funds or invalid amount.");
    }

    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        Task3 acc = new Task3("Java Developer", 50000.0);
        acc.deposit(20000);
        acc.withdraw(10000);
        acc.displayDetails();
    }
}
