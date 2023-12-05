import java.util.Scanner;

public class UASno5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();
        
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();
        
        double hasil = 0;
        
        switch (operator) {
            case '+':
                hasil = tambah(angka1, angka2);
                break;
            case '-':
                hasil = kurang(angka1, angka2);
                break;
            case '*':
                hasil = kali(angka1, angka2);
                break;
            case '/':
                hasil = bagi(angka1, angka2);
                break;
            default:
                System.out.println("Operator yang dimasukkan tidak valid.");
                return;
        }
        
        System.out.println("Hasil: " + hasil);
    }
    
    public static double tambah(double angka1, double angka2) {
        return angka1 + angka2;
    }
    
    public static double kurang(double angka1, double angka2) {
        return angka1 - angka2;
    }
    
    public static double kali(double angka1, double angka2) {
        return angka1 * angka2;
    }
    
    public static double bagi(double angka1, double angka2) {
        if (angka2 == 0) {
            System.out.println("Tidak dapat melakukan pembagian dengan nol.");
            System.exit(0);
        }
        return angka1 / angka2;
    }
}

