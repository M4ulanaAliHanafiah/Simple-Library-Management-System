import java.util.*;

public class KelolaAnggota {
    private ArrayList<Anggota> daftarAnggota = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void menuAnggota() {
        System.out.print("Masukkan nama anggota: ");
        String nama = input.nextLine();
        System.out.print("Masukkan ID anggota: ");
        String id = input.nextLine();

        Anggota anggota = new Anggota(nama, id);
        daftarAnggota.add(anggota);

        System.out.println("Anggota berhasil ditambahkan!");
        listAnggota();
    }

    public ArrayList<Anggota> getDaftarAnggota() {
    return daftarAnggota;
    }

    private void listAnggota() {
        System.out.println("\n=== Daftar Anggota ===");
        for (Anggota a : daftarAnggota) {
            System.out.println("- " + a);
        }
    }

}
