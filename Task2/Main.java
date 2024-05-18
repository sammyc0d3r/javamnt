package Task2;

public class Main {

    public static void main(String[] args) {
        Account myAccount = new Account("450", 1000, "abdisamad omar");
        System.out.println("Initial balance: " + myAccount.checkBalance());

        myAccount.deposit(500);
        myAccount.withdraw(200);
        System.out.println("Account balance: " + myAccount.checkBalance());

        SavingAccount savingAccount = new SavingAccount("5405", 2840, "abdisamad omar");
        savingAccount.deposit(0);
        savingAccount.withdraw(5000);
        System.out.println("Saving Account balance: " + savingAccount.checkBalance());
    }
}
