class Pelanggan {
    private String nama;
    private String noKTP;

    public Pelanggan(String nama, String noKTP) {
        this.nama = nama;
        this.noKTP = noKTP;
    }
    
    public String getNama() { return nama; }
    
    @Override
    public String toString() { return nama + " (KTP: " + noKTP + ")"; }
}