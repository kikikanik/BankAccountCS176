
public class SavingsAccount extends BankAccount{
	
	//variables
	private double InterestRate;

	//constructors
	public SavingsAccount() {
	}

	public SavingsAccount(String sName, long savingsAccNumber, double sBalance, double interestRate) {
		setName(sName);
		setAccountNumber(savingsAccNumber);
		setBalance(sBalance);
		this.InterestRate = interestRate;
	}
	
	//methods
	public void MonthEnd(double averageDailyBalance) {
		deposit(InterestRate * averageDailyBalance);
	}

	//setter&getter
	public void setInterest(float InterestRate) {
		this.InterestRate = InterestRate;
	}

	public double getInterest() {
		return InterestRate;
	}
	
	//to String
	public String toString() {
		return super.toString() + " Interest rate: " + InterestRate;
	}
}
