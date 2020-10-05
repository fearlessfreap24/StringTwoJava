
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
		for ( int i = 0; i < str.length() - 3; i++ ){
			String sub3 = str.substring(i, i+4);
			xyzthere = sub3.contains("xyz") && !sub3.equals(".xyz");
		}
		return xyzthere;
	}
}
