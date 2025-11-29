class Motor extends Kendaraan {
    private String jenisMotor;

    public Motor(String merk, String model, String noPlat, double harga, String jenisMotor) {
        super(merk, model, noPlat, harga);
        this.jenisMotor = jenisMotor;
    }

    @Override
    public String getInfoSpesifik() {
        return getInfoDasar() + " | Tipe: Motor " + jenisMotor;
    }
}