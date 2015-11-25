package day3;

import javax.swing.JOptionPane;

public class Snooper135 {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What is your home address?");
	String answer2 = JOptionPane.showInputDialog("What is your family name?");
    String answer3 = JOptionPane.showInputDialog("What is your bank account password?");
    String answer4 = JOptionPane.showInputDialog("Do you have any gold?");
    JOptionPane.showMessageDialog(null, "I have no gold.");
}
}
