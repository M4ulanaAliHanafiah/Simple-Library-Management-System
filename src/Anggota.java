public class Anggota {
    
    private String NamaAnggota;
    private String id;

    public Anggota(String NamaAnggota, String id) {
        this.NamaAnggota = NamaAnggota;
        this.id = id;
    }

    public String getName() {
        return NamaAnggota;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return NamaAnggota + " oleh " + id;
    }
}
