package venturo;

import java.awt.Graphics;
import java.util.ArrayList;

public class Inventory {
	
	private static ArrayList<Integer> inventory = new ArrayList<Integer>();
	private static final String space = "         ";
	private static final String invFill = space + "." + space + "." + space + "." + space + "." + space;
	
	public static int getCount() {
		return inventory.size();
	}
	
	public static boolean contains(int id) {
		return inventory.contains(id);
	}
	
	public static void add(int id) {
		inventory.add(id);
	}
	
	public static boolean isFull() {
		return Inventory.getCount() == 28;
	}
	
	public static void display(Graphics g, int x, int y) {
		g.drawLine(x, y, x + 150, y);
		g.drawString(invFill, x, y + 30);
		g.drawString(invFill, x, y + 60);
		g.drawString(invFill, x, y + 90);
		g.drawString(invFill, x, y + 120);
		g.drawString(invFill, x, y + 150);
		g.drawString(invFill, x, y + 180);
		g.drawString(invFill, x, y + 210);
		g.drawLine(x, y + 240, x + 150, y + 240);
		g.drawLine(x, y, x, y + 240);
		g.drawLine(x + 150, y, x + 150, y + 240);
	}

}
