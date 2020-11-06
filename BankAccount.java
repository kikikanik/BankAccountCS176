import java.text.* ;

public class BankAccount {
	
	//variables
	private String name;
	private long accountNumber;
	private double balance;

	//getters&setters
	public double getBalance() {   
		return balance;
	}
	public void setBalance(double aBalance) {
		balance = aBalance;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber (long anAccountNumber) {
		accountNumber = anAccountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name= aName;
	}

	//constructors
	public BankAccount() 
	{

	}
	public BankAccount(String name, long accountNumber, double balance) {
		this.name =name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	//methods
	public void deposit (double amount) {
		balance = balance + amount;
	}
	public void widthraw (double amount) {
		balance = balance - amount; 
	}

	//to string
	public String toString() {
		NumberFormat formatter = NumberFormat.getCurrencyInstance();

		return "Name: " + name + " Account Number: " + accountNumber + " Balance: " + formatter.format(balance);
	}

}
