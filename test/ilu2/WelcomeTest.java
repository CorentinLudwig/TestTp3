package ilu2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WelcomeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void exo1() {
		assertEquals("Hello, Bob", Welcome.welcome("bob"));
	}
	
	@Test
	void exo2() {
		assertEquals("Hello, my friend", Welcome.welcome(""));
		assertEquals("Hello, my friend", Welcome.welcome("\n"));

	}

	@Test
	void exo3() {
		assertEquals("HELLO, JERRY !", Welcome.welcome("JERRY"));
	}
	
	@Test
	void exo4() {
		assertEquals("Hello, Jerry, Bob", Welcome.welcome("jerry,bob"));
	}
	
	@Test
	void exo5() {
		assertEquals("Hello, Jerry, Bob, Amy", Welcome.welcome("jerry,bob,amy"));
	}
	
	@Test
	void exo6() {
		assertEquals("Hello, Amy, Jerry. AND HELLO, BOB !", Welcome.welcome("Amy,BOB,Jerry"));
		assertEquals("Hello, Amy. AND HELLO, BOB, JERRY !", Welcome.welcome("Amy,BOB,JERRY"));
	}
	
	
//	public static String welcome(String input) {
//	if(input.isBlank())
//		return "Hello, my friend";
//	
//	String[] tabinput = input.split(",");
//	StringBuilder wel = new StringBuilder();
//	StringBuilder upper = new StringBuilder();
//	wel.append("Hello, ");
//	upper.append("HELLO, ");
//	
//	
//	for(int i = 0; i<tabinput.length; i++) {
//		if(tabinput[i].equals(tabinput[i].toUpperCase())){
//			upper.append(tabinput[i]);
//
//		} else {
//			wel.append(tabinput[i].substring(0, 1).toUpperCase());
//			wel.append(tabinput[i].substring(1));
//			if(i<tabinput.length-1)
//				wel.append(", ");
//			}
//	}
//	if(upper.length()>7) {
//		upper.append(" !");
//		wel.append(". AND ");
//		wel.append(upper);
//	}
//	if(wel.length()>7)
//		return upper.toString();
//	return wel.toString();
//}
}
