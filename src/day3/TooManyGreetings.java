package day3;

import javax.swing.JOptionPane;

public class TooManyGreetings {
public static void main(String[] args) {
	String answer= JOptionPane.showInputDialog("What is your name?");
	System.out.println("Hi "+answer);
}
}
