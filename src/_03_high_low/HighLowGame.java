//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(5);
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 10; i++) {
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String a = JOptionPane.showInputDialog("guess a number now ");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
int number =(Integer.parseInt(a));		
			// 5. if the guess is correct
				if(random==number) { JOptionPane.showMessageDialog(null, "You win");
		// 6. Win
				
		// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
				System.exit(0); }
		// 7. if the guess is high
			if(random<number) { JOptionPane.showMessageDialog(null, "too high");}
		// 8. Tell them it's too high
		
		// 9. if the guess is low
			if(random>number) { JOptionPane.showMessageDialog(null, "too low and you lose"); 	System.exit(0);}
		// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}}


