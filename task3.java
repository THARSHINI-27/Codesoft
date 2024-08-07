package codsoft;
import java.util.Scanner;
class BankAccount {

 private double balance;

 public BankAccount(double initialBalance) {

     this.balance = initialBalance;

 }
 public double getBalance() {

     return balance;

 }
 public void deposit(double amount) {

     if (amount > 0) {

         balance += amount;

         System.out.println("Successfully deposited: $" + amount);

     } else {

         System.out.println("Invalid deposit amount.");

     }

 }
 public void withdraw(double amount) {

     if (amount > 0 && amount <= balance) {

         balance -= amount;

         System.out.println("Successfully withdrawn: $" + amount);

     } else {

         System.out.println("Invalid or insufficient funds for withdrawal.");

     }

 }

}
class ATM {

 private BankAccount account;
 public ATM(BankAccount account) {

     this.account = account;

 }
 public void deposit(double amount) {

     account.deposit(amount);

 }
 public void withdraw(double amount) {

     account.withdraw(amount);

 }
 public void checkBalance() {

     System.out.println("Current balance: $" + account.getBalance());

 }

}

public class task3 {

 public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);

     BankAccount account = new BankAccount(1000);  // Initialize the account with an initial balance

     ATM atm = new ATM(account);

     boolean exit = false;
     while (!exit) {

         System.out.println("\nATM Menu:");

         System.out.println("1. Check Balance");

         System.out.println("2. Deposit");

         System.out.println("3. Withdraw");

         System.out.println("4. Exit");

         System.out.print("Choose an option: ");

         int choice = scanner.nextInt();

         double amount;
         switch (choice) {

             case 1:

                 atm.checkBalance();

                 break;

             case 2:

                 System.out.print("Enter the amount to deposit: ");

                 amount = scanner.nextDouble();

                 atm.deposit(amount);

                 break;

             case 3:

                 System.out.print("Enter the amount to withdraw: ");

                 amount = scanner.nextDouble();

                 atm.withdraw(amount);

                 break;

             case 4:

                 exit = true;

                 System.out.println("Exiting ATM. Have a nice day!");

                 break;

             default:

                 System.out.println("Invalid choice. Please try again.");
         }

     }
     scanner.close();

 }

}
