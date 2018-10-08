package bankaccountapp;

public class Savings extends Account {
	// List properties apecific to the Savings account
	// Safety Deposit Box 안전 대여 금고
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	// Constructor to initialize settings for the Savings properties
	// savings account 보통예금(저축예금)
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		safetyDepositBox();
	}
	
	private void safetyDepositBox() {
		safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
	}
	
	// List any methods specific to savings account
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"Your Savings Account Features" + 
				"\n Safety Deposit Box ID: " + safetyDepositBoxID + 
				"\n Safety Deposit Box Key: " + safetyDepositBoxKey
				);
	}
}
