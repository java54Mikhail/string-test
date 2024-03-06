package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	@DisplayName("test of the method concat")
	void concatTest() {
		String hello = "Hello";
		assertEquals("Hello World!!!", hello.concat(" World").concat("!!!"));
	}
	@Test
	void containsTest() {
		String hello = "Hello";
		assertTrue(hello.contains("ell"));
		assertFalse(hello.contains("elo"));
	}
	
	@Test
	@DisplayName("test of the method compareTo")
	void compareToTest() {
		String hello = "hello";
		assertTrue(hello.compareTo("hello")==0);
		assertFalse(hello.compareTo("Hello")==0);
		assertTrue("a".compareTo("b")<0);
		assertEquals(-5, hello.compareTo("meklo"));
	}
	
	@Test
	@DisplayName("test of the method compareToIgnoreCase")
	void compareToIgnoreCaseTest() {
		String hello = "hello";
		assertTrue(hello.compareToIgnoreCase("hello")==0);
		assertTrue(hello.compareToIgnoreCase("Hello")==0);
		assertTrue("a".compareToIgnoreCase("b")<0);
		assertEquals(2, hello.compareToIgnoreCase("flag"));
	}
	
	@Test
	@DisplayName("test of the method startsWith") 
	void startsWithTest() {
		String hello= "Hello my friends!!!";
		assertTrue(hello.startsWith("Hello", 0));
		assertFalse(hello.startsWith("Greating", 0));
		assertTrue(hello.startsWith("my", 6));
	}
	
	@Test
	@DisplayName("test of the method endsWith")
	void endsWithTest() {
		String hello= "Hello my friends!!!";
		assertTrue(hello.endsWith("friends!!!"));
		assertFalse(hello.endsWith("Greating"));
		assertTrue(hello.endsWith("!!!"));
	}
	
	@Test
	@DisplayName("test of the method equalsIgnoreCase")
	void equalsIgnoreCaseTest() {
		String hello = "hello group java54!";
		assertTrue(hello.equalsIgnoreCase("Hello Group JAVA54!"));
		assertFalse(hello.equalsIgnoreCase("Hello Group!"));
	}
	
	@Test
	@DisplayName("test of the method indexOf(String string)")
	void indexOfStringTest() {
		//TODO
	}
	
	@Test
	@DisplayName("test of the method lastIndexOf(int ch)")
	void lastIndexOfCharTest() {
		//TODO
	}
}
