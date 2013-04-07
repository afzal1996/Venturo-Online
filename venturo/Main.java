package venturo;

import javax.swing.JFrame;

/*
 * Venturo Online - a text-based RPG 
 * @Author afzal1996
 */
public class Main extends Game {
	
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 800, HEIGHT = 450;
	private static final String TITLE = "Venturo Online";
	
	public Main() {
		Thread thread = new Thread(this);
		setSize(WIDTH, HEIGHT);
		setTitle(TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		createBufferStrategy(3);
		addKeyListener(this);
		thread.start();
	}
	
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		Main main = new Main();
	}

}
