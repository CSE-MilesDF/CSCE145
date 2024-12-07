import java.util.Random;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
    	//Miles Farmer
        Scanner key = new Scanner(System.in);
        Random random = new Random();
       
        boolean playagain;

        do {
            int playerscore = 0;
            int computerscore = 0;
            String[] options = {"rock", "paper", "scissors"};
            
            // Play 3 rounds
            for (int round = 1; round <= 3; round++) {
                System.out.println("Round " + round + ": Choose rock, paper, or scissors:");
                String playerchoice = key.next().toLowerCase();
                
                // Generate computer choice
                String computerchoice = options[random.nextInt(3)];
                System.out.println("Computer chose: " + computerchoice);
                
                // Determines a winner of a round
                if (playerchoice.equals(computerchoice)) {
                    System.out.println("It's a draw.");
                } else if ((playerchoice.equals("rock") && computerchoice.equals("scissors")) ||
                           (playerchoice.equals("scissors") && computerchoice.equals("paper")) ||
                           (playerchoice.equals("paper") && computerchoice.equals("rock"))) {
                    System.out.println("You win this round!");
                    playerscore++;
                } else if ((computerchoice.equals("rock") && playerchoice.equals("scissors")) ||
                        (computerchoice.equals("scissors") && playerchoice.equals("paper")) ||
                        (computerchoice.equals("paper") && playerchoice.equals("rock"))) {
                    System.out.println("Computer wins this round.");
                    computerscore++;
                } else {
                    System.out.println("Invalid input. Computer gets a point by default.");
                    computerscore++;
                }
                
               
                System.out.println("Current Score - You: " + playerscore + " Computer: " + computerscore);
            }
            
            // Declare overall winner
            if (playerscore > computerscore) {
                System.out.println("Congratulations! You won!");
            } else if (computerscore > playerscore) {
                System.out.println("Computer wins the game. Try again!");
            } else {
                System.out.println("It's a tie!");
            }
            
            // Ask to play again
            System.out.println("Do you want to play again? (yes or no?)");
            playagain = key.next().equalsIgnoreCase("yes");
        } while (playagain);
        
        System.out.println("Game Over!");
    }
}
