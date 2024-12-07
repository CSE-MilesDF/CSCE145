import java.util.Scanner;
import java.util.Random;
public class Homework02 {
	public static final int MAX = 5;
	public static void main(String[] args) {
		// Miles Farmer
		Scanner key = new Scanner(System.in);
	
	
//Starting point for the adventure
	System.out.println("Welcome to the Jungle!");
	
	System.out.println("You are a new explorer in search of prized treasures");
	
	System.out.println("You come to a open area in the Jungle. Ahead are 3 paths, Which path will you take (Enter, 1,2 or 3)?"); 
	int tunnel = key.nextInt();
	//path 1
	if (tunnel ==1) {
		System.out.println("You enter a dungeon with a torch on the wall and grab the torch.");
		System.out.println("Suddenly a goblin jumps out from the shadows! Do you fight or run? (fight/run)");
		key.nextLine();
		String action = key.nextLine();
		
		if(action.equals("fight")) {
			System.out.println("You have decided to fight the goblin!");
            System.out.println("Do you attack with your sword or cast a spell? (sword/spell): ");
String weapon = key.nextLine();
			System.out.println("Are you sure you want to use your sword? (Yes or No)"); 
		String response = key.nextLine(); 
		//boolean expression
		if (weapon.equals("sword") && response.equals("Yes")) {
	         

	          Random r = new Random();
	  		
	  		int choice = r.nextInt(MAX);  //provide a value for 0	1	2	3	4
	  		
	  		String kill = "";
	  		//used a switch to add different words for different case endings
	  		switch(choice) 
	  		{
	  		case 0:
	  			kill = "Success!";
	  			break; 
	  		case 1:
	  			kill = "Fantastic!";
	  			break;
	  		case 2:
	  			kill = "Amazing!";
	  			break;
	  		case 3:
	  			kill = "Wonderful!";
	  		break;
	  		case 4:
	  			kill = "Nice!";
	  			break;
	  		default:
	  			System.out.println("You Failed the to kill the Goblin!");
	  			System.exit(0);
	  		}
	  		
	  		System.out.println("You have successfully killed the goblin! " + kill + "!");
	  		System.out.println("The goblin droppeed a prized Amber Stone. You have found what you were looking for in The Jungle!");
	  		System.out.println("You win the game! CONGRATULATIONS!!");
	  		
	          
	          
	      } else if (weapon.equals("spell")) {
	          System.out.println("Your spell backfires! The goblin defeats you. Game over.");
	      } else {
	          System.out.println("Invalid weapon choice! Game over.");
	      }
	  } else if (action.equals("run"))  {
	      System.out.println("You flee from the goblin and get lost in the woods. You do not survive the jungle. You lose!");
	  } else {
	      System.out.println("Invalid action! Game over! YOU LOSE (differently)");
	      System.exit(0);
	  }
		}
		
		
		
		

		
		
		
	
	
	
	
	
	
	
	//path 2
	else if (tunnel ==2) {
		System.out.println("The ground begins to tremble. Do you walkforward or stay where you are? (Enter Stay or Walk)");
		key.nextLine();
		String decision = key.nextLine();
		
		
		
		
		
		if (decision.equals("Walk")) {
		System.out.println("You walk forward and suddenly the ground crumples underneath you. You fall to your own demise."); 
		System.out.println("Bad Ending: YOU DIED!");
		System.out.println("Try Again!");
		System.exit(0);
	} else if (decision.equals("Stay")) {
		System.out.println("You fall to your death because you decided to not move!");
	System.out.println("An even worse bad ending: YOU PERISHED!");
	}
	else {
	      System.out.println("Invalid action! Game over! YOU LOSE (By using the wrong inputs)");
	      System.exit(0);
	  }
	}
	
	
	
	
	
	
	
	
	//path 3
	else {
		System.out.println("You come up to a  vast waterfall");
		 System.out.println("Do you want to approach the waterfall or continue walking? (Enter waterfall or walking)");
       key.nextLine();
		 String decision = key.nextLine();
		
		if (decision.equals("waterfall")) {
			System.out.println("You find a a hidden path behind the waterfall. As you approach you see light shine upon a rock.");
			System.out.println("Will you approach the rock? (Yes or No)");
			String concept = key.nextLine();
			if (concept.equals("Yes")) {
				System.out.println("You have found treasure beyond your imagination!");
				System.out.println("Congratulations you have beat the Jungle!");
				System.out.println("BEST ENDING");
			}
			else 
			{
				System.out.println("You have decided to walk away out of fear from the waterfall. Exploration Ended! ");
				System.exit(0);
			}
			
		} else if (decision.equals("walking")) {

			System.out.println("You decided to walk forward but quickly become lost.");
			System.out.println("After hours of walking you found yourseld right where you began!");
			System.out.println("You gave up and went home. Try Again because You Lost! ");
			
		}
		else {
		      System.out.println("Invalid action! Game over! YOU LOSE (By using the wrong inputs)");
		      System.exit(0);
		  }
	}
		
	
	//if any wrong code is entered then a path ends the game by using a wrong input
	
	
	
	
	
	
	
	
	}
	}
