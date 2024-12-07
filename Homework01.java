import java.util.Scanner; 
public class Homework01 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		//Miles Farmer 
		
		
		
		// Asking for inputs
        System.out.println("Enter your first name: ");
        String firstName = key.nextLine();
        
        System.out.println("Enter your last name: ");
        String lastName = key.nextLine();
        
        System.out.println("Enter your age: ");
        int age = key.nextInt();
        key.nextLine();  
        
        System.out.println("Enter your phone number (without dashes or parentheses): ");
        String phoneNumber = key.nextLine();
        
        System.out.println("Enter your major: ");
        String major = key.nextLine();
        
        System.out.println("Enter your year (Freshman, Sophomore, Junior, Senior): ");
        String year = key.nextLine();
        
        System.out.println("Enter today's date (mm/dd/yyyy): ");
        String todaysDate = key.nextLine();
        
        // Asking 3 more questions
        System.out.println("Enter your favorite food: ");
        String food = key.nextLine();
        
        System.out.println("Enter your favorite hobby: ");
        String hobby = key.nextLine();
        
        System.out.println("Enter your favorite song: ");
        String song = key.nextLine();
        
        // calculate birth year
        int currentYear = 2024;  //  current year is 2024
        int birthYear = currentYear - age;

        // Modify date to European format  like (dd.mm.yyyy)
        String[] dateParts = todaysDate.split("/");
        String europeanDate = dateParts[1] + "." + dateParts[0] + "." + dateParts[2];

        // Modify phone number format to (xxx)xxx-xxxx
        String formattedPhone = "(" + phoneNumber.substring(0, 3) + ")" + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6);

        // Displaying an interesting introduction about the user
        System.out.println("User Introduction:");
        System.out.println("Here is a quick introduction for " + firstName + " " + lastName + ".");
        System.out.println("You are " + age + " years old, and were born in the year " + birthYear + ".");
        System.out.println("You currently study " + major + " and are a " + year + "  at UofSC.");
        System.out.println("Your phone number is " + formattedPhone + " and today's date in the European format is " + europeanDate + ".");
        System.out.println("You're favorite food is " + food + ".");
        System.out.println("In your free time, you enjoy " + hobby + ".");
        System.out.println("Also, your favorite song is " + song + "!");
        System.out.println("You are now officially a Gamecock!"); 
    
		
		
		
		
	}

}
