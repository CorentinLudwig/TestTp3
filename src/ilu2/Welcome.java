package ilu2;

public class Welcome {
	
	
	public static String welcome(String input) {
		StringBuilder wel = new StringBuilder();
		wel.append("Hello, ");
		wel.append(input.substring(0, 1).toUpperCase());
		wel.append(input.substring(1));
		return wel.toString();
		
	}
}
