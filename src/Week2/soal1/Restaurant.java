import java.util.Scanner;

public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    // Getter
    public String getNamaMakanan(int id) {
        return nama_makanan[id];
    }

    public double getHargaMakanan(int id) {
        return harga_makanan[id];
    }

    public int getStok(int id) {
        return stok[id];
    }

    // Setter
    public void setStok(String nama, int stokBaru) {
        for (int i = 0; i < id; i++) {
            if (nama_makanan[i].equals(nama)) {
                if (stokBaru >= 0) {
                    stok[i] = stokBaru;
                } else {
                    System.out.println("Stok tidak boleh negatif");
                }
                return;
            }
        }
        System.out.println("Makanan dengan nama " + nama + " tidak ditemukan.");
    }

    public void setHargaMakanan(String nama, double hargaBaru) {
        for (int i = 0; i < id; i++) {
            if (nama_makanan[i].equals(nama)) {
                if (hargaBaru >= 0) {
                    harga_makanan[i] = hargaBaru;
                } else {
                    System.out.println("Harga tidak boleh negatif");
                }
                return;
            }
        }
        System.out.println("Makanan dengan nama " + nama + " tidak ditemukan.");
    }

    // Tambah menu makanan
    public void tambahMenuMakanan(String nama, double harga, int stokAwal) {
        nama_makanan[id] = nama;
        harga_makanan[id] = harga;
        stok[id] = stokAwal;
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(
                        i + 1 + " " + nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]
                );
            }
        }
    }

    public boolean isOutOfStock(int id) {
        if (stok[id] == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void nextId() {
        id++;
    }

    public void pesanMakanan(String nama, int jumlah){
        for (int i = 0; i < id; i++){
            if (nama_makanan[i].equalsIgnoreCase(nama)){

                if (jumlah <= 0) {
                    System.out.println("Jumlah pesanan tidak valid");
                    return;
                }

                if (stok[i] >= jumlah){
                    stok[i] -= jumlah;
                    System.out.println("Pesanan " + nama + " sebanyak " + jumlah + " berhasil dipesan.");
                } else {
                    System.out.println("Maaf, stok " + nama + " tidak cukup untuk memenuhi pesanan Anda.");
                }
                return;
            }
        }

        System.out.println("Menu tidak ditemukan");
    }
}