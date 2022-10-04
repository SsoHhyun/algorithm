import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2439 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i + j < N-1)
					System.out.print(" ");
				if (i + j >= N-1)
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
