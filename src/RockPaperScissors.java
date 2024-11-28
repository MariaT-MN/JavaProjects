import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner playStart;
        Scanner userPick;
        String userChoice;
        int userScore = 0;
        int opponentScore = 0;

        playStart = new Scanner(System.in);
        System.out.println("Would you like to play Rock Paper Scissors? Y or N");

        String userChoiceGame = playStart.nextLine();

        if (userChoiceGame.equals("y") || userChoiceGame.equals("Y")){
            System.out.println("Starting Game - 3 rounds");
            do {
                //asks user for choice in RPS
                //runs random generator for opponent
                //compares user's choice and opponent then score is added
                //if score is > 2 then game ends else...
                //asks if wants to play again
                System.out.println("Would you like to play again? Y or N");
                //if...else - if true, game continues, else game ends
            } while (true);
        }
        else if (userChoiceGame.equals("n") || userChoiceGame.equals("N")) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Please enter valid answer.");
        }


    }
}
