import java.util.ArrayList;
import java.util.Scanner;

//ABSTRACT CLASS
abstract class FasilitasKamar {
    //ENKAPSULASI
    private String namaFasilitas;
    private int harga;
    
    //KONSTRAKTOR
    public FasilitasKamar(String namaFasilitas, int harga) {
        this.namaFasilitas = namaFasilitas;
        this.harga = harga;
    }

    public String getNamaFasilitas() {
        return namaFasilitas;
    }

    public int getHarga() {
        return harga;
    }

    public abstract void tampilkanInfo();

}
