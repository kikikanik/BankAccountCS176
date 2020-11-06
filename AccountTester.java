
public class AccountTester {

	public static void main(String[] args) {
		BankAccount nina = new BankAccount("Nina Masters", 0001, 1000);
		CheckingAccount john = new CheckingAccount("John Smith", 0002, 500);
		SavingsAccount amy = new SavingsAccount("Amy Smith", 0003, 15000, .035);
		
		//initial print
		System.out.println(nina);
		System.out.println(john);
		System.out.println(amy);
		
		double initialBalance = john.getBalance();
		john.deposit(15000);
		double newBalance = john.getBalance();
		double averageDailyBalance = (initialBalance*15 + newBalance*15)/30;
		john.MonthEnd(averageDailyBalance);
		
		initialBalance = amy.getBalance();
		amy.widthraw(5000);
		newBalance = amy.getBalance();
		averageDailyBalance = (initialBalance*20 + newBalance*10)/30;
		amy.MonthEnd(averageDailyBalance);
		
		//after all new changes print
		System.out.println("Accounts after operations: ");
		System.out.println(nina);
		System.out.println(john);
		System.out.println(amy);
	}

}
