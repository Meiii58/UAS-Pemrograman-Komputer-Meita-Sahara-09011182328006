import java.util.Scanner;

public class Buku {
    String judul;
    String penulis;
    int tahunTerbit;
    boolean dipinjam;
    
    public Buku (String judul, String penulis, int tahunTerbit ) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    public void tampilkanInformasi(){
        System.out.println("informasi Buku " + judul + "-" + penulis + "(" + tahunTerbit + ")");
        System.out.println("Status: " + (dipinjam ? "Sedang Dipinjam" : "Tersedia"));
    }

    public void pinjamBuku(){
        if (!dipinjam) {
            System.out.println("Buku berhasil dipinjam");
            dipinjam = true;
        } else {
            System.out.println("buku sedang tidak tersedia untuk dipinjam");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // contoh penerapan kelas buku 
        Buku buku1 = new Buku("Terdidik", "Tara Westover", 2018);
        Buku buku2 = new Buku( "Laut Bercerita",  "leila Salikha Chudori ", 2017);

        buku1.tampilkanInformasi();
        buku2.tampilkanInformasi();

        System.out.println("Apakah Anda ingin meminjam buku 'Laut Bercerita'? (ya/tidak)");
        String jawaban = scanner.nextLine();

        if (jawaban.equalsIgnoreCase("ya")) {
            buku1.pinjamBuku();
            buku1.tampilkanInformasi();
        }else {
            System.out.println("Anda memilih untuk tidak meminjam buku.");
        }
        
        scanner.close();

    }
}
