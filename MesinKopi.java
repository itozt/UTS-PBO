import java.util.Scanner;

public class MesinKopi {
    private Minuman[] menu;
    private int levelGula;

    public MesinKopi() {
        // Inisialisasi menu minuman
        menu = new Minuman[]{
            new Minuman("Americano Hot", 15000),
            new Minuman("Americano Ice", 15000),
            new Minuman("Cafe Latte Hot", 20000),
            new Minuman("Cafe Latte Ice", 20000),
            new Minuman("Piccolo Latte", 18000),
            new Minuman("Mocha Latte Hot", 20000),
            new Minuman("Mocha Latte Ice", 20000),
            new Minuman("Cappuccino Hot", 20000),
            new Minuman("Cappuccino Ice", 20000),
            new Minuman("Salted Caramel Hot", 24000),
            new Minuman("Salted Caramel Ice", 24000),
            new Minuman("Vanilla Latte Hot", 24000),
            new Minuman("Vanilla Latte Ice", 24000),
            new Minuman("Matcha Gula Aren Hot", 20000),
            new Minuman("Matcha Gula Aren Ice", 20000),
            new Minuman("Matcha Latte Hot", 20000),
            new Minuman("Matcha Latte Ice", 20000),
            new Minuman("Green Tea Hot", 10000),
            new Minuman("Green Tea Ice", 10000),
            new Minuman("Thai Tea Hot", 15000),
            new Minuman("Thai Tea Ice", 15000)
        };
    }

    public void tampilkanMenu() {
        System.out.println("=== Menu Minuman ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].getNama() + " - Rp " + menu[i].getHarga());
        }
    }

    public void pilihMinuman(int pilihan) {
        if (pilihan < 1 || pilihan > menu.length) {
            System.out.println("Pilihan tidak valid.");
            return;
        }

        Minuman minuman = menu[pilihan - 1];
        System.out.println("Anda memilih: " + minuman.getNama());
        aturLevelGula();
        lakukanPembayaran(minuman.getHarga());
        System.out.println("Minuman Anda sedang disiapkan... Silakan tunggu 60 detik.");
    }

    private void aturLevelGula() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih level gula (1-5): ");
        levelGula = scanner.nextInt();

        if (levelGula < 1 || levelGula > 5) {
            System.out.println("Level gula tidak valid. Pilih antara 1 hingga 5.");
            aturLevelGula();
        } else {
            System.out.println("Level gula dipilih: Level " + levelGula);
        }
    }

    private void lakukanPembayaran(int harga) {
        System.out.println("Total harga: Rp " + harga);
        System.out.println("Silakan scan QR code untuk pembayaran menggunakan aplikasi e-banking di smartphone Anda.");
        // Simulasi pembayaran cashless
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan 1 jika pembayaran telah selesai: ");
        int konfirmasi = scanner.nextInt();
        if (konfirmasi == 1) {
            System.out.println("Pembayaran berhasil!");
        } else {
            System.out.println("Pembayaran gagal, coba lagi.");
            lakukanPembayaran(harga);
        }
    }
}
