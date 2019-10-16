package _05_horoscope;

import javax.swing.JOptionPane;

public class star {
	public static void main(String[] args) 
{String a =  JOptionPane.showInputDialog("what is your star sign");
if(a.equals("Leo")){
	JOptionPane.showMessageDialog(null, "Fire sign ruled by the Sun and you are"  +
			"Generous, organized, protective, beautiful.");}
if(a.equals("Libra")){
	JOptionPane.showMessageDialog(null, "Air sign; ruled by Venus and you're " + 
			"Balanced, seeks beauty, sense of justice.");}
	if(a.equals("Cancer")){
		JOptionPane.showMessageDialog(null, "A water sign; ruled by the Moon and you are" + 
				"Emotional, group oriented, seeks security, family.");}
		if(a.equals("Scorpio")){
			JOptionPane.showMessageDialog(null, "Water sign; ruled by Pluto and you are " + 
					"Passionate, exacting, loves extremes, combative, reflective.");}
		if(a.equals("Capricorn")){
			JOptionPane.showMessageDialog(null, "Earth sign; ruled by Saturn and you're" + 
					"Timeless, driven, calculating, ambitious."  
					);}
		if(a.equals("somthing")){
			JOptionPane.showMessageDialog(null, "Earth sign; ruled by Saturn and you're" + 
					"Timeless, driven, calculating, ambitious."  
					);}
		
}
	


}}
