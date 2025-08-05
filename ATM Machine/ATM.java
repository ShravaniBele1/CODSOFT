package atm_machine;

public class ATM {
	private User_BankAccount account;
	
	public ATM(User_BankAccount account) {
        this.account = account;
    }

	public void withdraw(double amount){
		if(amount <= account.getBalance())
		{
			account.setBalance(account.getBalance()-amount);
			System.out.println("Rs."+amount+" withdrawn successfully!");
		}
		else
		{
			System.out.println("Insufficient balance.");
		}
	}
	
	public void deposit(double amount){
		account.setBalance(account.getBalance()+amount);
		System.out.println("Rs."+amount+" deposited successfully! ");
	}
	
	public void checkBalance() {
	        System.out.println("Current Balance: ₹" + account.getBalance());
	}

}
