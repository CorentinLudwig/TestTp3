package ilu2;

public class Welcome {
	
	
	public static String welcome(String input) {
		if(input.isBlank())
			return "Hello, my friend";
		
		String[] tabinput = input.split(",");
		StringBuilder wel = new StringBuilder();
		wel.append("Hello, ");
		
		for(int i = 0; i<tabinput.length; i++) {
			wel.append(tabinput[i].substring(0, 1).toUpperCase());
			wel.append(tabinput[i].substring(1));
			if(i<tabinput.length-1)
				wel.append(", ");
		}
		if(input.equals(input.toUpperCase())){
			wel.append(" !");
		return wel.toString().toUpperCase();
		}
		return wel.toString();
	}
}

