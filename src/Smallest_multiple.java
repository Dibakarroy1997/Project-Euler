import java.util.Scanner;

public class Smallest_multiple {

	public static boolean isPrime(int n) {
		for (int i = 2; Math.pow(i, 2) <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static double maxPow(int i, int n) {
		int j = 1;
		while (true) {
			if (Math.pow(i, j) > n)
				break;
			j++;
		}

		return (j - 1);
	}

	public static void main(String[] args) {
		int t, n, result;

		Scanner input = new Scanner(System.in);
		t = input.nextInt();
		while (t > 0) {
			result = 1;
			n = input.nextInt();
			for (int i = 2; i <= n; i++) {
				if (isPrime(i)) {
					result = (int) (result * Math.pow(i, maxPow(i, n)));
				}

			}
			System.out.println(result);
			t--;
		}

	}
}
