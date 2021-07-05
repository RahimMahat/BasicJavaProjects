import java.util.Random;
import java.util.Scanner;

class GuessTheNumber{
    public int guess;
    public int Computer;
    public int attempt = 0;

    public void  GuessTheNumber(){
        Random random = new Random();
        this.Computer = random.nextInt(10);
        System.out.println(Computer);
    }
    public void TakeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you guess: ");
        int guess = sc.nextInt();
    }
    public boolean IsCorrectNumber(){
        attempt++;
        if (guess==Computer){
            System.out.printf("Yes, the number is %d you guessed it in %d attempts",guess,attempt);
            return true;
        }
        else if (guess<Computer){
            System.out.println("Guess is low");
        }
        else if (guess>Computer){
            System.out.println("Guess is high");
        }
        else:
            return false;


    }
}
public class guesstheNumber {
    public static void main(String[] args) {
        GuessTheNumber game = new GuessTheNumber();
        boolean b = true;
        while true {
            game.TakeUserInput();
            b = game.IsCorrectNumber();
        }
        
            


    }
}
