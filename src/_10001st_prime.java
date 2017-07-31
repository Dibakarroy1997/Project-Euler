import java.util.Scanner;

public class _10001st_prime {

	public static void main(String[] args) {
		int t;
		Scanner input = new Scanner(System.in);

		t = input.nextInt();
		int[] position = new int[t];

		for (int i = 0; i < position.length; i++) {
			position[i] = input.nextInt();
		}

		input.close();
		int[] prime = new int[maxElement(position)];
		prime[0] = 2;
		int i = 1, j = 3;
		while (i < maxElement(position)) {
			if (isPrime(j)) {
				prime[i] = j;
				++i;
			}
			j += 2;
		}

		for (int j2 = 0; j2 < position.length; j2++) {
			System.out.println(prime[position[j2]-1]);
		}

	}

	public static int maxElement(int[] position) {
		int max = position[0];
		for (int i = 1; i < position.length; i++) {
			if (max < position[i])
				max = position[i];
		}
		return max;
	}

	public static boolean isPrime(int j) {
		for (int i = 3; i * i <= j; i++) {
			if (j % i == 0)
				return false;
		}
		return true;
	}
}
