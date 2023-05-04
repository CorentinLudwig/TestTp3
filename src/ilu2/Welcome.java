package ilu2;

public class Welcome {
	
	
	public static String welcome(String input) {
		if(input.isBlank())
			return "Hello, my friend";

		String[] tabinput = input.split(",");
		StringBuilder lower = new StringBuilder();
		StringBuilder upper = new StringBuilder();
		lower.append("Hello");
		upper.append("HELLO");
		
		
		for(int i = 0; i<tabinput.length; i++) {
			if(tabinput[i].equals(tabinput[i].toUpperCase())){
				upper.append(", ");
				upper.append(tabinput[i]);
			} else {				
				lower.append(", ");
				lower.append(tabinput[i].substring(0, 1).toUpperCase());
				lower.append(tabinput[i].substring(1));

				}
		}
		upper.append(" !");
		insertAnd(upper);
		insertAnd(lower);
		String upperFinal = upper.toString().toUpperCase();
		if(lower.length()==5)
			return upperFinal;
		
		if(upper.length()>7) {
			lower.append(". AND ");
			lower.append(upperFinal);
		}
		return lower.toString();
	}
	
	
	private static StringBuilder insertAnd(StringBuilder b) {
		int i =b.lastIndexOf(",");
		if(i>6) {
			b.replace(i, i+1, " and");
		}
		return b;
	}
}

