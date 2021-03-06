import java.util.Scanner;
import java.util.Random;
/*Easy mode for Mastermind 2
 * Based on Mastermind from 20 Code Challenges
 * From GCSE (9-1) Computer Science
 * Easy mode: tells players what slot they got right
 * Programmer: Matthew Bishop
 */
public class MastermindEasy implements Mastermind {
	
	//Attributes
	private int[] digits;
	private boolean solved;
	
	//Constructor
	public MastermindEasy() {
		
		digits = new int[4];
		Random rand = new Random();
		for(int i = 0; i < digits.length; i++) {
			digits[i] = rand.nextInt(10);
		}
		solved = false;
	}
	
	//Play Easy Mode
	public void play() {
		
		Scanner input = new Scanner(System.in);
		while(solved == false) {
			int[] playerInput = new int[4];
			System.out.println("Please enter 4 digits, one at a time.");
			//input player guess
			for(int i = 0; i < playerInput.length; i++) {
				playerInput[i] = input.nextInt();
				if(playerInput[i] > 9 || playerInput[i] < 0) {
					System.out.println("Please enter an integer greater than or equal to 0 or less than or equal to 9");
					i--;
				}
			}
			//check to see if player guess matches
			for(int u = 0; u < digits.length; u++) {
				if(digits[u] == playerInput[u]) {
					System.out.println("You got position " + u + " correct!");
				}
			}
			if(digits[0] == playerInput[0] && digits[1] == playerInput[1] && digits[2] == playerInput[2] && digits[3] == playerInput[3]) {
				System.out.println("You got all the digits right!");
				solved = true;
			}
		}
		input.close();
	}
}
