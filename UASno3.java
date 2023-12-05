import java.util.Scanner;

public class UASno3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah suku Fibonacci yang ingin ditampilkan: ");
        int n = input.nextInt();

        System.out.println("Deret Fibonacci hingga suku ke-" + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
