/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest4;

/**
 *
 * @author User
 */
public class Minuman extends Data {
    private String Ukuran;
    private String Topping;
    
    public Minuman(String name, String tanggalBrg, String StokMasuk, String Ukuran, String Topping) {
        super(name, tanggalBrg, StokMasuk);
        this.Ukuran = Ukuran;
        this.Topping = Topping;
    }
    
    
    public Minuman(){}
    
    
    
     public void notif() {
        System.out.println("Berhasil ditambahkan dikategori Anak - anak. ");
    }

    /**
     * @return the Ukuran
     */
    public String getUkuran() {
        return Ukuran;
    }

    /**
     * @param Ukuran the Ukuran to set
     */
    public void setUkuran(String Ukuran) {
        this.Ukuran = Ukuran;
    }

    /**
     * @return the Topping
     */
    public String getTopping() {
        return Topping;
    }

    /**
     * @param Topping the NamaKepalaKeluarga to set
     */
    public void setTopping(String Topping) {
        this.Topping = Topping;
    }
    
    @Override
    public void deskripsi(){
        System.out.println("Segarkan hari-harimu dengan segelas es teh, setiap rasa membawa manisnya sendiri.");
    }
    @Override
    public void deskripsi(int i){
        System.out.println("Data barang  hanya ada: "+ i);
    }
}
