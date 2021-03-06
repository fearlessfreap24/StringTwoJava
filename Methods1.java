
public class Methods1 {

	public String doubleChar(String str) {

//		Given a string, return a string where for every char in the original, 
//		there are two chars.
//
//		doubleChar("The") → "TThhee"
//		doubleChar("AAbb") → "AAAAbbbb"
//		doubleChar("Hi-There") → "HHii--TThheerree"
		
		String[] splitStr = str.split("");
		String retstr = "";
		for ( int i = 0; i < splitStr.length; i++ ) {
			retstr = retstr + splitStr[i] + splitStr[i]; 
		}
		return retstr;
	}

	public int countHi(String str) {

//		Return the number of times that the string "hi" appears anywhere in the 
//		given string.
//
//		countHi("abc hi ho") → 1
//		countHi("ABChi hi") → 2
//		countHi("hihi") → 2
		
		int count = 0;
		String[] splitStr = str.split("");
		for ( int i = 0; i < splitStr.length - 1; i++ ) {
			if ( splitStr[i].equals("h") && splitStr[i+1].equals("i") ) count++;
		}
		return count;
	}

	public boolean catDog(String str) {

//		Return true if the string "cat" and "dog" appear the same number of times
//		in the given string.
//
//		catDog("catdog") → true
//		catDog("catcat") → false
//		catDog("1cat1cadodog") → true

		int cat = 0;
		int dog = 0;
		for ( int i = 0; i < str.length() - 2; i++ ) {
			String sub3 = str.substring(i, i+3);
			if (str.substring(i, i + 3).contains("cat")) cat++;
			if (str.substring(i, i + 3).contains("dog")) dog++;
		}
		return cat == dog;
	}

	public int countCode(String str) {

//		Return the number of times that the string "code" appears anywhere in t
//		he given string, except we'll accept any letter for the 'd', so "cope"
//		and "cooe" count.
//
//		countCode("aaacodebbb") → 1
//		countCode("codexxcode") → 2
//		countCode("cozexxcope") → 2

		int countcode = 0;
		for ( int i = 0; i < str.length() - 3; i++ ){
			String sub4 = str.substring(i, i+4);
			if (sub4.substring(0, 2).equals("co") && sub4.substring(sub4.length() - 1).equals("e")){
				countcode++;
			}
		}

		return countcode;
	}

	public boolean endOther(String a, String b) {

//		Given two strings, return true if either of the strings appears at the very
//		end of the other string, ignoring upper/lower case differences (in other
//		words, the computation should not be "case sensitive"). Note: str.toLowerCase()
//		returns the lowercase version of a string.
//
//		endOther("Hiabc", "abc") → true
//		endOther("AbC", "HiaBc") → true
//		endOther("abc", "abXabc") → true

		String aLower = a.toLowerCase();
		String bLower = b.toLowerCase();
//		System.out.printf("aLower = %s, bLower = %s\n", aLower, bLower);
		int aLen = a.length() - 1;
		int bLen = b.length() - 1;

		if ( aLen < bLen ){
			return bLower.substring(bLen - aLen).equals(aLower);
		}
		else {
			return aLower.substring(aLen - bLen).equals(bLower);
		}

	}

	public boolean xyzThere(String str) {

//		Return true if the given string contains an appearance of "xyz" where the xyz
//		is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
//
//		xyzThere("abcxyz") → true
//		xyzThere("abc.xyz") → false
//		xyzThere("xyz.abc") → true

		boolean xyzthere = false;
		if ( str.length() == 3 && str.contains("xyz") ) return true;
		for ( int i = 0; i < str.length() - 3; i++ ){
			String sub3 = str.substring(i, i+4);
			if ( sub3.contains("xyz") ) {
				xyzthere = true;
				if ( sub3.contains(".xyz") ) xyzthere = false;
			}
		}
		return xyzthere;
	}

