package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		Robot walle= new Robot();
		walle.penDown();
		walle.setSpeed(10);
		walle.setRandomPenColor();
		int sides=5;
		int angle=360/sides;
		for (int i = 0; i < 10000*10000; i++) {
			walle.move(i);
			walle.turn(angle);
			walle.turn(1);
		}

	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}