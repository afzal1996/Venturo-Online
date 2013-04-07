package venturo;

import java.awt.Graphics;

public class Message {
	
	public static void send(Graphics g, String text, int x, int y) {
		g.drawString(text, x, y);
	}
	
	public static String capitalize(String text) {
        if (text.length() == 0) return text;
        return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
    }

}
