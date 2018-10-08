package bankaccountapp;

public class Checking extends Account {
	// List properties apecific to a Checking account
	int debitCardNumber;
	int debitCardPIN;
	
	// Constructor to initialize checking account properties
	// checking account 당좌 예금 계좌
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
		System.out.println("NEW CHECKING ACCOUNT");
	}
	
	// List any methods apecific to the checking account
}
