package bankaccountapp;

public class Savings extends Account {
	// List properties apecific to the Savings account
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	// Constructor to initialize settings for the Savings properties
	public Savings(String name) {
		super(name);
		System.out.println("NEW SAVINGS ACCOUNT");
	}
	
	// List any methods specific to savings account
}
