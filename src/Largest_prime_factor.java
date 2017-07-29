import java.util.Scanner;

public class Largest_prime_factor {

	static long largestFactor;
	
	private static void findFactor(long n) {
		long[] factor = new long[2];
		for (int j = 2; Math.pow(j, 2) <= n; j++) {
			if (n % j == 0) {
				factor[0] = j;
				factor[1] = (int) (n / j);
				isPrime(factor);
			}
		}
	}

	public static void isPrime(long[] factor) {
		boolean check;
		for (int i = 0; i < 2; i++) {
			check = true;
			for (int j = 2; Math.pow(j, 2) <= factor[i]; j++) {
				if (factor[i] % j == 0) {
					check = false;
					break;
				}
			}
			if (check && factor[i] >= largestFactor) {
				largestFactor = factor[i];
			}
		}
	}
	
	private static boolean isPrime(long n) {
		boolean check = true;
		for (int j = 2; Math.pow(j, 2) <= n; j++) {
			if (n % j == 0) {
				check = false;
				break;
			}
		}
		return(check);
	}

	public static void main(String[] args) {
		int t;
		long n;

		Scanner input = new Scanner(System.in);
		t = input.nextInt();
		for (int i = 0; i < t; i++) {
			largestFactor = 0;
			n = input.nextLong();
			if(isPrime(n))
				System.out.println(n);
			else {
				findFactor(n);
				System.out.println(largestFactor);
			}
		}
	}
}
