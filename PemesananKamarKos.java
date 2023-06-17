import java.util.ArrayList;
import java.util.Scanner;

public class PemesananKamarKos {
    //STATIC MODIFIER DAN KONSTANTA FINAL

    private static final ArrayList<String> KAMAR_TERSEDIA_FASILITAS_1;
    private static final ArrayList<String> KAMAR_TERSEDIA_FASILITAS_2;
    private static final ArrayList<Pemesanan> DAFTAR_PEMESANAN;

    static {
        // Inisialisasi kamar kos tersedia
        KAMAR_TERSEDIA_FASILITAS_1 = new ArrayList<>();
        KAMAR_TERSEDIA_FASILITAS_1.add("Kamar Anggrek 1");
        KAMAR_TERSEDIA_FASILITAS_1.add("Kamar Anggrek 2");
        KAMAR_TERSEDIA_FASILITAS_1.add("Kamar Dahlia 1");
        KAMAR_TERSEDIA_FASILITAS_1.add("Kamar Dahlia 3");
        KAMAR_TERSEDIA_FASILITAS_1.add("Kamar Bougenville 1");

        KAMAR_TERSEDIA_FASILITAS_2 = new ArrayList<>();
        KAMAR_TERSEDIA_FASILITAS_2.add("Kamar Anggrek 6");
        KAMAR_TERSEDIA_FASILITAS_2.add("Kamar Dahlia 5");
        KAMAR_TERSEDIA_FASILITAS_2.add("Kamar Bougenville 7");

        DAFTAR_PEMESANAN = new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== SELAMAT DATANG DI KOST PUTRI MERPATI =====");
            System.out.print("Nama Pemesan: ");
            String nama = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Nomor HP: ");
            String nomorHP = scanner.nextLine();

            System.out.println();
            Pemesanan pemesanan = new Pemesanan(nama, alamat, nomorHP);

            // Tampilkan fasilitas kamar yang tersedia
            System.out.println("Tampilkan Fasilitas Kamar yang Tersedia:");
            System.out.println("1. Fasilitas 1:");
            FasilitasKamar fasilitas1 = new KamarMandiDalam();
            fasilitas1.tampilkanInfo();
            System.out.println();
            System.out.println("2. Fasilitas 2:");
            FasilitasKamar fasilitas2 = new KamarMandiLuar();
            fasilitas2.tampilkanInfo();
            System.out.println();
            System.out.println("3. Exit");
            System.out.println();

            System.out.print("Pilih Fasilitas Kamar yang Diinginkan: ");
            System.out.println();
            int pilihanFasilitas = scanner.nextInt();
            scanner.nextLine();

            // Set fasilitas kamar yang dipilih
            if (pilihanFasilitas == 1) {
                pemesanan.setFasilitasKamar(fasilitas1);
            } else if (pilihanFasilitas == 2) {
                pemesanan.setFasilitasKamar(fasilitas2);
            } else if (pilihanFasilitas == 3) {
                break;
            }

            // Tampilkan harga sesuai fasilitas yang dipilih
            int hargaFasilitas = (int) pemesanan.getFasilitasKamar().getHarga();
            System.out.println("Harga: Rp " + hargaFasilitas + " perbulan");
            System.out.println();

            // Tampilkan kamar yang tersedia untuk fasilitas yang dipilih
            ArrayList<String> kamarTersedia = new ArrayList<>();
            if (pilihanFasilitas == 1) {
                kamarTersedia = KAMAR_TERSEDIA_FASILITAS_1;
            } else if (pilihanFasilitas == 2) {
                kamarTersedia = KAMAR_TERSEDIA_FASILITAS_2;
            }

            System.out.println("Kamar Yang Tersedia Untuk Fasilitas " + pilihanFasilitas + ":");
            for (int i = 0; i < kamarTersedia.size(); i++) {
                System.out.println((i + 1) + ". " + kamarTersedia.get(i));
            }

            System.out.print("Masukkan Nomor Kamar Yang Tersedia: ");
            int nomorKamar = scanner.nextInt();
            scanner.nextLine();
            System.out.println();

            // Set nomor kamar yang dipilih
            if (nomorKamar > 0 && nomorKamar <= kamarTersedia.size()) {
                pemesanan.setNomorKamar(kamarTersedia.get(nomorKamar - 1));
                kamarTersedia.remove(nomorKamar - 1);
                DAFTAR_PEMESANAN.add(pemesanan);
                System.out.println("=== TERIMAKASIH TELAH MEMESAN KOST MERPATI ===");
                System.out.println("Nama: " + pemesanan.getNama());
                System.out.println("Alamat: " + pemesanan.getAlamat());
                System.out.println("Nomor HP: " + pemesanan.getNomorHP());
                System.out.println("Kamar Kos yang dipesan: " + pemesanan.getNomorKamar());
                System.out.println();
            } else {
                System.out.println("Kamar tidak tersedia");
            }

        }
    }

    // OVERLOADING
    public void tampilkanInfo() {
        System.out.println("Tidak ada informasi yang tersedia");
    }

    public void tampilkanInfo(String keterangan) {
        System.out.println("Informasi tambahan: " + keterangan);
    }

}
