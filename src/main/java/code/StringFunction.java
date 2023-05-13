package code;

public class StringFunction {

	public static boolean palindromeCheck(String str) {
		
		String resultStr = "";
		String palindrome = str;
		//System.out.println(palindrome);
		boolean flag = false;
		for (int i = palindrome.length() - 1; i >= 0; i--) {
			resultStr = resultStr + palindrome.charAt(i);
		}
		System.out.println(resultStr);
		if(resultStr.equalsIgnoreCase(palindrome)) {
			flag = true;
		}
		return flag;
	}
}
