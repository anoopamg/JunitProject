package junit;

import code.StringFunction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("Sanity")
public class PalindromeTest {
	
	@Test
	public void test1() {
		Assertions.assertTrue(StringFunction.palindromeCheck("Malayalam"));
	}
	
	@Test
	public void test2() {
		Assertions.assertTrue(StringFunction.palindromeCheck("Malayalam1"));
		//This will fail as its checking if boolean is true, ie string is palindrome
	}
	
	@Test
	public void test3() {
		Assertions.assertFalse(StringFunction.palindromeCheck("Malayalam1"));
		//This will pass as its checking if boolean is false, ie string is NOT palindrome
	}

}
