package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email eml = new Email("John", "Smith");
		
		eml.setAlternateEmail("js@gmail.com");
		System.out.println("Your alternate email is: " + eml.getAlternateEmail());
	}

}
