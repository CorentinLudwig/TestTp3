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
		assertEquals("Hello, Jerry and Bob", Welcome.welcome("jerry,bob"));
	}
	
	@Test
	void exo5() {
		assertEquals("Hello, Jerry, Bob and Amy", Welcome.welcome("jerry,bob,amy"));
	}
	
	@Test
	void exo6() {
		assertEquals("Hello, Amy and Jerry. AND HELLO, BOB !", Welcome.welcome("amy,BOB,jerry"));
		assertEquals("Hello, Amy. AND HELLO, BOB AND JERRY !", Welcome.welcome("amy,BOB,JERRY"));
	}
	
	@Test
	void exo7() {
		assertEquals("Hello, Bob, Amy and Jerry", Welcome.welcome("bob,amy,jerry"));
		assertEquals("Hello, Bob and Jerry. AND HELLO, AMY AND JACK !", Welcome.welcome("bob,AMY,jerry,JACK"));
	}
	
	
	@Test
	void exo8() {
		assertEquals("Hello, Bob, Amy and Jerry", Welcome.welcome("    bob    ,amy,   jerry"));
	}
}
