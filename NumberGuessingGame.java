package NumberGuessingGame;
import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("What is your name ?");
		String name = sc.nextLine();
		
		System.out.println("Well, "+ name+ ", I am thinking of a number between 1 and 100");
		int myNumber=getRandomNumber(1,101);
		
		for (int i=0; i<101 ; i++) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Take a guess.");
			int yourGuess = sc1.nextInt();
			
			if (yourGuess ==myNumber) {
				System.out.println("You guessed correctly");
				break;
			}
			else if(yourGuess < myNumber) {
				System.out.println("Your guess is too low !");
			}
			else if (yourGuess > myNumber) {
				System.out.println("Your guess is too high");
			}
			if (i>=5) {
				System.out.println();
				System.out.println("Nope. The Number I was thinking of was " + myNumber + "!");
			}
						
		}
	}
	
	public static int getRandomNumber(int min,int max) {
		Random random = new Random();
		return random.ints(min,max).findFirst().getAsInt();
		
	}

}
