
import java.util.Scanner;

public class Kafe26main {
    public static void main(String[] args) {
        Scanner leli = new Scanner(System.in);
        
        String namaPelanggan, dummy;
        int kopi, teh, roti, jmlPelanggan;
        double hargaKopi, hargaTeh, hargaRoti;

        System.out.print("Masukkan Jumlah Pelanggan: ");
        jmlPelanggan = leli.nextInt();
        leli.nextLine();

        Kafe26[] arrayOfKafe26 = new Kafe26[jmlPelanggan];

        for (int i = 0; i < jmlPelanggan; i++) {
            System.out.println("Pesanan Pelanggan Ke-" + (i+1));
            System.out.print("Nama Pelanggan    : ");
            namaPelanggan = leli.nextLine();
            System.out.print("Kopi              : ");
            dummy = leli.nextLine();
            kopi = Integer.parseInt(dummy);
            System.out.print("Teh               : ");
            dummy = leli.nextLine();
            teh = Integer.parseInt(dummy);
            System.out.print("Roti              : ");
            dummy = leli.nextLine();
            roti = Integer.parseInt(dummy);
            System.out.println("===============================================");

            arrayOfKafe26[i] = new Kafe26(namaPelanggan, kopi, teh, roti);
        }

        for (int i = 0; i < jmlPelanggan; i++) {
            System.out.println("Pesanan Pelanggan ke-" + (i+1));
            System.out.println("Nama Pelanggan  : " + arrayOfKafe26[i].namaPelanggan);
            System.out.println("Kopi            : " + arrayOfKafe26[i].kopi);
            System.out.println("Teh             : " + arrayOfKafe26[i].teh);
            System.out.println("Roti            : " + arrayOfKafe26[i].roti);
            System.out.println();
            arrayOfKafe26[i].cetakInfo();
            arrayOfKafe26[i].hitungTotalHarga();
            System.out.println("===========================================");
        }
    }
}
