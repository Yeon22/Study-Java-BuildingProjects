package bankaccountapp;

public class Checking extends Account {
	// List properties apecific to a Checking account
	// Debit Card 직불(현금)카드
	private int debitCardNumber;
	private int debitCardPIN;
	
	// Constructor to initialize checking account properties
	// checking account 당좌 예금 계좌
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	// List any methods apecific to the checking account
	private void setDebitCard() {
		debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
		debitCardPIN = (int)(Math.random() * Math.pow(10, 4));
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Your Checking Account Features" + 
				"\n Debit Card Number: " + debitCardNumber + 
				"\n Debit Card PIN: " + debitCardPIN
				);
	}
}
