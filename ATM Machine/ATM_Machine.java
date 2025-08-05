package atm_machine;
import java.util.Scanner;

public class ATM_Machine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		User_BankAccount user = new User_BankAccount(10000.0,"Shravani","U123456789",1234);
		ATM atm = new ATM(user);
		
        System.out.println("Welcome to the ATM");
        
        System.out.print("Enter Account Number : ");
        String inputAccNo = sc.nextLine();
        
        System.out.print("Enter PIN : ");
        int inputPin = sc.nextInt();
        
        if(!inputAccNo.equals(user.getAccount_number()) || inputPin != (user.getSecurityPin()))
        {
        	System.out.println("Invalid account number or PIN. Access denied.");
        	return;
        }
        
        int choice;
        do {
	        System.out.println("\nselect option:");
	        System.out.println("1. Withdraw");
	        System.out.println("2. Deposit");
	        System.out.println("3. Check Balance");
	        System.out.println("4. Exit");
	        System.out.print("Enter your choice :");
	        choice = sc.nextInt();
	        
	        switch(choice) {
		        case 1: System.out.print("Enter amount to withdraw: ");
		    			double wAmount = sc.nextDouble();
		    			atm.withdraw(wAmount);
		        break;
		        
		        case 2: System.out.print("Enter amount to deposit: ");
						double dAmount = sc.nextDouble();
						atm.deposit(dAmount);
		        break;
		        
		        case 3:atm.checkBalance();
		        break;
		        
		        default:
		        	System.out.println("Wrong choice !\nSelect correct option.");
		    }
		}while(choice!=4);
	
	}
}
