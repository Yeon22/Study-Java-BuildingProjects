package bankaccountapp;

public class Checking extends Account {
	// List properties apecific to a Checking account
	int debitCardNumber;
	int debitCardPIN;
	
	// Constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		System.out.println("NEW CHECKING ACCOUNT");
	}
	
	// List any methods apecific to the checking account
}
