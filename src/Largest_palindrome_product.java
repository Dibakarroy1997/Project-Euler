import java.util.Scanner;

public class Largest_palindrome_product {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t, n, maxNum, checkNum;
		String checkStr;

		t = input.nextInt();

		while (t > 0) {
			maxNum = 0;
			n = input.nextInt();
			for (int j = 100; j < 1000; j++) {
				for (int j2 = 100; j2 < 1000; j2++) {
					checkNum = j * j2;
					if (checkNum == reverse(checkNum)) {
						if (checkNum < n && checkNum > maxNum)
							maxNum = checkNum;
					}

				}
			}
			System.out.println(maxNum);
			t--;
		}
	}

	public static int reverse(int checkNum) {
		int num, rev;
		num = checkNum;
		rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		return rev;
	}
}
