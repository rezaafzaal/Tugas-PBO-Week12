import java.util.ArrayList;
import java.util.List;

public class SistemRental {
    private List<Kendaraan> inventaris = new ArrayList<>();
    private List<Transaksi> riwayatTransaksi = new ArrayList<>();

    public void tambahInventaris(Kendaraan k) {
        inventaris.add(k);
    }

    public void cekKetersediaan() {
        System.out.println("\n=== LIST KENDARAAN READY ===");
        for (Kendaraan k : inventaris) {
            if (k.isAvailable()) {
                System.out.println(" " + k.getInfoSpesifik());
            }
        }
    }

    public void sewaKendaraan(String noPlat, Pelanggan penyewa, int lamaSewa) {
        for (Kendaraan k : inventaris) {
            // Pencarian berdasarkan Plat Nomor & Status Available
            if (k.getNoPlat().equalsIgnoreCase(noPlat) && k.isAvailable()) {
                
                k.setAvailability(false);
                Transaksi baru = new Transaksi(penyewa, k, lamaSewa);
                riwayatTransaksi.add(baru);
                
                System.out.println("\n[SUKSES] Penyewaan berhasil diproses!");
                return;
            }
        }
        System.out.println("\n[GAGAL] Kendaraan " + noPlat + " tidak ditemukan atau sedang disewa.");
    }

    public void laporanTransaksi() {
        System.out.println("\n=== LAPORAN TRANSAKSI AKTIF ===");
        if (riwayatTransaksi.isEmpty()) {
            System.out.println("Belum ada transaksi.");
        } else {
            for (Transaksi t : riwayatTransaksi) {
                t.cetakStruk();
            }
        }
    }
}