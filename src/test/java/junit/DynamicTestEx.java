package junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import code.StringFunction;

public class DynamicTestEx {
	
	@TestFactory
	public Collection<DynamicTest> method1() {

		return Arrays.asList(

				DynamicTest.dynamicTest("Positive Test",
						() -> Assertions.assertTrue(StringFunction.palindromeCheck("madam"))),
				DynamicTest.dynamicTest("Negative Test",
						() -> Assertions.assertFalse(StringFunction.palindromeCheck("Anoopa"))),
				DynamicTest.dynamicTest("Negative Test",
						() -> Assertions.assertFalse(StringFunction.palindromeCheck("Shreyas")))

		);

	}


}
