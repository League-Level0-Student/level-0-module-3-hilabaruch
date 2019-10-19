package _05_horoscope;

import javax.swing.JOptionPane;

public class star {
	public static void main(String[] args) 
{String a =  JOptionPane.showInputDialog("what is your star sign");
if(a.equals("Leo")){
	JOptionPane.showMessageDialog(null, "Fire sign ruled by the Sun and you are"  +
			"Generous , organized, protective, beautiful.");}
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
		if(a.equals("Gemini ")){
			JOptionPane.showMessageDialog(null, "Air sign; ruled by Mercury" +
			"Cerebral, chatty, loves learning and education, charming, and adventurous");}
		
		if(a.equals("Aquarius")){
			JOptionPane.showMessageDialog(null, "Air sign; ruled by Uranus." +
			"Forward thinking, communicative, people oriented, stubborn, generous, and dedicated." 
			);}
				
		if(a.equals("Aries")){
			JOptionPane.showMessageDialog(null, "Fire sign; ruled by Mars." +
			"Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action." 
			);}
		if(a.equals("Taurus")){
			JOptionPane.showMessageDialog(null, "Earth sign; ruled by Venus." + 
			"Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature"  
			);}

		if(a.equals("Virgo")){
			JOptionPane.showMessageDialog(null, "Earth sign; ruled by Mercury." + 
			"Particular, logical, practical, sense of duty, critical"   
			);}
		if(a.equals("Sagittarius")){
			JOptionPane.showMessageDialog(null, "Fire sign; ruled by Jupiter." + 
			"Happy, absent minded, creative, adventurous."   
			);}
	
		if(a.equals("Pisces")){
			JOptionPane.showMessageDialog(null, "Water sign; ruled by Neptune." + 
			"Likeable, energetic, passionate, sensitive."   
			);} 
		else	{ JOptionPane.showMessageDialog(null, "That is not a star sign");
			
		}
}
}