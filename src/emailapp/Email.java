package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		// Call a method asking for the department return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		// Call a method that return a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
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
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			// rand는 0 ~ (passwordSet.length() - 1)
			int rand = (int) (Math.random() * passwordSet.length());
			// passwordSet.charAt(rand)는 passwordSet의 rand번 자리의 문자
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set the mailbox(메일함) capacity(용량)
	
	// Set the alternate email(대체 메일)
	
	// Change the password
}
