public class Kendaraan {
    protected String merk;
    protected String model;
    protected String noPlat;
    protected double hargaSewaPerHari;
    protected boolean isAvailable = true;

    public Kendaraan(String merk, String model, String noPlat, double harga) {
        this.merk = merk;
        this.model = model;
        this.noPlat = noPlat;
        this.hargaSewaPerHari = harga;
    }

    public String getInfoSpesifik() {
        return "Kendaraan Umum";
    }

    public double hitungBiaya(int lamaSewa) {
        return hargaSewaPerHari * lamaSewa;
    }

    public String getInfoDasar() {
        return String.format("%s %s [%s] - Rp%.0f/hari", merk, model, noPlat, hargaSewaPerHari);
    }

    public String getNoPlat() { return noPlat; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailability(boolean status) { this.isAvailable = status; }
}