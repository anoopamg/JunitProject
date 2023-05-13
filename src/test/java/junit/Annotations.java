package junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import code.Calculator;

public class Annotations {

	@BeforeAll
	public static void testA() {
		System.out.println("Before All");
	}
	
	@BeforeEach
	public void testB() {
		System.out.println("Before Each");
	}
	
	@Test
	public void test1() {
		int result = Calculator.add(4, 5);
		Assertions.assertEquals(9,result);
		System.out.println(result);
	}
	
	@AfterEach
	public void testB1() {
		System.out.println("After Each");
	}
	@AfterAll
	public static void testA1() {
		System.out.println("After All");
	}
}
