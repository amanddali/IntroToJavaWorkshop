package day3;

import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String nameanswer= JOptionPane.showInputDialog("What is your full birth name?");
			JOptionPane.showMessageDialog(null, "Hi "+nameanswer);
	String birthdayanswer= JOptionPane.showInputDialog("What is your birth date?");
	JOptionPane.showMessageDialog(null, "Because I know your full name is "+nameanswer +" and your birth date is " +birthdayanswer +", I now know your social security number...");
	JOptionPane.showMessageDialog(null, "Your information will be posted on InternationalCrooks.org in 10 minutes unless...");
	JOptionPane.showMessageDialog(null,"Unless you enter your credit card information in the following boxes");
	creditinfo();
	JOptionPane.showMessageDialog(null, "The information wasn't corrrect, try again");
	creditinfo();
	JOptionPane.showMessageDialog(null, "Thank you! Your information will not be posted and your card shall have no charges...");
}

static void creditinfo(){
	JOptionPane.showInputDialog("Credit/Debit Card type");
	JOptionPane.showInputDialog("Input Credit/Debit Card number");
	JOptionPane.showInputDialog("Expiration Date");
	JOptionPane.showInputDialog("Security Number");
}

}
