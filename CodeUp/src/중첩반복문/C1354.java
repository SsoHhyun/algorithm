package 중첩반복문;

import java.util.Scanner;

public class C1354 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
