import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class robot {
static	Robot bob= new Robot();
	public static void main(String[] args) {
	//Make a new class, create a main method, and show the robot.
	//drawSquare();
		drawTriangle(); 
		//drawCircle();
	//Have the robot draw a square.

	}
	//Extract this code into a drawSquare() method.
	public static void drawSquare() {
		
		bob.penDown();
		bob.setSpeed(10);
	bob.move(200);
	bob.turn(90);
	bob.move(200);
	bob.turn(90);
	bob.move(200);
	bob.turn(90);
	bob.move(200);
		
	}
	//Have the robot draw a triangle.
	public static void drawTriangle() {
	
		bob.penDown();
		bob.setSpeed(10);
		bob.move(200);
		bob.turn(60);
		bob.turn(90);
		bob.move(200);
		bob.turn(90);
		bob.move(100);
	}
	//Extract this code into a drawTriangle() method.
	
	//Have the robot draw a circle.
	public static void drawCircle() {
		
		
	bob.penDown();
	bob.setSpeed(10);
	bob.move(100);
		for (int i = 10; i > 0; i--) { bob.turn(60);
			
		}
	}

	//Extract this code into a drawCircle() method.
	
	//Ask the user which shape they want. Draw the appropriate shape depending on their answer.

	//Ask the user which color they want. Give them some choices so you don't have to accomodate every possible color. Color the the shape depending on their answer.
	
	
	
	


}
