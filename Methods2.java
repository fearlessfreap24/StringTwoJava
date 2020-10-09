
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
		
//		Since I copied this code, I'll explain how it works
		
//		loop over the letters in the word until the last one
		for ( int i = 1; i < str.length() - 1; i++ ) {
//			if the character at 'i' is a '*', check to see if the characters around it are the same.
			if ( str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1) ) {
//				if they aren't the same, return false
				return false; 
			}
		}
//		else, return true
		return true;
		
//		my original code was similar to this. When I ran it, everything worked except for "abcDEF".
//		There's no explanation that if there are no '*' that it should be true. That's why this code
//		I found only checks if the characters around the start are not the same.
	}

    public String oneTwo(String str) {

//		Given a string, compute a new string by moving the first char to come after the next two chars,
//		so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef"
//		yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
//
//		oneTwo("abc") → "bca"
//		oneTwo("tca") → "cat"
//		oneTwo("tcagdo") → "catdog"

		String onetwo = "";
		int strLenDiv3 = str.length() / 3;
		for ( int i = 0; i < strLenDiv3; i++ ){
			char one = str.substring(i*3).charAt(0);
			char two = str.substring(i*3).charAt(1);
			char three = str.substring(i*3).charAt(2);
			onetwo = onetwo + two + three + one;
		}
		return onetwo;
    }

	public String zipZap(String str) {

//		Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending
//		with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap"
//		yields "zpXzp".
//
//		zipZap("zipXzap") → "zpXzp"
//		zipZap("zopzop") → "zpzp"
//		zipZap("zzzopzop") → "zzzpzp"

		String zipzap = "";
		if ( str.length() < 3 ) return str;
		if ( str.length() == 3 && str.charAt(0) == 'z' && str.charAt(2) == 'p') return "zp";
		if ( str.length() == 3 ) return str;
		for ( int i = 0; i < str.length() - 2; i++ ){
			char one = str.substring(i).charAt(0);
			char three = str.substring(i).charAt(2);
			if ( one == 'z' && three == 'p' ){
				zipzap = zipzap + one + three;
				i = i + 2;
			}
			else if ( i == str.length() - 3 && ( one != 'z' || three != 'p') ){
				zipzap = zipzap + str.substring(i);
			}
			else zipzap = zipzap + str.charAt(i);
		}
		return zipzap;
	}

	public String starOut(String str) {

//		Return a version of the given string, where for every star (*) in the string the star and
//		the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd"
//		also yields "ad".
//
//		starOut("ab*cd") → "ad"
//		starOut("ab**cd") → "ad"
//		starOut("sm*eilly") → "silly"

		int length = str.length();
		String starout = "";

		for (int i = 0; i < length; i++) {
			if (i == 0 && str.charAt(i) != '*') starout += str.charAt(i);
			if (i > 0 && str.charAt(i) != '*' && str.charAt(i-1) != '*') starout += str.charAt(i);
			if (i > 0 && str.charAt(i) == '*' && str.charAt(i-1) != '*') starout = starout.substring(0,starout.length()-1);
		}
		return starout;

	}

	public String plusOut(String str, String word) {

//		Given a string and a non-empty word string, return a version of the original String where
//		all chars have been replaced by pluses ("+"), except for appearances of the word string
//		which are preserved unchanged.
//
//		plusOut("12xy34", "xy") → "++xy++"
//		plusOut("12xy34", "1") → "1+++++"
//		plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
		
		String plusout = "";
		int wordLen = word.length();
		int difWordStr = str.length() - word.length();
		for ( int i = 0; i < str.length() - word.length(); i++ ){
			if ( i >= difWordStr && i < wordLen ) plusout += '+';
			if ( str.substring(i).indexOf(word) != 0 ) plusout += '+';
			if ( str.substring(i).indexOf(word) == 0 ){
				plusout += str.substring(i, i + wordLen );
				i += wordLen;
			}
			else plusout += '+';
		}
		return plusout;
	}
}
