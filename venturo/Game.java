package venturo;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import venturo.Location.LOCATION;

public class Game extends JFrame implements Runnable, KeyListener {
	
	private static final long serialVersionUID = 1L;
	private static boolean finished = false;
	private static boolean onStart = true;
	private static boolean selectLocation = false;
	private static final Font font1 = new Font("Arial", 1, 40);
	private static final Font font2 = new Font("Arial", 1, 15);
	
	@Override
	public void run() {
		while(!finished) {
			drawStuff();
			
			//logic
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(onStart) {
			switch(key) {
			case KeyEvent.VK_ENTER:
				onStart = false;
				selectLocation = true;
			}
		}
		
		else if(selectLocation) {
			switch(key) {
				case KeyEvent.VK_1:
					Character.setLocation(LOCATION.LUMBRIDGE); 
					selectLocation = false; break;
				case KeyEvent.VK_2:
					Character.setLocation(LOCATION.VARROCK); 
					selectLocation = false; break;
				case KeyEvent.VK_3:
					Character.setLocation(LOCATION.FALADOR); 
					selectLocation = false; break;
				case KeyEvent.VK_4:
					Character.setLocation(LOCATION.WILDERNESS); 
					selectLocation = false; break;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {};

	@Override
	public void keyTyped(KeyEvent e) {};
	
	private void drawStuff() {
		BufferStrategy bf = this.getBufferStrategy();
		Graphics g = null;

		try {
			g = bf.getDrawGraphics();
			g.clearRect(0, 0, getWidth(), getHeight());
			g.setFont(font1);
			g.drawString("Venturo Online", 100, 100);
			g.setFont(font2);
			if(onStart) {
				Message.send(g, "Welcome to RuneScape.", 15, 350);
				Message.send(g, "Press \"Enter\" to continue..", 15, 370);
			}
			else if(selectLocation) {
				Message.send(g, "Press '1' to visit Lumbridge", 15, 350);
				Message.send(g, "Press '2' to visit Varrock", 15, 370);
				Message.send(g, "Press '3' to visit Falador", 15, 390);
				Message.send(g, "Press '4' to visit the Wilderness", 15, 410);
			}
			g.setFont(getFont());
			Inventory.display(g, 600, 175);
		} finally {
			g.dispose();
		}

		bf.show();
		Toolkit.getDefaultToolkit().sync();
	}

}
