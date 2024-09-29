package model;

/**
 *
 * @author riendra
 */
public class DonorDarah {
    private String id;
    private String nama;
    private String golonganDarah;

    public DonorDarah(String id, String nama, String golonganDarah) {
        this.id = id;
        this.nama = nama;
        this.golonganDarah = golonganDarah;
    }

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getGolonganDarah() { return golonganDarah; }
    public void setGolonganDarah(String golonganDarah) { this.golonganDarah = golonganDarah; }

    @Override
    public String toString() {
        return "ID: " + id + ", Nama: " + nama + ", Golongan Darah: " + golonganDarah;
    }
}
