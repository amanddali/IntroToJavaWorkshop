package day5;

import java.applet.AudioClip;
import java.awt.Dimension;

import java.awt.Graphics;
import java.awt.Robot;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ScaryMaze extends JPanel implements Runnable, MouseMotionListener {
	
	BufferedImage maze;
	final int frameWidth = 600;
	final int frameHeight = 400;


	ScaryMaze() throws Exception {
		maze = ImageIO.read(getClass().getResource("SCARY MAZE.jpg"));
		new Robot().mouseMove(30,80);
		addMouseMotionListener(this);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		int mouseColor = maze.getRGB(mouseX, mouseY);
		//4. print the mouseColor variable to see what color the mouse is touching
		System.out.println(mouseColor);
		//5. make a variable to hold the background color. 
		int backgroundColor = -1;
		//6. if the mouse falls off the path (if it is on the background)
		if (mouseColor==backgroundColor) {
			scare();
		}
		int endColor = -16513872;
		//10. if the mouse is on the end color
		if (mouseColor==endColor) {
			JOptionPane.showMessageDialog(null,"You have made it through the maze of possessed children");
		}
			
		
	}

	private void scare() {
		System.out.println("BOO!");
		//7. find a scary sound and put it in the day5 package where you put your maze picture. You can find a sound on freesound.org. Log in as leagueofamazing/code4life.
		AudioClip sound = JApplet.newAudioClip(getClass().getResource("scaresound.wav"));
		
		//8. play the scary sound. Hint: type "sound" and then a period.		
		sound.play();
		//9. drop an image into your day5 package, and use the showScaryImage method to scare your victim!
		showScaryImage("scaryimage.jpg");
	}

	private void showScaryImage(String imageName) {
		try {
			maze = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new ScaryMaze());
	}

	@Override
	public void run() {
		JFrame frame = new JFrame("Maze of Possessed Childred");
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(maze, 0, 0, null);
	}

	@Override
	public void mouseDragged(MouseEvent e) {}

}



