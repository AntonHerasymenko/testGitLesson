package daytwo;

import java.util.Arrays;

public class Lesson4 {

	public static void main(String[] args) {
		String[] strings = {"abc", "y", "op", "bcd", "z"};
		System.out.println(Arrays.deepToString(strings));
		
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));
		
		Arrays.sort(strings, Lesson4 :: expand);
		
		System.out.println(Arrays.toString(strings));
	}
	
	public static int reverse(String str1, String str2) {
		return str2.compareTo(str1);
	}
	
	public static int expand(String str1, String str2) {
		if (str1.length() > str2.length()) {
			return 1;
		}else if(str1.length() == str2.length()){
			return str1.compareToIgnoreCase(str2);
		} else {
			return -1;
		}
			
	}

}
