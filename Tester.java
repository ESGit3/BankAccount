public class Tester {
    public static void main(String[] args) {
        BankAccount test = new BankAccount(1, "password");
        System.out.println(test.getAccountID());
        System.out.println(test.getBalance());
        System.out.println(test.deposit(-4));
        System.out.println(test.deposit(12345.67));
        System.out.println(test.withdraw(-5432.1));
        System.out.println(test.withdraw(56789));
        System.out.println(test.withdraw(2345.67));

        System.out.println(test.toString());
    }
}