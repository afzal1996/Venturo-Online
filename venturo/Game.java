package venturo;

import java.util.Scanner;

import venturo.Location.LOCATION;

public class Game {
	
	private static boolean finished = false;
	private static boolean append = false;
	private static int selection;
	private static Scanner scanIn = new Scanner(System.in);
	
	public static void loop() {
		if(Character.getLocation() == null) selectLocation();
		
		Message.send((!append ? "Loading " : "Loading the ") + Message.capitalize(Character.getLocation().toString()) + "..");
		
		while(!finished) {
			
		}
	}
	
	private static void selectLocation() {
		Message.send("Press '1' to visit Lumbridge");
		Message.send("Press '2' to visit Varrock");
		Message.send("Press '3' to visit Falador");
		Message.send("Press '4' to visit the Wilderness\n");
		
		selection = scanIn.nextInt();
		
		switch(selection) {
			case 1: Character.setLocation(LOCATION.LUMBRIDGE); break;
			case 2: Character.setLocation(LOCATION.VARROCK); break;
			case 3: Character.setLocation(LOCATION.FALADOR); break;
			case 4: Character.setLocation(LOCATION.WILDERNESS); append = true; break;
			default: loop();
		}
	}

}
