package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {

		Robot bill= new Robot();
		bill.setSpeed(10);
		for (int i = 0; i < 200; i++) {
		bill.penDown();	
		bill.setRandomPenColor();
		bill.move(5*i);
		bill.turn(360/7);
		bill.setPenWidth(i);
		}
	}
}
