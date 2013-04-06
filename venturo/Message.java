package venturo;

public class Message {
	
	public static void send(String text) {
		System.out.println(text);
	}
	
	public static String capitalize(String text) {
        if (text.length() == 0) return text;
        return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
    }

}
