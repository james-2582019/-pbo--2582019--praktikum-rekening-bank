public class Rekening {
    // 1. Field nomor, pemilik, dan saldo semuanya private
    private String nomor;
    private String pemilik;
    private int saldo;

    // 2. Constructor Rekening diisi memakai this
    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    // 3. Saldo read-only: ada getSaldo(), tidak ada setSaldo()
    public int getSaldo() {
        return saldo;
    }

    // 4. Method setor menolak jumlah <= 0
    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }
        this.saldo += jumlah;
        return true;
    }

    // 4. Method tarik menolak jumlah <= 0 dan melebihi saldo
    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > this.saldo) {
            return false;
        }
        this.saldo -= jumlah;
        return true;
    }

    // 5. Method private untuk formatRupiah
    private String formatRupiah(int nominal) {
        // Mengubah angka menjadi format Rp120.000
        return String.format("Rp%,d", nominal).replace(',', '.');
    }

    // 5. Method cetakInfo untuk mencetak data
    public void cetakInfo() {
        System.out.printf("%s | %-6s |    %s\n", this.nomor, this.pemilik, formatRupiah(this.saldo));
    }
}