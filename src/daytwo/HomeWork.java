package daytwo;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// 1.Вывести шестизначное число
		int i = 0;

		System.out.print("Введите шестизначное число: ");
		char[] numbers = scanner.next().toCharArray();

		while (i < 6) {
			if (numbers.length < 6) {
			System.out.println(numbers[i]);
			++i;
			} else {
				i = 6;
				System.out.println("Не верное значение числа. ");
			}
		}

		System.out.println();
		
		//2.Вывести площадь прямоугольного треугольника
//		double sideA;
//		double sideB;
//		
//		System.out.print("Введите значение стороны А:");
//		sideA = scanner.nextDouble();
//		System.out.print("Введите значение стороны В:");
//		sideB = scanner.nextDouble();
//		
//		double s = (sideA * sideB) / 2;
//		System.out.print("Area triangle: " + s);
		
			//или по Герону
//		double sideA;
//		double sideB;
//		double sideC;
//		
//		System.out.print("Введите значение стороны А:");
//		sideA = scanner.nextDouble();
//		System.out.print("Введите значение стороны В:");
//		sideB = scanner.nextDouble();
//		System.out.print("Введите значение стороны C:");
//		sideC = scanner.nextDouble();
//		
//		double p = (sideA + sideB + sideC) / 2;
//		double s = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
//		
//		System.out.print("Area triangle: " + s);
//		
//		
//		System.out.println();
		
		//3.Вывести длину окружности
//		double radiusR;
//		System.out.print("Введите значение радиуса R: ");
//		radiusR = scanner.nextDouble();
//		double l = 2 * Math.PI * radiusR;
//		System.out.print("Circumference: " + l );
//		
//		System.out.println();
	}
}