/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HER_UAS_PBO_Taufik_Kurrahman_2301082017;
import java.util.Scanner;
/**
 *
 * @author Taufik
 * nim : 2301082017
 */

public class Pdam {
private String kodePembayaran;
    private String namaPelanggan;
    private String jenisPelanggan;
    private String tanggal;
    private int meterBulanIni;
    private int meterBulanLalu;
    private int totalBayar;


    public Pdam(String kodePembayaran, String namaPelanggan, String jenisPelanggan,
                       String tanggal, int meterBulanIni, int meterBulanLalu) {
        this.kodePembayaran = kodePembayaran;
        this.namaPelanggan = namaPelanggan;
        this.jenisPelanggan = jenisPelanggan;
        this.tanggal = tanggal;
        this.meterBulanIni = meterBulanIni;
        this.meterBulanLalu = meterBulanLalu;
        this.totalBayar = 0; 
    }

    
    public void hitungTotalBayar() {
        int meterPakai = meterBulanLalu - meterBulanIni;
        int biayaPerMeter = 0;

        if (jenisPelanggan.equals("GOLD")) {
            if (meterPakai <= 10) {
                biayaPerMeter = 5000;
            } else if (meterPakai <= 20) {
                biayaPerMeter = 10000;
            } else {
                biayaPerMeter = 20000;
            }
        } else if (jenisPelanggan.equals("SILVER")) {
            if (meterPakai <= 10) {
                biayaPerMeter = 4000;
            } else if (meterPakai <= 20) {
                biayaPerMeter = 8000;
            } else {
                biayaPerMeter = 10000;
            }
        } else if (jenisPelanggan.equals("UMUM")) {
            if (meterPakai <= 10) {
                biayaPerMeter = 2000;
            } else if (meterPakai <= 20) {
                biayaPerMeter = 3000;
            } else {
                biayaPerMeter = 5000;
            }
        }

        totalBayar = meterPakai * biayaPerMeter;
    }


    public void printTagihan() {
        System.out.println("Tagihan PDAM:");
        System.out.println("Kode Pembayaran: " + kodePembayaran);
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Jenis Pelanggan: " + jenisPelanggan);
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Meter Bulan Ini: " + meterBulanIni);
        System.out.println("Meter Bulan Lalu: " + meterBulanLalu);
        System.out.println("Total Bayar: Rp " + totalBayar);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Masukkan data tagihan PDAM:");
        System.out.print("Kode Pembayaran: ");
        String kodePembayaran = scanner.nextLine();
        System.out.print("Nama Pelanggan: ");
        String namaPelanggan = scanner.nextLine();
        System.out.print("Jenis Pelanggan (GOLD/SILVER/UMUM): ");
        String jenisPelanggan = scanner.nextLine();
        System.out.print("Tanggal: ");
        String tanggal = scanner.nextLine();
        System.out.print("Meter Bulan Ini: ");
        int meterBulanIni = scanner.nextInt();
        System.out.print("Meter Bulan Lalu: ");
        int meterBulanLalu = scanner.nextInt();

  
        Pdam tagihan = new Pdam(kodePembayaran, namaPelanggan, jenisPelanggan,
                                              tanggal, meterBulanIni, meterBulanLalu);

        
        tagihan.hitungTotalBayar();
        tagihan.printTagihan();

    }
}
