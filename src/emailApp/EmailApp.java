package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Marek", "Hoang");
		
		em1.setAlternateEmail("mh@email.com");
		System.out.println("Your alternate email is: " + em1.getAlternateEmail());
		
		em1.setMailboxCapacity(10);
		System.out.println("Your email capacity is: " + em1.getMailboxCapacity());
		
		em1.changePassword("blabla");
		System.out.println("Your password is: " + em1.getPassword());
		
	}
}
