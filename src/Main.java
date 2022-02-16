
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christian Sirait
 */
public class Main {
 
    public static void main(String[] args) {
        System.out.println("+-----------------+");
        System.out.println(" Konversi Suhu Air ");
        System.out.println("+-----------------+");
        // deklarasi input
        Scanner inputSuhu = new Scanner(System.in);
        Scanner inputMenu = new Scanner(System.in);
        System.out.println("- Input Data -");
        // input suhu pertama kali
        System.out.print("Masukan Suhu Dalam Celcius : ");
        int suhuCelcius = inputSuhu.nextInt();
        while (true){
            System.out.println("- Menu -");
            System.out.println("1. Hasil Konversi Suhu ");
            System.out.println("2. Edit Suhu Celcius ");
            System.out.println("3. Exit ");
            System.out.print("Pilihan : ");
            int pilihanMenu = inputMenu.nextInt(); // input pilihan menu
            switch(pilihanMenu){
                case 1 :
                    Konversi knv = new Konversi(suhuCelcius); // set nilai dengan constructor 
                    // pemanggilan fungsi dari class konversi
                    knv.konversiSuhu(suhuCelcius); 
                    System.out.println("Suhu Celcius : "+suhuCelcius);
                    knv.hasilKonversi();
                    System.out.println("");
                    break;
                case 2 : 
                    //inputan suhu celcius baru
                    System.out.print("Masukan Suhu Dalam Celcius : ");
                    int suhuBaru = inputSuhu.nextInt();
                    suhuCelcius = suhuBaru;
                    System.out.println("");
                    break;
                case 3 :
                    // mengakhiri program
                    System.out.println("Terima Kasih Telah Menggunakan Program");
                    System.exit(0);
                    break;
                default : 
                    System.out.println("Pilihan Menu Tidak Ada Silahkan Mengulang");
                    System.out.println("");
            }
        }
    }
}
