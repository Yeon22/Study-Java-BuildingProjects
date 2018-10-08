package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		Checking chkacc1 = new Checking("Tom Wilson", "321456789", 1500);
		
		Savings savacc1 = new Savings("Rich Lowe", "456657897", 2500);
		
		chkacc1.showInfo();
		
		System.out.println("************************************");
		
		savacc1.showInfo();
		
		// Read a CSV file then create new accounts based on that data
	}

}
