import java.util.Scanner;
import java.util.Random;
/*Hard mode for Mastermind 2
 * Based on Mastermind from 20 Code Challenges
 * From GCSE (9-1) Computer Science
 * Hard mode: Player has to guess 5 digits instead of 4
 * Programmer: Matthew Bishop
 */


public class MastermindHard implements Mastermind{
	
	//Attributes
	private int[] digits;
	private boolean solved;
	
	//constructor
	public MastermindHard() {
		
		digits = new int[5];
		solved = false;
		Random rand = new Random();
		for(int i = 0; i < digits.length; i++) {
			digits[i] = rand.nextInt(10);
		}
	}
	
	//play the hard mode of the game
	public void play() {
		
		Scanner input = new Scanner(System.in);
		int[] playerInput = new int[5];
		while(solved == false) {
			//input player guess
			System.out.println("Please enter the 4 digits for your guess");
			for(int i = 0; i < playerInput.length; i++) {
				playerInput[i] = input.nextInt();
				if(playerInput[i] > 0 || playerInput[i] > 9) {
					System.out.println("Please enter a number greater than or equal to 0 or less than or equal to 9.");
					i--;
				}
			}
			//check to see if guess matches
			if(digits[0] == playerInput[0] && digits[1] == playerInput[1] && digits[2] == playerInput[2] && digits[3] == playerInput[3]) {
				System.out.println("You got it right!");
				solved = true;
			}
		}
		input.close();
	}
}
