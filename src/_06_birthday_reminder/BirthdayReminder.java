
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and store their response in a variable
	String a = JOptionPane.showInputDialog("Which birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(a);
		// 4. if user asked for "mom"
			//print mom's birthday
		if( a.equals("mom")) { System.out.println(momsBirthday);}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(a.equals( "dad")) {System.out.println(dadsBirthday);}
		// 6. if user asked for your name
		// print myBirthday
		else if(a.equals( "hila")) {System.out.println(myBirthday);}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {JOptionPane.showMessageDialog(null, "I don't remember that person's birthday");}
	} 
}
