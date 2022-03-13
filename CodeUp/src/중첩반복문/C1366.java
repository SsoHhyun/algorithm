package 중첩반복문;

import java.util.Scanner;

public class C1366 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n / 2 || i == n - 1 || j == 0 || j == n / 2 || j == n - 1) {
					System.out.print("*");
				} else {
					if (j == i || j + i == n - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}

	}

}
