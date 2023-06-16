//INHERITANCE
class KamarMandiDalam extends FasilitasKamar {
    //KONSTRUKTOR
    public KamarMandiDalam() {
        super("Kamar Mandi Dalam", 1200000);
    }
    //INSTANCE METHOD
    //OVERRIDING
    @Override
    public void tampilkanInfo() {
        System.out.println("Kamar mandi dalam");
        System.out.println("AC");
        System.out.println("Springbed");
        System.out.println("Lemari Pakaian");
        System.out.println("Free WIFI dan air, listrik");
        System.out.println("Dapur Bersama");
        System.out.println("Akses 24 jam");
    }
}