import java.util.*;

public class KelolaBuku {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    
    public void menuBuku() {
        System.out.print("Masukkan judul buku: ");
        String judul = input.nextLine();
        System.out.print("Masukkan nama penulis: ");
        String penulis = input.nextLine();

        Buku buku = new Buku(judul, penulis);
        daftarBuku.add(buku);

        System.out.println("Buku berhasil ditambahkan!");
        listBuku();
    }

    public ArrayList<Buku> getDaftarBuku() {
    return daftarBuku;
    } 

    private void listBuku() {
        System.out.println("\n=== Daftar Buku ===");
        for (Buku b : daftarBuku) {
            System.out.println("- " + b);
        }
    }

    
}
