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
	}
}
