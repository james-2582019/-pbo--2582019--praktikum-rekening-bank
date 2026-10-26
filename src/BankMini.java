import java.util.Scanner;

public class BankMini {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat object Rekening sesuai instruksi
        Rekening rekening = new Rekening("001", "Ani", 100000);

        System.out.println("============ BANK MINI ============");
        System.out.println("Rekening 001 a.n. Ani");

        // 7. Baris error yang dijadikan komentar beserta pesan error-nya:
        // rekening.saldo = 1000000;
        // PESAN ERROR: java: saldo has private access in Rekening


    }
}