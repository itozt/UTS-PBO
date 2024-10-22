// Contoh NOmer 1

class Mobil {
    String merk;
    String warna;
    
    // Konstruktor untuk membuat objek Mobil
    Mobil(String merk, String warna){
        this.merk = merk;
        this.warna = warna;}
    
    // Metode untuk menampilkan detail mobil
    void tampilkanInfo(){System.out.println("Merk: " + merk + ", Warna: " + warna);}
}

public class Main{
    public static void main(String[] args){
        // Membuat objek dari kelas Mobil
        Mobil mobil1 = new Mobil("Toyota", "Merah");
        Mobil mobil2 = new Mobil("Honda", "Biru");
        // Menampilkan informasi objek
        mobil1.tampilkanInfo();  
        mobil2.tampilkanInfo();  
    }
}
