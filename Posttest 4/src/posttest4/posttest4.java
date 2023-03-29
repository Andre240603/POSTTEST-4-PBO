package posttest4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class posttest4 {
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Makanan> listMkn = new ArrayList<>();
    static ArrayList<Minuman> listMnm = new ArrayList<>();
    
    public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        input.readLine();
        System.out.println("");
    }
        
    public static void addData() throws IOException { 
        System.out.println("Jenis data");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("========== Masukkan Data Makanan ==========");
            System.out.print("Masukkan Nama Makanan                      : ");
            String name = input.readLine();
            System.out.print("Masukkan Tanggal Masuk Makanan (DD/MM/YYYY): ");
            String tanggalBrg = input.readLine();
            System.out.print("Masukkan Stok Masuk Makanan                : ");
            String StokMasuk = input.readLine();
            System.out.print("Masukkan Rasa Makanan                      : ");
            String Rasa = input.readLine();
            System.out.print("Masukkan Jenis Makanan                     : ");
            String Jenis = input.readLine();
            System.out.println("=============================================");
            listMkn.add(new Makanan(name, tanggalBrg, StokMasuk, Rasa, Jenis));
            System.out.println("Data " + name + " berhasil ditambahkan!");

        }else if(pil == 2){
            System.out.println("========== Masukkan Data Minuman ==========");
            System.out.print("Masukkan Nama Minuman                      : ");
            String name = input.readLine();
            System.out.print("Masukkan Tanggal Masuk Minuman (DD/MM/YYYY): ");
            String tanggalBrg = input.readLine();
            System.out.print("Masukkan Stok Masuk Minuman                : ");
            String StokMasuk = input.readLine();
            System.out.print("Masukkan Ukuran Minuman                    : ");
            String Ukuran = input.readLine();
            System.out.print("Masukkan Topping Minuman                   : ");
            String Topping = input.readLine();
            System.out.println("=============================================");
            listMnm.add(new Minuman(name, tanggalBrg, StokMasuk, Ukuran, Topping ));
            System.out.println("Data " + name + " berhasil ditambahkan!");

        }else{
            System.out.println("Pilihan Salah");

        }
    }
    
    public static void showData() throws IOException {
        System.out.println("Jenis data");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            System.out.println("\n============ List Data Makanan ============");
            if (listMkn.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listMkn.size();i++){
                    System.out.println("Data indeks ke-" + (i));
                    System.out.println("Nama Makanan              :" + listMkn.get(i).getName());
                    System.out.println("Tanggal Masuk Makanan     :" + listMkn.get(i).getTanggalBrg());
                    System.out.println("Stok Masuk Makanan        :" + listMkn.get(i).getStokMasuk());
                    System.out.println("Rasa Makanan              :" + listMkn.get(i).getRasa());
                    System.out.println("Jenis Makanan             :" + listMkn.get(i).getJenis());
                    }
                }
                System.out.println("===========================================");
        }else if(pil == 2){
            System.out.println("\n=========== List Data Minuman ===========");
            if (listMnm.isEmpty()){
                System.out.println("Belum ada data yang tersimpan!");
            }else{
                for(int i = 0; i < listMnm.size();i++){
                    System.out.println("Data indeks ke-" + (i));
                    System.out.println("Nama Minuman              :" + listMnm.get(i).getName());
                    System.out.println("Tanggal Masuk Minuman     :" + listMnm.get(i).getTanggalBrg());
                    System.out.println("Stok Masuk Minuman        :" + listMnm.get(i).getStokMasuk());
                    System.out.println("Ukuran Minuman            :" + listMnm.get(i).getUkuran());
                    System.out.println("Topping Minuman           :" + listMnm.get(i).getTopping());
                    }
            }
                System.out.println("=======================================");
        }else{
            System.out.println("Pilihan salah");

        }
    }
    
    public static void updateData() throws IOException {
        System.out.println("Jenis data");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listMkn.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data Makanan yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listMkn.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Makanan Mkn = listMkn.get(index);
                    System.out.println("Data Makanan dengan indeks " + index);
                    //System.out.println(Mkn);
                    System.out.println("======= Masukkan data Makanan yang baru =======");
                    System.out.print("Masukkan Nama Makanan                      : ");
                    Mkn.setName(input.readLine());
                    System.out.print("Masukkan Tanggal Masuk Makanan (DD/MM/YYYY): ");
                    Mkn.setTanggalBrg(input.readLine());
                    System.out.print("Masukkan Stok Masuk Makanan                : ");
                    Mkn.setStokMasuk(input.readLine());
                    System.out.print("Masukkan Rasa Makanan                      : ");
                    Mkn.setRasa(input.readLine());
                    System.out.print("Masukkan Jenis Makanan                     : ");
                    Mkn.setJenis(input.readLine());
                    
                    System.out.println("=================================================");
                    System.out.println("Data Makanan berhasil diubah!");
                }
            }
        }else if(pil == 2){
            if (listMnm.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data Minuman yang ingin diubah: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listMnm.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Minuman Mnm = listMnm.get(index);
                    System.out.println("Data Minuman dengan indeks " + index);
                    System.out.println(Mnm);
                    System.out.println("======= Masukkan data Minuman yang baru =======");
                    System.out.print("Masukkan Nama Minuman                      : ");
                    Mnm.setName(input.readLine());
                    System.out.print("Masukkan Tanggal Masuk Minuman (DD/MM/YYYY): ");
                    Mnm.setTanggalBrg(input.readLine());
                    System.out.print("Masukkan Stok Masuk Minuman                : ");
                    Mnm.setStokMasuk(input.readLine());
                    System.out.print("Masukkan Ukuran Minuman                    : ");
                    Mnm.setUkuran(input.readLine());
                    System.out.print("Masukkan Topping Minuman                   : ");
                    Mnm.setTopping(input.readLine());
                    System.out.println("=================================================");
                    System.out.println("Data Minuman berhasil diubah!");
                }
            }
        }else{
            System.out.println("Input Salah");
        }
    }
    
    public static void deleteData() throws IOException { 
        System.out.println("Jenis data");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            if (listMkn.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data Makanan yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listMkn.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Makanan Mkn = listMkn.get(index);
                    listMkn.remove(index);
                    System.out.println("Data Makanan dengan indeks " + index + " berhasil dihapus:");
                }
            }
        }else if(pil == 2){
            if (listMnm.isEmpty()) {
                System.out.println("Belum ada data yang tersimpan!");
            } else {
                System.out.print("Masukkan indeks data minuman yang ingin dihapus: ");
                int index = Integer.parseInt(input.readLine());
                if (index < 0 || index >= listMnm.size()) {
                    System.out.println("Indeks tidak ditemukan!");
                } else {
                    Minuman Mnm = listMnm.get(index);
                    listMnm.remove(index);
                    System.out.println("Data Minuman dengan indeks " + index + " berhasil dihapus:");
                    
                }
            }
        }else{
            System.out.println("Input Salah");
        }
    }
    
     public static void DeskripsiBarang() throws IOException{
        Makanan Mkn = new Makanan();
        Minuman Mnm = new Minuman();

        System.out.println("Jenis Barang");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("Pilih Data: ");
        int pil = Integer.parseInt(input.readLine());
        if(pil == 1){
            Mkn.deskripsi();
            Mkn.deskripsi(listMkn.size());
        }else if(pil == 2){
            Mnm.deskripsi();
            Mnm.deskripsi(listMnm.size());
        }else{
            System.out.println("Piilihan salah!");
        }
    }

    public static void main(String[] args) throws IOException{
        boolean menu = true;
        while (menu = true) {
            System.out.println("\nProgram Pendataan Barang COffee Shop Tok Aba");
            System.out.println("==============================================");
            System.out.println("|   1. Menambah Data Barang                  |");
            System.out.println("|   2. Lihat Data Barang                     |");
            System.out.println("|   3. Ubah Data Barang                      |");
            System.out.println("|   4. Hapus Data Barang                     |");
            System.out.println("|   5. Deskripsi Barang                      |");
            System.out.println("|   6. Keluar Program                        |");
            System.out.println("==============================================");
            System.out.print("Pilihan: ");
            int pilih = Integer.parseInt(input.readLine());

            switch (pilih) {
                case 1:
                    addData();
                    froze();
                    break;
                case 2:
                    showData();
                    froze();
                    break;
                case 3:
                    updateData();
                    froze();
                    break;
                case 4:
                    deleteData();
                    froze();
                    break;
                case 5:
                    DeskripsiBarang();
                    froze();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan program ini");
                    System.exit(0);
                    menu = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    froze();
                    break;
            }
        }
    }
}
