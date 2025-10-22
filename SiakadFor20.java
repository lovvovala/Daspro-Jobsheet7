import java.util.Scanner;
public class SiakadFor20 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;

        for (int i = 1; i <= 10; i ++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
        }

        System.err.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);
   } 
}
