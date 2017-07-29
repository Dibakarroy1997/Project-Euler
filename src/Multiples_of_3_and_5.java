
import java.util.Scanner;

public class Multiples_of_3_and_5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextInt();
            long end = n-1;
            long sum = 0;
            long three_mul = end / 3;
            sum = sum + ((three_mul*(three_mul+1))*3)/2;
            long five_mul = end / 5;
            sum = sum + ((five_mul*(five_mul+1))*5)/2;
            long fifteen_mul = end / 15;
            sum = sum - ((fifteen_mul*(fifteen_mul+1))*15)/2;
            System.out.println(sum);
        }
    }
}
