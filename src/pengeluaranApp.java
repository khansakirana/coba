
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class untuk menyimpan data pengeluaran seperti tanggal, keterangan, dan jumlah.
 */
class Pengeluaran {
    String tanggal;
    String keterangan;
    double jumlah;

    /**
     * Membuat objek Pengeluaran baru.
     * @param tanggal tanggal pengeluaran dalam format YYYY-MM-DD
     * @param keterangan keterangan singkat pengeluaran
     * @param jumlah jumlah uang yang dikeluarkan
     */
    public Pengeluaran(String tanggal, String keterangan, double jumlah) {
        this.tanggal = tanggal;
        this.keterangan = keterangan;
        this.jumlah = jumlah;
    }

    /**
     * Menampilkan data pengeluaran dalam format teks.
     * @return String berisi tanggal, keterangan, dan jumlah
     */
    @Override
    public String toString() {
        return tanggal + " - " + keterangan + " : Rp" + jumlah;
    }
}

/**
 * Class untuk mencatat dan menampilkan daftar pengeluaran.
 */
class CatatanPengeluaran {
    private ArrayList<Pengeluaran> daftar = new ArrayList<>();

    /**
     * Menambahkan data pengeluaran baru ke daftar.
     * @param tanggal tanggal pengeluaran
     * @param keterangan keterangan pengeluaran
     * @param jumlah jumlah uang pengeluaran
     */
    public void tambah(String tanggal, String keterangan, double jumlah) {
        daftar.add(new Pengeluaran(tanggal, keterangan, jumlah));
    }

    /**
     * Menghitung total seluruh pengeluaran.
     * @return total pengeluaran
     */
    public double hitungTotal() {
        double total = 0;
        for (Pengeluaran p : daftar) total += p.jumlah;
        return total;
    }

    /**
     * Menampilkan seluruh pengeluaran beserta totalnya.
     */
    public void tampilkan() {
        for (Pengeluaran p : daftar) {
            System.out.println(p);
        }
        System.out.println("Total Pengeluaran: Rp" + hitungTotal());
    }
}

/**
 * Class untuk membantu input dari pengguna (user).
 */
class InputHelper {
    private Scanner input = new Scanner(System.in);

    /**
     * Meminta input data pengeluaran dari pengguna.
     * @return objek Pengeluaran yang berisi data yang diinputkan
     */
    public Pengeluaran inputPengeluaran() {
        System.out.print("Masukkan tanggal (YYYY-MM-DD): ");
        String tanggal = input.nextLine();
        System.out.print("Masukkan keterangan: ");
        String ket = input.nextLine();

        double jumlah = 0;
        while (true) {
            try {
                System.out.print("Masukkan jumlah: ");
                jumlah = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input jumlah tidak valid, coba lagi!");
            }
        }
        return new Pengeluaran(tanggal, ket, jumlah);
    }

    /**
     * Menampilkan menu utama dan meminta pilihan dari pengguna.
     * @return angka pilihan menu
     */
    public int tampilkanMenu() {
        while (true) {
            try {
                System.out.println("\n1. Tambah Pengeluaran");
                System.out.println("2. Lihat Pengeluaran");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu: ");
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka!");
            }
        }
    }
}

/**
 * Kelas utama (main class) untuk menjalankan program Catatan Pengeluaran.
 */
public class pengeluaranApp {
    public static void main(String[] args) {
        CatatanPengeluaran catatan = new CatatanPengeluaran();
        InputHelper helper = new InputHelper();

        while (true) {
            int pilih = helper.tampilkanMenu();
            if (pilih == 1) {
                Pengeluaran p = helper.inputPengeluaran();
                catatan.tambah(p.tanggal, p.keterangan, p.jumlah);
            } else if (pilih == 2) {
                catatan.tampilkan();
            } else if (pilih == 3) {
                System.out.println("Terima kasih, program selesai.");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");

            }
        }
    }
}
