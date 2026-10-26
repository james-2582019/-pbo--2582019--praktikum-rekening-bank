import java.util.Scanner;

public class BankMini {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rekening rekening = new Rekening("001", "Ani", 100000);

        System.out.println("============ BANK MINI ============");
        System.out.println("Rekening 001 a.n. Ani");

        // rekening.saldo = 1000000;
        // PESAN ERROR: java: saldo has private access in Rekening

        int pilihan = -1;
        while (pilihan != 0) {
            System.out.print("Menu (1 setor, 2 tarik, 3 info, 0 keluar): ");
            pilihan = scanner.nextInt();

            if (pilihan == 1 || pilihan == 2) {
                System.out.print("Jumlah: ");
                int jumlah = scanner.nextInt();
                // Jika pilihan 1 panggil setor, jika 2 panggil tarik. Simpan hasilnya di boolean sukses.
                boolean sukses = (pilihan == 1) ? rekening.setor(jumlah) : rekening.tarik(jumlah);
                System.out.println(sukses ? "  Berhasil" : "  Ditolak");
            } else if (pilihan == 3) {
                rekening.cetakInfo();
            } else if (pilihan != 0) {
                System.out.println("Menu tidak dikenal");
            }
        }

        System.out.println("\n=========== SALDO AKHIR ===========");
        rekening.cetakInfo();

        scanner.close();
    }
}