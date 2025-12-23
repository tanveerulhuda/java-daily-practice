class BankAccount {
    private String accountHolder;
    private double balance;

    // Getter & Setter
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}

public class Day13_Encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountHolder("Tanveer");
        acc.deposit(5000);

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Balance: " + acc.getBalance());
    }
}
