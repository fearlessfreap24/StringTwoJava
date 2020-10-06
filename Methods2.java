
public class Methods2 {

	public boolean prefixAgain(String str, int n) {

//		Given a string, consider the prefix string made of the first N chars of the 
//		string. Does that prefix string appear somewhere else in the string? Assume 
//		that the string is not empty and that N is in the range 1..str.length().
//
//		prefixAgain("abXYabc", 1) → true
//		prefixAgain("abXYabc", 2) → true
//		prefixAgain("abXYabc", 3) → false
		
		String endOfWord = str.substring(n);
		String prefix = str.substring(0, n);
		
		return endOfWord.contains(prefix);
	}

	public boolean xyzMiddle(String str) {
		
//		Given a string, does "xyz" appear in the middle of the string? To define middle, 
//		we'll say that the number of chars to the left and right of the "xyz" must differ 
//		by at most one. This problem is harder than it looks.
//
//		xyzMiddle("AAxyzBB") → true
//		xyzMiddle("AxyzBB") → true
//		xyzMiddle("AxyzBBB") → false
		
		if ( str.length() < 3 ) return false;
		int strHalf = str.length() / 2;
		String firstHalf = str.substring(0, strHalf);
		String lastHalf = str.substring(strHalf);
		
		if ( str.length() % 2 == 1 ) {
			return firstHalf.substring(firstHalf.length() - 1).equals("x") 
					&& lastHalf.substring(0, 2).equals("yz");
		}
		else {
			return (firstHalf.substring(firstHalf.length() - 2).equals("xy") 
					&& lastHalf.substring(0, 1).equals("z"))
					|| firstHalf.substring(firstHalf.length() - 1).equals("x") 
					&& lastHalf.substring(0, 2).equals("yz");
		}
		
	}

	public String getSandwich(String str) {

//		A sandwich is two pieces of bread with something in between. Return the string that 
//		is between the first and last appearance of "bread" in the given string, or return 
//		the empty string "" if there are not two pieces of bread.
//
//		getSandwich("breadjambread") → "jam"
//		getSandwich("xxbreadjambreadyy") → "jam"
//		getSandwich("xxbreadyy") → ""
		String getsandwich = "";
		int bread1 = str.indexOf("bread");
		if ( bread1 + 5 > str.length() ) return "";
		else bread1 = bread1 + 5;
		int bread2 = str.lastIndexOf("bread");
		if ( bread1 == bread2 + 5 ) return "";
		if ( bread1 > 0 && bread2 > 0 ) {
			getsandwich = str.substring(bread1, bread2);
		}
		return getsandwich;
	}

	public boolean sameStarChar(String str) {

//		Returns true if for every '*' (star) in the string, if there are chars both immediately 
//		before and after the star, they are the same.
//
//		sameStarChar("xy*yzz") → true
//		sameStarChar("xy*zzz") → false
//		sameStarChar("*xa*az") → true
		
//		found answer here : https://stackoverflow.com/questions/22443662/codingbat-samestarchar-exercise
//		answer number 2
		
		for ( int i = 1; i < str.length() - 1; i++ ) {
			if ( str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1) ) {
				return false; 
			}
		}
		return true;
	}
}
