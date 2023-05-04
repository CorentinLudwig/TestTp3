package ilu2;

public class Welcome {
	
	
	public static String welcome(String input) {
		if(input.isBlank())
			return "Hello, my friend";
		
		String[] tabinput = input.split(",");
		StringBuilder wel = new StringBuilder();
		StringBuilder upper = new StringBuilder();
		wel.append("Hello, ");
		upper.append("HELLO, ");
		
		
		for(int i = 0; i<tabinput.length; i++) {
			if(tabinput[i].equals(tabinput[i].toUpperCase())){
				upper.append(tabinput[i]);
			} else {
				wel.append(tabinput[i].substring(0, 1).toUpperCase());
				wel.append(tabinput[i].substring(1));
				if(i<tabinput.length-1)
					wel.append(", ");
				}
		}
		if(upper.length()>7) {
			upper.append(" !");
			wel.append(". AND ");
			wel.append(upper);
		}
		if(wel.length()>7)
			return upper.toString();
		return wel.toString();
	}
}