	public boolean bobThere(String str) {

//		Return true if the given string contains a "bob" string, but where the middle 
//		'o' char can be any char.
//
//		bobThere("abcbob") → true
//		bobThere("b9b") → true
//		bobThere("bac") → false
		
		if ( str.length() < 2 ) return false;
//		if ( str.length() == 3 ) {
//			return str.substring(0, 1).equals("b") && str.substring(2).equals("b");
//		}
		for ( int i = 0; i < str.length() - 2; i++ ) {
			String sub3 = str.substring(i, i+3);
			if ( sub3.substring(0,1).equals("b") && sub3.substring(2).equals("b") ) return true;
		}
		return false;
	}

	public boolean xyBalance(String str) {

//		We'll say that a String is xy-balanced if for all the 'x' chars in the string, there 
//		exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is 
//		not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
//
//		xyBalance("aaxbby") → true
//		xyBalance("aaxbb") → false
//		xyBalance("yaaxbb") → false
		
		String[] splitStr = str.split("");
		int xCount = 0;
		int yCount = 0;
		for ( int i = 0; i < splitStr.length; i++ ) {
			if ( splitStr[i].equals("x") ) xCount = i+1;
			if ( splitStr[i].equals("y") ) yCount = i+1;
		}
		return xCount <= yCount;
	}

	public String mixString(String a, String b) {

//		Given two strings, a and b, create a bigger string made of the first char of a, the first 
//		char of b, the second char of a, the second char of b, and so on. Any leftover chars go at 
//		the end of the result.
//
//		mixString("abc", "xyz") → "axbycz"
//		mixString("Hi", "There") → "HTihere"
//		mixString("xxxx", "There") → "xTxhxexre"
		
		int aLen = a.length() - 1;
		int bLen = b.length() - 1;
		String mixstring = "";
		
		for ( int i = 0; i <= Math.max(aLen, bLen); i++ ) {
			if ( i > aLen ) { mixstring = mixstring + b.charAt(i); }
			else if ( i > bLen ) { mixstring = mixstring + a.charAt(i); }
			else { mixstring = mixstring + a.charAt(i) + b.charAt(i); }
		}
		return mixstring;
	}

	public String repeatEnd(String str, int n) {

//		Given a string and an int n, return a string made of n repetitions of the last n characters 
//		of the string. You may assume that n is between 0 and the length of the string, inclusive.
//
//
//		repeatEnd("Hello", 3) → "llollollo"
//		repeatEnd("Hello", 2) → "lolo"
//		repeatEnd("Hello", 1) → "o"
		
		String subEnd = str.substring(str.length() - n );
		String repeatend = "";
		for ( int i = 0; i < n; i++ ) {
			repeatend = repeatend + subEnd;
		}
		
		return repeatend;
	}

	public String repeatFront(String str, int n) {

//		Given a string and an int n, return a string made of the first n characters of the string, 
//		followed by the first n-1 characters of the string, and so on. You may assume that n is between 
//		0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
//
//		repeatFront("Chocolate", 4) → "ChocChoChC"
//		repeatFront("Chocolate", 3) → "ChoChC"
//		repeatFront("Ice Cream", 2) → "IcI"
		
		String repeatfront = "";
		for ( int i = n; i >= 0; i-- ) {
			repeatfront = repeatfront + str.substring(0, i);
		}
		
		return repeatfront;
	}

	public String repeatSeparator(String word, String sep, int count) {

//		Given two strings, word and a separator sep, return a big string made of count occurrences of 
//		the word, separated by the separator string.
//
//		repeatSeparator("Word", "X", 3) → "WordXWordXWord"
//		repeatSeparator("This", "And", 2) → "ThisAndThis"
//		repeatSeparator("This", "And", 1) → "This"
		
		if ( count == 0 ) return "";
		String repeatseparator = "";
		for ( int i = count - 1; i > 0; i-- ) {
			repeatseparator = repeatseparator + word + sep;
		}
		
		return repeatseparator + word;
	}
}
