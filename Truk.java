class Truk extends Kendaraan {
    private int kapasitasTon;

    public Truk(String merk, String model, String noPlat, double harga, int kapasitasTon) {
        super(merk, model, noPlat, harga);
        this.kapasitasTon = kapasitasTon;
    }

    @Override
    public String getInfoSpesifik() {
        return getInfoDasar() + " | Tipe: Truk (Muatan " + kapasitasTon + " Ton)";
    }
}