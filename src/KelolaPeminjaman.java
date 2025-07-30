import java.util.*;

public class KelolaPeminjaman {
    private ArrayList<Peminjaman> daftarPeminjaman = new ArrayList<>();
    private ArrayList<Buku> daftarBuku;
    private ArrayList<Anggota> daftarAnggota;
    private Scanner scanner = new Scanner(System.in);

    public KelolaPeminjaman(ArrayList<Buku> daftarBuku, ArrayList<Anggota> daftarAnggota) {
        this.daftarBuku = daftarBuku;
        this.daftarAnggota = daftarAnggota;
    }

    public void rakPinjaman() {
        if (daftarBuku.isEmpty() || daftarAnggota.isEmpty()) {
            System.out.println("Data buku atau anggota belum tersedia.");
            return;
        }

        System.out.println("\n== Daftar Buku ==");
        for (int i = 0; i < daftarBuku.size(); i++) {
            System.out.println((i + 1) + ". " + daftarBuku.get(i));
        }

        System.out.print("Pilih nomor buku yang ingin dipinjam: ");
        int pilihBuku = scanner.nextInt() - 1;
        scanner.nextLine(); // clear buffer

        System.out.println("\n== Daftar Anggota ==");
        for (int i = 0; i < daftarAnggota.size(); i++) {
            System.out.println((i + 1) + ". " + daftarAnggota.get(i));
        }

        System.out.print("Pilih nomor anggota yang meminjam: ");
        int pilihAnggota = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        Peminjaman peminjaman = new Peminjaman(daftarBuku.get(pilihBuku), daftarAnggota.get(pilihAnggota - 1));
        daftarPeminjaman.add(peminjaman);

        System.out.println("Peminjaman berhasil dicatat!");
        tampilkanDaftarPeminjaman();
    }

    private void tampilkanDaftarPeminjaman() {
        System.out.println("\n== Daftar Peminjaman ==");
        for (Peminjaman p : daftarPeminjaman) {
            System.out.println("- " + p);
        }
    }
}
