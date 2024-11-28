import java.util.*;

public class RockPaperScissors {
    public static void main(String args[]) {
        Scanner playStart;
        Scanner userPick;
        Scanner endGame;

        String endDecision;
        int userChoice;
        int opponentChoice;

        playStart = new Scanner(System.in);
        System.out.println("Would you like to play Rock Paper Scissors? Y or N");

        String userChoiceGame = playStart.nextLine();

        if (userChoiceGame.equals("y") || userChoiceGame.equals("Y")){
            System.out.println("Starting Game...");
            while (true) {
                //asks user for choice in RPS
                userPick = new Scanner(System.in);
                System.out.println("""
                        Enter your choice:
                        1. Rock
                        2. Paper
                        3. Scissors""");

                userChoice = userPick.nextInt();

                Random randNum = new Random(); //creates a new instance of random class
                opponentChoice = randNum.nextInt(1, 4);
                //runs random number for opponent between 1-3

                if (userChoice > 0 && userChoice < 4){
                    roundDecision(userChoice,opponentChoice);
                } else {
                    System.out.println("Enter Valid Answer...");
                }
                //compares user's choice and opponent then score is added

                //asks if user wants to play again
                endGame = new Scanner(System.in);
                System.out.println("Would you like to play again? Y or N");
                endDecision = endGame.nextLine();

                if (endDecision.contains("n")){
                    System.out.println("Exiting...");
                    break;
                }
            }
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
                if(userChoice == opponentChoice) {
                    System.out.println("You both picked Rock ... Try again");
                } else if (opponentChoice == 2) {
                    System.out.println("You lose. Opponent picked Paper");
                } else {
                    System.out.println("You win! Opponent picked Scissors");
                }
                break;
            case 2:
                if(userChoice == opponentChoice){
                    System.out.println("You both picked Paper ... Try again");
                } else if (opponentChoice == 3) {
                    System.out.println("You lose. Opponent picked Scissors");
                } else {
                    System.out.println("You win! Opponent picked Rock");
                }
                break;
            case 3:
                if(userChoice == opponentChoice){
                    System.out.println("You both picked Scissors ... Try again");
                } else if (opponentChoice == 1) {
                    System.out.println("You lose. Opponent picked Rock");
                } else {
                    System.out.println("You win! Opponent picked Paper");
                }
                break;
            default:
                System.out.println("Enter in valid answer");
        }
    }
}
