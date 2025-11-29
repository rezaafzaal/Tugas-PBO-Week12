class Mobil extends Kendaraan {
    private String transmisi;

    public Mobil(String merk, String model, String noPlat, double harga, String transmisi) {
        super(merk, model, noPlat, harga);
        this.transmisi = transmisi;
    }

    @Override
    public String getInfoSpesifik() {
        return getInfoDasar() + " | Tipe: Mobil (" + transmisi + ")";
    }
}