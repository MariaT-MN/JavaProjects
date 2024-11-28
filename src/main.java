import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner playChoice;

        playChoice = new Scanner(System.in);
        System.out.println("Would you like to play Rock Paper Scissors? Y or N");

        String userChoiceGame = playChoice.nextLine();

        if (userChoiceGame.equals("y") || userChoiceGame.equals("Y")){
            System.out.println("Starting Game");//run game in loop
        }
        else if (userChoiceGame.equals("n") || userChoiceGame.equals("N")) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Please enter vaild answer.");
        }


    }
}
