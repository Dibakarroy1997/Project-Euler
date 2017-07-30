import java.util.Scanner;

public class Even_Fibonacci_numbers { 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long a, b, n, show, sum, range;
		n = input.nextLong();
		for (long i = 0; i < n; i++) {
			show = 0L;
			a = 0;
			b = 2;
			range = input.nextLong();
			sum = b;
			while (b <= range) {
				sum+=show;
				show = a + 4*b;
				a = b;
				b = show;
				
			} 
			System.out.println(sum);
		}

	}
}
