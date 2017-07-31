import java.util.Scanner;

public class Largest_product_in_a_series {

	public static void main(String[] args) {
		int n, k, max, mul, t;
		String str = new String();

		Scanner input = new Scanner(System.in);

		t = Integer.parseInt(input.nextLine());
		for (int x = 0; x < t; x++) {
			n = input.nextInt();
			k = input.nextInt();
			input.nextLine();
			str = input.nextLine();
			int[] num = new int[str.length()];

			//String to integer array
			for (int i = 0; i < num.length; i++) {
				num[i] = str.charAt(i) - '0';
			}
			
			max=0;
			//Max calculate
			for (int i = 0; i < n - k + 1; i++) {
				mul = 1;
				for (int j = i; j < i + k; j++) {
					mul = mul * num[j];
				}
				if (mul > max)
					max = mul;
			}
			System.out.println(max);
		}
		input.close();
	}
}
