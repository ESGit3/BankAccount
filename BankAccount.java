public class BankAccount {
    private double balance;
    private int accountID;
    private String password;

    public BankAccount(int ID, String pass) {
        accountID = ID;
        password = pass;
        balance = 0;
    }

    public int getAccountID() {
        return accountID;
    }

    public double getBalance() {
        return balance;
    }

    public void setPassword(String newPassword) {
        password = newPassword;
    }

    public boolean deposit(double amount) {
        if (amount < 0) return false;
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount < 0 || balance - amount < 0) return false;
        balance -= amount;
        return true;
    }

    public String toString() {
        return ("#" + Integer.toString(accountID) + "\t$" + Double.toString(balance));
    }

    private boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public boolean transferTo(BankAccount other, double amount, String password) {
        if (authenticate(password) && withdraw(amount)) {
            if (deposit(amount)) {
                this.withdraw(amount);
                other.deposit(amount);
                return true;
            }
        }
        return false;
    }
}