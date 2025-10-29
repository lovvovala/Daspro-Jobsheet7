import java.util.Scanner;
public class bioskop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int HARGA_TIKET = 50000;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        String ulangi;

        System.out.println("==============================================");
        System.out.println("  PROGRAM PENGHITUNG PENJUALAN TIKET BIOSKOP  ");
        System.out.println("==============================================");
        System.out.println("Harga per tiket: Rp " + HARGA_TIKET);

        do {
            int jumlahTiket = 0;
            double diskon = 0;
            double hargaTransaksi;
            while (true) {
                System.out.print("\nMasukkan jumlah tiket yang dibeli (0 untuk selesai): ");
                if (sc.hasNextInt()) {
                    jumlahTiket = sc.nextInt();
                    sc.nextLine(); 
                } else {
                    System.out.println("Input tidak valid. Harap masukkan angka.");
                    sc.next(); 
                    continue; 
                }
                if (jumlahTiket == 0) {
                    break; 
                } else if (jumlahTiket < 0) {
                    System.out.println("Jumlah tiket tidak valid (tidak boleh negatif). Harap ulangi.");
                    continue; 
                } else {
                    break; 
                }
            }
            if (jumlahTiket == 0) {
                System.out.println("\n*** Pencatatan transaksi selesai ***");
                break; 
            }
            if (jumlahTiket > 10) {
                diskon = 0.15; 
            } else if (jumlahTiket > 4) {
                diskon = 0.10; 
            }
            
            double totalSebelumDiskon = jumlahTiket * HARGA_TIKET;
            double jumlahDiskon = totalSebelumDiskon * diskon;
            hargaTransaksi = totalSebelumDiskon - jumlahDiskon;
            totalTiketTerjual += jumlahTiket;
            totalPenjualan += hargaTransaksi;
            System.out.println("----------------------------------------------");
            System.out.println("Jumlah Tiket : " + jumlahTiket);
            System.out.println("Total Harga Sebelum Diskon : Rp " + (int)totalSebelumDiskon);
            System.out.println("Diskon (" + (int)(diskon * 100) + "%) : Rp " + (int)jumlahDiskon);
            System.out.println("TOTAL HARGA BAYAR : Rp " + (int)hargaTransaksi);
            System.out.println("----------------------------------------------");
        } while (true); 
        System.out.println("\n========= REKAP PENJUALAN HARI INI =========");
        System.out.println("Total Tiket Terjual : " + totalTiketTerjual + " tiket");
        System.out.println("Total Harga Penjualan : Rp " + (int)totalPenjualan);
        System.out.println("===================================================");
        
        sc.close();
    }
}