/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Christian Sirait
 */
public class Konversi {
    // attribute
    double suhuReamur,suhuKelvin,suhuFarenheith;
    int celcius;
    String kondisiAir;

    public Konversi(int celcius) { // deklarasi constructor
        this.celcius = celcius;
    }

// method untuk menghitung suhu air hasil konversi    
    void konversiSuhu (int suhuCelcius){
        suhuReamur=(4*suhuCelcius)/5;
        suhuFarenheith=((9*suhuCelcius)/5) + 32;
        suhuKelvin=suhuCelcius + 273.15;
        // pemanggilan method untuk mencetak hasil konversi suhu
        kondisiAir(suhuCelcius);
    }
    
    // method untuk mencetak hasil konversi suhu
    void hasilKonversi (){
        System.out.println("Suhu Reamur = " + suhuReamur);
        System.out.println("Suhu Farenheith = " + suhuFarenheith);
        System.out.println("Suhu Kelvin = " + suhuKelvin);
        System.out.println("Konsisi air "+kondisiAir);
    }
    
 // method untuk mencari kondisi air
    void kondisiAir(int suhuCelcius){
        if (suhuCelcius < 0) {
            kondisiAir = "Beku";
        }
        else if(suhuCelcius >= 100) {
            kondisiAir = "Mendidih";   
        }
        else {
            kondisiAir="Normal";
        }
    }
    
}
