public class Kafe26 {

    public String namaPelanggan;
    public int kopi;
    public int teh;
    public int roti;
    public double hargaKopi = 7000;
    public double hargaTeh = 5000;
    public double hargaRoti = 10000;
    public double totalHarga;

    public Kafe26 (String namaPelanggan, int kopi, int teh, int roti){
        this.namaPelanggan = namaPelanggan;
        this.kopi = kopi;
        this.teh = teh;
        this.roti = roti;
    }

    void cetakInfo(){
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Jumlah Kopi: " + kopi);
        System.out.println("Harga Satuan: " + hargaKopi);
        System.out.println("Jumlah Teh: " + teh);
        System.out.println("Harga Satuan: " + hargaTeh);
        System.out.println("Jumlah Roti: " + roti);
        System.out.println("Harga Satuan: " + hargaRoti);
    }

    void hitungTotalHarga(){
        totalHarga = (kopi*hargaKopi) + (teh*hargaTeh) + (roti*hargaRoti);
        System.out.println("Total Harga: " + totalHarga);
    }
}