package ilu2;

public class Welcome {
	
	
	public static String welcome(String input) {
		if(input.isBlank())
			return "Hello, my friend";

				
		StringBuilder wel = new StringBuilder();
		wel.append("Hello, ");
		wel.append(input.substring(0, 1).toUpperCase());
		wel.append(input.substring(1));
		if(input.equals(input.toUpperCase())){
			wel.append(" !");
			return wel.toString().toUpperCase();
		}
		return wel.toString();
	}
}

