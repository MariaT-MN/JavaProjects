import java.util.*;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner playStart;
        Scanner userPick;
        Scanner endGame;

        String endDecision;
        int userChoice;
        int opponentChoice;
        int userScore = 0;
        int opponentScore = 0;

        playStart = new Scanner(System.in);
        System.out.println("Would you like to play Rock Paper Scissors? Y or N");

        String userChoiceGame = playStart.nextLine();

        if (userChoiceGame.equals("y") || userChoiceGame.equals("Y")){
            System.out.println("Starting Game - 3 rounds");
            do {
                //asks user for choice in RPS
                userPick = new Scanner(System.in);
                System.out.println("Enter your choice:\n" +
                        "1. Rock\n" +
                        "2. Paper\n" +
                        "3. Scissors");

                userChoice = userPick.nextInt();

                opponentChoice = (int)(Math.random() * 2);
                //runs random generator for opponent

                roundDecision(userChoice,opponentChoice);
                //compares user's choice and opponent then score is added
                //if score is > 2 then game ends else...
                //asks if wants to play again
                endGame = new Scanner(System.in);
                System.out.println("Would you like to play again? Y or N");
                endDecision = endGame.nextLine();

                if (endDecision.contains("n")){
                    System.out.println("Exiting...");
                    break;
                }

            } while (true);
        }
        else if (userChoiceGame.equals("n") || userChoiceGame.equals("N")) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Please enter valid answer.");
        }


    }

    private static void roundDecision(int userChoice, int opponentChoice){
        switch (userChoice){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
}
