package 중첩반복문;

import java.util.Scanner;

public class C1357 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} // 정삼각형 for문
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
