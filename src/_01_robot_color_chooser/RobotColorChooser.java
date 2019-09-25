//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot bob = new Robot();bob.penDown(); bob.setSpeed(100);
		//3. Ask the user what color they would like the robot to draw
for (int i = 0; i < 10; i++) {
	

		String color =		JOptionPane.showInputDialog(null, "what color they would like the robot to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
		if(color.equals("red")) { 
			bob.setPenColor(Color.red); 
		}
		else {
			bob.setRandomPenColor();
		}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		bob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
bob.move(150);bob.turn(60); bob.move(150);bob.turn(60); bob.move(150);bob.turn(60);bob.move(150);bob.turn(90);bob.move(220);

	}
	}}
