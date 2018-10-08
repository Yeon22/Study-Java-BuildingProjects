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
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeosit = Double.parseDouble(accountHolder[3]);
//			System.out.println(name + " " + sSN + " " + accountType + " $" + initDeosit);
			
			if (accountType.equals("Savings")) {
				System.out.println("OPEN A SAVINGS ACCOUNT");
			} else if (accountType.equals("Checking")) {
				System.out.println("OPEN A CHECKING ACCOUNT");
			} else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
	}

}
