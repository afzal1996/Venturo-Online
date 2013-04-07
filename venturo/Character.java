package venturo;

import venturo.Location.LOCATION;

public class Character {
	
	private static int coins = 0;
	private static LOCATION location;
	
	public static int getWealth() {
		return coins;
	}
	
	public static LOCATION getLocation() {
		return location;
	}
	
	public static int setWealth(int coins) {
		return Character.coins = coins;
	}
	
	public static int addWealth(int coins) {
		return Character.coins += coins;
	}
	
	public static LOCATION setLocation(LOCATION loc) {
		return Character.location = loc;
	}
	
}
