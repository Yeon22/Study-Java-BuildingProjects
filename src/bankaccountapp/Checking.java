package bankaccountapp;

public class Checking extends Account {
	// List properties apecific to a Checking account
	// Debit Card 직불(현금)카드
	int debitCardNumber;
	int debitCardPIN;
	
	// Constructor to initialize checking account properties
	// checking account 당좌 예금 계좌
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
	}
	
	// List any methods apecific to the checking account
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Checking");
	}
}
