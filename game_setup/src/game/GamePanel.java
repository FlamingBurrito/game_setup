package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements KeyListener {

	public GamePanel() {
		addKeyListener(this);
		setBackground(new Color(64, 64, 64));						//Sets the background color using r, g, b values
		setDoubleBuffered(true);
		setFocusable(true);
		
		repaint();													//updates the graphics
	}
	
	public void gameManager(Graphics g) {
		g.setColor(Color.MAGENTA);									//sets the color of the graphics
		g.drawRect(200, 200, 200, 200);								//draws a rectangle
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		gameManager(g);
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
