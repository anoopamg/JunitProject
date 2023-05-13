package junit;

import org.junit.jupiter.api.Test;

import code.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;

@Tag("Sanity")
public class CalculatorTest {
	
	@DisplayName("Two +ve numbers")
	@Test
	public void test1() {
		int result = Calculator.add(4, 5);
		Assertions.assertEquals(9,result);
		System.out.println(result);
	}
	
	@DisplayName("+ve and -ve numbers")
	@Test
	public void test2() {
		int result = Calculator.add(-4, 5);
		Assertions.assertEquals(1,result);
		System.out.println(result);
	}

	@DisplayName("Negative test")
	//@RepeatedTest(5)
	public void test3() {
		int result = Calculator.add(4, 5);
		Assertions.assertNotEquals(10,result);
		System.out.println(result);
	}
	
	@CustomAnnotation
	public void test4() {
		int result = Calculator.add(4, 5);
		Assertions.assertNotEquals(10,result);
		System.out.println(result);
	}
}
