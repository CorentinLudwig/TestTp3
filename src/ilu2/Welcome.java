package ilu2;

public class Welcome {

	public static String welcome(String input) {
		if (input.isBlank())
			return "Hello, my friend";
		String[] tabinput = input.split(",");

		String[] tabNom = new String[tabinput.length];
		int[] tabCompte = new int[tabinput.length];
		int n = 0;

		for (int i = 0; i < tabinput.length; i++) {
			tabinput[i] = tabinput[i].trim();
			int e = 0;
			while (e < n && !tabNom[e].equals(tabinput[i])) {
				e++;
			}

			if (e == n) {
				tabNom[n] = tabinput[i];
				tabCompte[n] = 1;
				n++;
			} else {
				tabCompte[e]++;
			}
		}

		return builderWelcome(tabNom, tabCompte, n);
	}

	private static void insertAnd(StringBuilder b) {
		int i = b.lastIndexOf(",");
		if (i > 6) {
			if (b.substring(1, 2).equals("E"))
				b.replace(i, i + 1, " AND");
			else
				b.replace(i, i + 1, " and");
		}
	}

	private static String builderWelcome(String[] tabNom, int[] tabCompte, int n) {

		StringBuilder lower = new StringBuilder();
		StringBuilder upper = new StringBuilder();
		lower.append("Hello");
		upper.append("HELLO");

		for (int i = 0; i < n; i++) {

			if (tabNom[i].equals(tabNom[i].toUpperCase()))
				addName(upper, tabNom[i], tabCompte[i]);
			else
				addName(lower, tabNom[i], tabCompte[i]);
		}
		upper.append(" !");
		insertAnd(upper);
		insertAnd(lower);
		if (lower.length() == 5)
			return upper.toString();

		if (upper.length() > 7) {
			lower.append(". AND ");
			lower.append(upper);
		}
		return lower.toString();

	}

	private static void addName(StringBuilder b, String name, int occurence) {
		b.append(", ");
		b.append(name.substring(0, 1).toUpperCase());
		b.append(name.substring(1));
		if (occurence > 1)
			b.append(" (x" + occurence + ")");
	}
}
