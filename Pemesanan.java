//INHERITANCE
class Pemesanan {
    //ENKAPSULASI
    private String nama;
    private String alamat;
    private String nomorHP;
    private FasilitasKamar fasilitasKamar;
    private String nomorKamar;

    //KONSTRUKTOR
    public Pemesanan(String nama, String alamat, String nomorHP) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorHP = nomorHP;
    }

    public void setFasilitasKamar(FasilitasKamar fasilitasKamar) {
        this.fasilitasKamar = fasilitasKamar;
    }

    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorHP() {
        return nomorHP;
    }

    public FasilitasKamar getFasilitasKamar() {
        return fasilitasKamar;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }
}

