
public class String2 {

	public static void main(String[] args) {
		String2 start = new String2();
		Methods1 m1 = new Methods1();
		Methods2 m2 = new Methods2();
		start.run(m1, m2);
	}

	private void run(Methods1 m1, Methods2 m2) {
//		String[] strs1 = { "The", "AAbb", "Hi-There" };
//		for ( String str : strs1 ) {
//			System.out.printf("str = %s : %s\n", str, m1.doubleChar(str));
//		}
		
//		String[] strs2 = { "abc hi ho", "ABChi hi", "hihi" };
//		for ( String str : strs2 ) {
//			System.out.printf("str = %s : %d\n", str, m1.countHi(str));
//		}
		
//		String[] strs3 = { "catdog", "catcat", "1cat1cadodog" };
//		for ( String str : strs3 ) {
//			System.out.printf("str = %s : %b\n", str, m1.catDog(str));
//		}

//		String[] strs4 = { "aaacodebbb", "codexxcode", "cozexxcope" };
//		for ( String str : strs4 ){
//			System.out.printf("str = %s : %d\n", str, m1.countCode(str));
//		}

//		String[][] strs5 = { {"Hiabc", "abc"}, {"AbC", "HiaBc"}, {"abc", "abXabc"} };
//		for ( String[] strs : strs5 ){
//			System.out.printf("a = %s, b = %s : %b\n", strs[0], strs[1],
//					m1.endOther(strs[0], strs[1]));
//		}

//		String[] strs6 = { "abcxyz", "abc.xyz", "xyz.abc", "abc.xyzxyz", "xyz" };
//		for ( String str : strs6 ){
//			System.out.printf("str = %s : %b\n", str, m1.xyzThere(str));
//		}
		
//		String[] strs7 = { "abcbob", "b9b", "bac", "b12b1b" };
//		for ( String str : strs7 ) {
//			System.out.printf("str = %s : %b\n", str, m1.bobThere(str));
//		}
		
//		String[] strs8 = { "aaxbby", "aaxbb", "yaaxbb", "yaaxbby", "yxyxyxyxy", "x" };
//		for ( String str : strs8 ) {
//			System.out.printf("str = %s : %b\n", str, m1.xyBalance(str));
//		}
		
//		String[][] strs9 = { {"abc", "xyz"}, {"Hi", "There"}, {"xxxx", "There"} };
//		for ( String[] strs : strs9 ) {
//			System.out.printf("a = %s, b = %s : %s\n", strs[0], strs[1],
//					m1.mixString(strs[0], strs[1]));
//		}
		
//		String[] strs10 = { "Hello", "Hello", "Hello" };
//		int[] nums10 = { 3, 2, 1 };
//		for ( int i = 0; i < strs10.length; i++ ) {
//			System.out.printf("str = %s, n = %d : %s\n", strs10[i], nums10[i], 
//					m1.repeatEnd(strs10[i], nums10[i]));
//		}
		
//		String[] strs11 = { "Chocolate", "Chocolate", "Ice Cream" };
//		int[] nums11 = { 4, 3, 2 };
//		for ( int i = 0; i < nums11.length; i++ ) {
//			System.out.printf("str = %s, n = %d : %s\n", strs11[i], nums11[i],
//					m1.repeatFront(strs11[i], nums11[i]));
//		}
		
//		String[][] strs12 = { {"Word", "X"}, {"This", "and"}, {"This", "and"}, {"AAA", ""}, {"AAA",""} };
//		int [] nums12 = { 3, 2, 1, 1, 0 };
//		for ( int i = 0; i < strs12.length; i++ ) {
//			System.out.printf("word = %s, sep = %s, count = %d : %s\n", strs12[i][0], strs12[i][1], nums12[i],
//					m1.repeatSeparator(strs12[i][0], strs12[i][1], nums12[i]));
//		}
		
//		String[] strs13 = { "abXYabc", "abXYabc", "abXYabc" };
//		int[] nums13 = { 1, 2, 3 };
//		for ( int i = 0; i < strs13.length; i++ ) {
//			System.out.printf("str = %s, n = %d : %b\n", strs13[i], nums13[i],
//					m2.prefixAgain(strs13[i], nums13[i]));
//		}
		
//		String[] strs14 = { "AAxyzBB", "AxyzBB", "AxyzBBB", "AAAxyzBB", "", "xy" };
//		for ( String str : strs14 ) {
//			System.out.printf("str = %s : %b\n", str, m2.xyzMiddle(str));
//		}
		
//		String[] strs15 = { "breadjambread", "xxbreadjambreadyy", "xxbreadyy", "breadbreadbreadbread" };
//		for ( String str : strs15 ) {
//			System.out.printf("str = %s : %s\n", str, m2.getSandwich(str));
//		}
		
//		String[] strs16 = { "xy*yzz", "xy*zzz", "*xa*az", "", "*", "**", "abcDEF" };
//		for ( String str : strs16 ) {
//			System.out.printf("str = %s : %b\n", str, m2.sameStarChar(str));
//		}

//		String[] strs17 = { "abc", "tca", "tcagdo" };
//		for ( String str : strs17 ){
//			System.out.printf("str = %s : %s\n", str, m2.oneTwo(str));
//		}

//		String[] strs18 = { "zipXzap", "zopzop", "zzzopzop", "abcppp", "azbcppp" };
//		for ( String str : strs18 ){
//			System.out.printf("str = %s : %s\n", str, m2.zipZap(str));
//		}

//		String[] strs19 = { "ab*cd", "ab**cd", "sm*eilly", "stringy*", "*stringy" };
//		for ( String str : strs19 ) {
//			System.out.printf("str = %s : %s\n", str, m2.starOut(str));
//		}

//		String[][] strs20 = { {"12xy34", "xy"}, {"12xy34", "1"}, {"12xy34xyabcxy", "xy"} };
//		for ( String[] strs : strs20 ) {
//			System.out.printf("str = %s, word = %s : %s\n", strs[0], strs[1],
//					m2.plusOut(strs[0], strs[1]));
//		}
		
		String[][] strs21 = { {"abc1xyz11", "1"}, {"abcXY123XYijk", "XY"}, {"XY123XY", "XY"}, {"XY1XY", "XY"} };
		for ( String[] strs : strs21 ) {
			System.out.printf("str = %s, word = %s : %s\n", strs[0], strs[1],
					m2.wordEnds(strs[0], strs[1]));
		}
		
		
	}

}
