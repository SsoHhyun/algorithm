package greedy;

import java.util.Scanner;

public class B2720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int money = sc.nextInt();
			int a, b, c, d, aCharge, bCharge, cCharge;
			a = b = c = d = aCharge = bCharge = cCharge = 0;
			if (money >= 25) {
				if (aCharge >= 10) {
					b = aCharge / 10;
					bCharge = aCharge % (10 * b);
					if (bCharge >= 5) {
						c = bCharge / 5;
						cCharge = bCharge % (5 * c);
						if (cCharge >= 1)
							d = cCharge / 1;
					} else if (1 <= bCharge && bCharge < 5) {
						d = bCharge / 1;
					}
				} else if (aCharge < 10 && aCharge >= 5) {
					c = aCharge / 5;
					cCharge = aCharge % (5 * c);
					if (cCharge >= 1)
						d = cCharge / 1;
				} else if (aCharge >= 1 && aCharge < 5) {
					d = aCharge / 1;
				}
			}
			System.out.println(a + " " + b + " " + c + " " + d);
		}
	}
}
