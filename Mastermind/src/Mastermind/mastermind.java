package Mastermind;
import java.util.Scanner;
import java.util.Random;
/*
 * Author: Matthew Bishop
 * Mastermind: generate a random 4 digit number
 * that the user guesses until correct
 * 
 * Based on challenge from 20 Code Challenges
 * GCSE (9 - 1) Computer Science
 * 
 * Date: May 5, 2021
 */
public class mastermind {
	public static void main(String[] args) {
		//initializing variables
		int attempts = 0;
		int[] fourDigit = new int[4];
		int[] userGuess = new int[4];
		boolean success = false;
		Scanner input = new Scanner(System.in);
		//generate random numbers
		Random rand = new Random();
		fourDigit[0] = rand.nextInt(10);
		fourDigit[1] = rand.nextInt(10);
		fourDigit[2] = rand.nextInt(10);
		fourDigit[3] = rand.nextInt(10);
		
		//user starts guessing here
		while(success == false) {
			attempts++;
			System.out.println("Please enter your guess at the 4 digit number one digit at a time");
			for(int i = 0; i < userGuess.length; i++) {
				userGuess[i] = input.nextInt();
				if(userGuess[i] > 9 || userGuess[i] < 0) {
					System.out.println("Please enter the digit again");
					i--;
				}
			}
			if(fourDigit[0] == userGuess[0] && fourDigit[1] == userGuess[1] && fourDigit[2] == userGuess[2] && fourDigit[3] == userGuess[3]) {
				System.out.println("You solved it");
				success = true;
			}
			else {
				System.out.println("Try again");
			}
		}
		input.close();
		System.out.println("It took " + attempts + "attempts to solve.");
	}
}
