import java.util.Scanner;

public class Sum_square_difference {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t;
		long n, sumOfSquare, squareOfSum, sum;

		t = input.nextInt();

		while (t > 0) {
			n = input.nextLong();
			sumOfSquare = n * (n + 1) * (2 * n + 1) / 6;
			sum = n * (n + 1) / 2;
			squareOfSum = sum * sum;
			System.out.println(squareOfSum - sumOfSquare);
			t--;
		}
		input.close();
	}
}
