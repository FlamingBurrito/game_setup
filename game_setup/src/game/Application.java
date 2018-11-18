package game;

import javax.swing.JFrame;

public class Application extends JFrame {
	GamePanel game;
	
	public Application() {
		setSize(800, 800);
		setTitle("Game");
		
		game = new GamePanel();
		add(game);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		repaint();
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		Application app = new Application();
		app.setVisible(true);
	}
}
