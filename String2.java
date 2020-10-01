
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
		
		String[] strs3 = { "catdog", "catcat", "1cat1cadodog" };
		for ( String str : strs3 ) {
			System.out.printf("str = %s : %b\n", str, m1.catDog(str));
		}
		
		
	}

}
