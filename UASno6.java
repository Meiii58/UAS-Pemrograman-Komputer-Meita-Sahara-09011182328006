import java.util.Scanner;

public class UASno6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan kata atau frase: ");
        String kata = input.nextLine();
        
        if (isPalindrom(kata)) {
            System.out.println(kata + " adalah palindrom.");
        } else {
            System.out.println(kata + " bukan palindrom.");
        }
    }
    
    public static boolean isPalindrom(String kata) {
        StringBuilder reversed = new StringBuilder();
        kata = kata.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        for (int i = kata.length() - 1; i >= 0; i--) {
            reversed.append(kata.charAt(i));
        }
        
        return kata.equals(reversed.toString());
    }
}

