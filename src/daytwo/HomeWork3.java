package daytwo;

import java.util.Arrays;

public class HomeWork3 {

	public static void main(String[] args) {

		Integer[] intArr = new Integer[10];

		int[] arr2 = { 1, 2, 3 };
		int[] arr3 = arr2;

		arr3[1] = 200;

		System.out.println(Arrays.toString(arr2));

//		
//		Arrays.fill(intArr, 1);
//		for (Integer i : intArr) {}

	}

}
