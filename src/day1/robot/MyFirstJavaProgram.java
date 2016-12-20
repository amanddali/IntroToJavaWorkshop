package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot bender= new Robot();
	bender.sparkle();
	bender.setSpeed(20);
	bender.penDown();
	bender.setPenColor(100, 0, 170);
	for (int i = 0; i < 4; i++) {
		bender.move(200);
		bender.turn(90);		
	}
	bender.penUp();
	bender.turn(270);
	bender.move(100);
	bender.setRandomPenColor();
	bender.setPenWidth(5);
	bender.penDown();
	for (int i = 0; i < 4; i++) {
		bender.move(450);
		bender.turn(90);	
	}
	
	}
}
