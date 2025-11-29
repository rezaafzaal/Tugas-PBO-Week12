public class MainApp {
    public static void main(String[] args) {
        SistemRental rental = new SistemRental();

        rental.tambahInventaris(new Mobil("Toyota", "Avanza", "L 1234 AB", 350000, "Manual"));
        rental.tambahInventaris(new Motor("Honda", "Vario", "L 5678 CD", 75000, "Matic"));
        rental.tambahInventaris(new Truk("Mitsubishi", "Canter", "N 9012 UV", 800000, 4)); 
        rental.tambahInventaris(new Mobil("Honda", "Brio", "B 2222 XX", 300000, "Matic"));

        rental.cekKetersediaan();

        Pelanggan p1 = new Pelanggan("Reza", "3515000001");
        Pelanggan p2 = new Pelanggan("Afzaal", "3515000002");

        rental.sewaKendaraan("L 1234 AB", p1, 3);

        rental.sewaKendaraan("N 9012 UV", p2, 2);

        rental.sewaKendaraan("L 1234 AB", new Pelanggan("Budi", "123"), 1);

        rental.laporanTransaksi();
    }
}
