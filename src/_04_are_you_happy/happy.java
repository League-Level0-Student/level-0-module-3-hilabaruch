package _04_are_you_happy;

import javax.swing.JOptionPane;

public class happy {
	public static void main(String[] args) {
		
	
String a =	JOptionPane.showInputDialog("r u happy?");
if(a.equals("yes")) {
	System.exit(0);}	

	if(a.equals("no")) { JOptionPane.showInputDialog("do you want  to be happy?"); } if(a.equals("yes")) {
		System.exit(0);} 
	if(a.equals("no")) {System.exit(0);}

} }
