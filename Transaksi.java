class Transaksi {
    private Pelanggan pelanggan;
    private Kendaraan kendaraan;
    private int lamaSewa;
    private double totalBiaya;

    public Transaksi(Pelanggan p, Kendaraan k, int lama) {
        this.pelanggan = p;
        this.kendaraan = k;
        this.lamaSewa = lama;
        this.totalBiaya = k.hitungBiaya(lama);
    }

    public void cetakStruk() {
        System.out.println("---------------------------------");
        System.out.println("Penyewa : " + pelanggan.getNama());
        System.out.println("Unit    : " + kendaraan.getInfoSpesifik());
        System.out.println("Durasi  : " + lamaSewa + " Hari");
        System.out.println("Total   : Rp " + String.format("%,.0f", totalBiaya));
    }
}