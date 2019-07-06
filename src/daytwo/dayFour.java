package daytwo;

import java.util.Scanner;

public class dayFour {

	public static void main(String[] args) {
		// 1. C помощью циклов нарисовать фигуру

				Scanner scanner = new Scanner(System.in);

//				String star = "*";
//				char oneStar = '*';
//				int i;
//				int counter;
//
//				System.out.print("Введите жалемую высоту рисунка: ");
//				counter = scanner.nextInt();
//
//				for (i = 0; i < counter; i++) {
//					System.out.println(star);
//					star = star + oneStar;
//				}
//				
//				counter--;
//				
//				for (i = counter; i >= 0; i--) {
//					System.out.println(star.substring(0, i));
//				}

				// 2. Вывести только простые числа от 1 до 100
				for (int n = 1; n < 100; n++) {
					boolean simple = true;
					for (int i = 2; i < n; i++) {
						if ((n % i) == 0) {
							simple = false;
							break;
						}
					}
					if (simple)
						System.out.print(n + " ");
				}

				// 3. Нарисовать обои
//
//				System.out.print("Укажи количество вертикальных полос: ");
//				int vertLine = scanner.nextInt();
//
//				System.out.print("укажи ширину обоев: ");
//				int width = scanner.nextInt();
//
//				System.out.print("укажи высоту обоев: ");
//				int high = scanner.nextInt();
//
//				for (int i = 0; i < high; i++) {
//					for (int j = 0; j < vertLine; j++) {
//						for (int a = 0; a < width; a++) {
//							System.out.print('+');
//						}
//						for (int b = 0; b < width; b++) {
//							System.out.print('*');
//						}
//					}
//					System.out.println();
//				}
//			}

	}

}
