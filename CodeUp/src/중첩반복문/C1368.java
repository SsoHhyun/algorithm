package 중첩반복문;

import java.util.Scanner;

public class C1368 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int k = sc.nextInt();
		String d = sc.nextLine();
		if (d == "R") {
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < 2 * k; j++) {
					if (i + j < (k + h) / 2)
						System.out.print(" ");
					else if (i + j > k + h - 2)
						System.out.print("");
					else
						System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
