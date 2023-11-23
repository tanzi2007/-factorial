import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x=");
        double x = scanner.nextDouble();
        long x_integer;
        double result = 1;
        if (x < 0 && x % 1 == 0) {
            x_integer = (long) x;
            System.out.println(x_integer + "! 无意义");
        } else if (x == 0) {
            System.out.println("0!=1");
        } else if (x % 1 == 0 && x > 0) {
            for (int i = 2; i <= x; i++) {
                result = result * i;
            }
            if (x < 15) {
                x_integer = (long) x;
                long result_integer = (long) result;
                System.out.println(x_integer + "!=" + result_integer);
            } else {
                System.out.println(x + "!=" + result);
            }
        } else {
            double x_min = x % 1;
            int N = 10000;
            double k = x;
            if (x < 1 && x > -1) {
                result = result * Math.pow(N, x);
                for (double n = 1; n <= N; n++) {
                    result = result * (n / (x + n));
                }
                System.out.println(x + "!=" + result);
            } else {
                if (x > 1) {
                    while (k > 1) {
                        result = result * k;
                        k--;
                    }
                    result = result * Math.pow(N, x_min);
                    for (double n = 1; n <= N; n++) {
                        result = result * (n / (x_min + n));
                    }
                    System.out.println(x + "!=" + result);
                } else {
                    result = result * Math.pow(N, x);
                    for (double n = 1; n <= N; n++) {
                        result = result * (n / (x + n));
                    }
                    System.out.println(x + "!=" + result);
                }
            }
        }
    }
}