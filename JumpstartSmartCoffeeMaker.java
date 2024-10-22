import java.util.Scanner;

public class JumpstartSmartCoffeeMaker {
    public static void main(String[] args){
        MesinKopi mesinKopi = new MesinKopi();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Jumpstart Smart Coffee Maker!");
        System.out.println("Taruh gelas di tempat yang tersedia.");

        mesinKopi.tampilkanMenu();
        System.out.println("Pilih nomor minuman: ");
        int pilihan = scanner.nextInt();

        mesinKopi.pilihMinuman(pilihan);
    }
}
