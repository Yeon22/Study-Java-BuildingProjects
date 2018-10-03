package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		// Call a method asking for the department return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n"
				+ "1. Sales\n"
				+ "2. Development\n"
				+ "3. Accounting\n"
				+ "0. None\n"
				+ "Enter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "Sales"; }
		else if (depChoice == 2) { return "Development"; }
		else if (depChoice == 3) { return "Accounting"; }
		else { return "None"; }
	}
	
	// Generate a random password
	
	// Set the mailbox(메일함) capacity(용량)
	
	// Set the alternate email(대체 메일)
	
	// Change the password
}
