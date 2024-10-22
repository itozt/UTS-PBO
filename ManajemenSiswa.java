public class ManajemenSiswa {
    public static void main(String[] args) {
        // Membuat objek Siswa
        Siswa siswa1 = new Siswa("Budi", 17, 85.5);

        siswa1.tampilkanInfo();

        // Mengubah nilai menggunakan setter
        siswa1.setNama("Andi");
        siswa1.setUsia(18);
        siswa1.setNilai(90);

        siswa1.tampilkanInfo();

        // Contoh validasi yang tidak valid
        siswa1.setUsia(-5); 
        siswa1.setNilai(105);  
    }
}
