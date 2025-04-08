package hello.world;
import java.util.Scanner;
public class Bank {
	static double balance=1000;
	public static void deposit(double amount) 
	{
		 
        if (amount > 0) 
        {
            balance = balance + amount;
            System.out.println("Deposited: " + amount + ". Current balance: " + balance);
        } 
     }
	public static void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance= balance- amount;
            System.out.println("Withdrew: " + amount + ". Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
  
	public static void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		  System.out.println("options are:");
          System.out.println("1. Deposit");
          System.out.println("2. Withdraw");
          System.out.println("3. Check Balance");
          System.out.print("Enter your choice: ");
          int choice=sc.nextInt();
          switch(choice)
          {
          case 1:
        	  System.out.print("Enter the deposit amount: ");
              double depositAmount = sc.nextDouble();
              deposit(depositAmount);
              break;
              
             case 2:
                  System.out.print("Enter the withdrawal amount: ");
                  double withdrawalAmount = sc.nextDouble();
                  withdraw(withdrawalAmount);
                  break;
                  
             case 3:
                 checkBalance();
                 break;

             default:
                 System.out.println("Invalid choice. Please try again.");
          
          }
	}

}
