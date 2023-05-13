package junit;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("Regression")
public class AssertionsEx {
	
	@Test	
	public void test1() {
		
		String str1 = "Simplilearn";
		String str2 = "Simplilearn";
		String str3 = "SimpliLearn";
		String str4 = "null";
		
		boolean flag = true;
		boolean flag1 = false;
		
		int i = 5;
		int j = 10;
		
		String[] expectedArray = {"one", "two", "three"};
	    String[] resultArray =  {"one", "two", "three"};
	    
	    ArrayList<String> list1 = new  ArrayList<String>();
	    list1.add("Mike");
	    list1.add("Shreyas");
	    list1.add("Ann");

		
		Assertions.assertEquals(str1,str2);
		Assertions.assertNotEquals(str1,str3);
		//Assertions.assertEquals(str1,str3);
		Assertions.assertNull(null,str4);
		
		Assertions.assertTrue(flag);
		Assertions.assertFalse(flag1);
		
		Assertions.assertTrue(i<j);
		Assertions.assertFalse(i>j);
		
		Assertions.assertArrayEquals(expectedArray, resultArray);
		Assertions.assertFalse(list1.contains("Divya"));

		Assertions.assertEquals(3, list1.size());
	}

}
