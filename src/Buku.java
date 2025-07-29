public class Buku {
    private String judul;
    private String penulis;
    
    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public String getpenulis() {
        return penulis;
    }

    public String toString() {
        return judul + " oleh " + penulis;
    }
}
