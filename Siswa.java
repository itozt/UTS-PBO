public class Siswa {
    private String nama;
    private int usia;
    private double nilai;

    // Konstruktor
    public Siswa(String nama, int usia, double nilai){
        this.nama = nama;
        this.usia = usia;
        this.nilai = nilai;}

    // Getter untuk mengambil nilai nama siswa
    public String getNama(){
        return nama;}

    // Setter untuk mengubah nilai nama siswa
    public void setNama(String nama){
        this.nama = nama;}

    // Getter untuk mengambil usia siswa
    public int getUsia(){
        return usia;}

    // Setter untuk mengubah usia siswa
    public void setUsia(int usia){
        if (usia > 0){  
            this.usia = usia;
        } else {
            System.out.println("Usia tidak valid!");
        }
    }

    // Getter mengambil nilai siswa
    public double getNilai(){
        return nilai;}

    // Setter untuk mengubah nilai siswa
    public void setNilai(double nilai){
        if (nilai >= 0 && nilai <= 100){
            this.nilai = nilai;
        } else {
            System.out.println("Nilai tidak valid!");}
    }

    // Metode menampilkan informasi siswa
    public void tampilkanInfo(){
        System.out.println("Nama: " + nama + ", Usia: " + usia + ", Nilai: " + nilai);
    }
}
