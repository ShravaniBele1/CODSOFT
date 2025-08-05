package atm_machine;

public class User_BankAccount {
	private Double balance;
	private String account_holder;
	private String account_number;
	private int securityPin;
	
	public User_BankAccount(Double balance, String account_holder, String account_number, int securityPin) {
		super();
		this.balance = balance;
		this.account_holder = account_holder;
		this.account_number = account_number;
		this.securityPin = securityPin;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getAccount_holder() {
		return account_holder;
	}

	public String getAccount_number() {
		return account_number;
	}

	public int getSecurityPin() {
		return securityPin;
	}
}
