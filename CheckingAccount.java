
public class CheckingAccount extends BankAccount{

	//constructors
	public CheckingAccount(String cName, long checkingAccNumber, double cBalance) {
		setName(cName);
		setAccountNumber(checkingAccNumber);
		setBalance(cBalance);
	}
	
	//methods
	public void MonthEnd(double averageDailyBalance) {
		if (averageDailyBalance <1500)
			this.setBalance(this.getBalance()-20);
	}
	
	//to String
	public String toString() {
		return super.toString();
	}
}

