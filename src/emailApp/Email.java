package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity;
	private int defaultPasswordLenght = 10;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created: " + this.firstName + " " + this.lastName);
			
		//Cal a mathod asking for the department - return the department
		this.department = setDepartment();
		System.out.println("Department: " + department);
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLenght);
		System.out.println("Your password: " + password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("Your email is: " + email);
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "sales";}
		else if (depChoice == 2) {return "dev";}
		else if (depChoice == 3) {return "acct";}
		else {return "";}
	}
	// Generate a random password
	private String randomPassword(int lenght) {
		String passwordSet = "ABCDEFGHIJKLMNOPRSTUWXYZ0123456789!@#$%";
		char[] password = new char[lenght];
		for (int i=0; i<lenght; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	// Get the mailbox capacity
	public int getMailboxCapacity() {return mailboxCapacity;}
	
	// Get alternate email 
	public String getAlternateEmail() {return alternateEmail;}
	
	// Get password
	public String getPassword() {return password;}
	
	
}
