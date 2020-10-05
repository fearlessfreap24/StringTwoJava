
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
		
		String[] strs8 = { "aaxbby", "aaxbb", "yaaxbb", "yaaxbby", "yxyxyxyxy", "x" };
		for ( String str : strs8 ) {
			System.out.printf("str = %s : %b\n", str, m1.xyBalance(str));
		}
		
		
	}

}
