import java.util.Scanner;
import java.util.Random;


public class RockPaperScissor {
    public static void main(String[] args) {
        // User Input:
        System.out.print("Enter: 0 for Rock, 1 for Paper and 2 for Scissor: ");
        Scanner sc = new Scanner(System.in);
        int UserInput = sc.nextByte();
        // Computer Input:
        Random random = new Random();
        int CompInput = random.nextInt(3);
        //System.out.println("Computer's Choice is: "+CompInput);
        // Specifying numbers according to the game:
        if (CompInput==0){
            System.out.println("Computers choice is Rock");
        }
        else if(CompInput==1){
            System.out.println("Computers choice is Paper");
        }
        else {
            System.out.println("Computers choice is Scissors");
        }
        // Playing game logic:
        if (UserInput==CompInput){
            System.out.println("This is a Draw");
        }
        else if(UserInput==0 && CompInput == 2 || UserInput == 1 && CompInput == 0 || UserInput == 2 && CompInput == 1){
            System.out.println("You won!");
        }
        else {
            System.out.println("Computer won");
        }
    }

}