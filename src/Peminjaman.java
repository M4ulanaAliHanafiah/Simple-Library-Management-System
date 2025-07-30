public class Peminjaman {
    
    private Buku buku;
    private Anggota anggota;

    public Peminjaman(Buku buku, Anggota anggota) {

        this.buku = buku;
        this.anggota = anggota;
    }

    public String toString() {
        return "Buku: " + buku.getJudul() + " dipinjam oleh " + anggota.getName();
    }
}
