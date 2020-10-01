
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

		int cat = 0;
		int dog = 0;
		for ( int i = 0; i < str.length() - 3; i++ ) {
			if ( str.substring(i, i+3).indexOf("cat") > -1 ) cat++;
			if ( str.substring(i, i+3).indexOf("dog") > -1 ) dog++;
		}
		return cat == dog;
	}

}
