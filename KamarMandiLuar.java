//INHERITANCE
class KamarMandiLuar extends FasilitasKamar {
    //KONSTRUKTOR
    public KamarMandiLuar() {
        super("Kamar Mandi Luar", 550000);
    }
    //INSTANCE METHOD
    //OVERRIDING
    @Override
    public void tampilkanInfo() {
        System.out.println("Kamar mandi luar");
        System.out.println("Springbed");
        System.out.println("Lemari Pakaian");
        System.out.println("Free WIFI dan air, listrik");
        System.out.println("Dapur Bersama");
        System.out.println("Akses 24 jam");
    }
}
