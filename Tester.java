public class Tester {
    public static void main(String[]args){
        BankAccount b1 = new BankAccount(1000001, "abc123");
        BankAccount b2 = new BankAccount(1000231, "abcasdg23");

        System.out.println("Account b1:");
        b1.deposit(3000.0);
        b2.deposit(5000.0);

        System.out.println(b2.transferTo(b1, 1000, "abcasdg23"));
        System.out.println(b1.getBalance());
    }
}