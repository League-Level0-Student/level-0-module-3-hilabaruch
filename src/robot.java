import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class robot {
static	Robot bob= new Robot();
	public static void main(String[] args) {
	//Make a new class, create a main method, and show the robot.
	String shape =	JOptionPane.showInputDialog(null,"what shape do you want circle,triangle or a square?");
	String color =	JOptionPane.showInputDialog(null,"what color do you want red or blue or yellow?");
	if (color.equals("red")) { 
		bob.setPenColor(Color.red);
		
	}if (color.equals("blue")) { 
		bob.setPenColor(Color.blue);
		
	}if (color.equals("yellow")) { 
		bob.setPenColor(Color.yellow);
		
	}
		if (shape.equals("circle")) { 
			drawCircle();
		}
		if (shape.equals("triangle")) { 
			drawTriangle();
		}if (shape.equals("square")) { 
			drawSquare();
		}
	
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
		bob.move(220);
		bob.turn(125);
		bob.move(100);
		
	}
	//Extract this code into a drawTriangle() method.
	
	//Have the robot draw a circle.
	public static void drawCircle() {
		
	for(int i = 0; i < 130; i++) {	
	bob.penDown();
	bob.setSpeed(10);
	bob.turn(3);
	bob.move(2);
	}
	}

	//Extract this code into a drawCircle() method.
	
	//Ask the user which shape they want. Draw the appropriate shape depending on their answer.

	//Ask the user which color they want. Give them some choices so you don't have to accomodate every possible color. Color the shape depending on their answer.
	
	
	
	


}
