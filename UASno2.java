import java.util.Scanner;

public class UASno2 {
    public static void main(String[] args) {
        String username = "meita";
        String password = "meii";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }
    }
}
