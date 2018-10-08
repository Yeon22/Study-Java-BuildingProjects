package bankaccountapp;

import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		String file = "C:\\Users\\수연\\eclipse-workspace\\JavaProjects\\src\\bankaccountapp\\NewBankAccounts.csv";
		
		/*
		Checking chkacc1 = new Checking("Tom Wilson", "321456789", 1500);
		Savings savacc1 = new Savings("Rich Lowe", "456657897", 2500);

		savacc1.compound();
		
		savacc1.showInfo();
		System.out.println("************************************");
		chkacc1.showInfo();
		*/
		
		// Read a CSV file then create new accounts based on that data
		List<String[]> newAccountHolder = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolder) {
			System.out.println("NEW ACCOUNT");
			System.out.println(accountHolder[0]);
			System.out.println(accountHolder[1]);
			System.out.println(accountHolder[2]);
			System.out.println(accountHolder[3]);
		}
	}

}
