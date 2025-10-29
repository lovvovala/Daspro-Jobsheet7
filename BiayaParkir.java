import java.util.Scanner;

public class BiayaParkir{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.println("\n------------------------------------");
            System.out.print("Masukkan jenis kendaraan (1=Mobil, 2=Motor, 0=Keluar): ");
            jenis = input.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = input.nextInt();
                if (durasi > 5) {
                    total += 12500;
                } else {
                    if (jenis == 1) { 
                        total += durasi * 3000;
                    } else { 
                        total += durasi * 2000;
                    }
                }
            } else if (jenis != 0) {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (jenis != 0); 
        System.out.println("\n====================================");
        System.out.println("Program Selesai.");
        System.out.println("Output total: Rp " + total);
        System.out.println("====================================");

        input.close();
    }
}