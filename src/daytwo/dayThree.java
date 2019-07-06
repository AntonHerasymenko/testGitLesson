package daytwo;

public class dayThree {

	public static void main(String[] args) {
		
//		Integer i1 = 1;
//		Integer i2 = 10;
//		System.out.println(i1.equals(i2));

		String s = new String("zxcvbn");
		String s1 = new String("zxcvbn");
		
		System.out.println(s1 == s);
		System.out.println(s.intern() == s1.intern());
	}

}
