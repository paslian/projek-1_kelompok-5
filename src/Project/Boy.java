/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author hp
 */
public class Boy extends IdealYoung {
   public void hasilinfo(){
        if (getUmur()== 1) {
            this.info = "Berat badan ideal 7,7 - 12 Kg";
        }else if (getUmur() == 2){
            this.info = "Berat badan ideal 9,7 - 15,3 Kg";
        }else if (getUmur() == 3){
            this.info = "Berat badan ideal 11,3 - 18,3 Kg";
        }else if (getUmur() == 4){
            this.info = "Berat badan ideal 12,7 - 21,2 Kg";
        }else if (getUmur() == 5){
            this.info = "Berat badan ideal 14,1 - 24,2 Kg";
        }else if (getUmur() == 6){
            this.info = "Berat badan ideal 21 Kg dan Tinggi ideal  116Cm";
        }else if (getUmur() == 7){
            this.info = "Berat badan ideal 23 Kg dan Tinggi ideal  122 Cm";
        }else if (getUmur() == 8){
            this.info = "Berat badan ideal 26 Kg dan Tinggi ideal  128 Cm";
        }else if (getUmur() == 9){
            this.info = "Berat badan ideal 29 Kg dan Tinggi ideal  134 Cm";
        }else if (getUmur() == 10){
            this.info = "Berat badan ideal 32 Kg dan Tinggi ideal  139 Cm";
        }else if (getUmur() == 11){
            this.info = "Berat badan ideal 36 Kg dan Tinggi ideal  144 Cm";
        }else if (getUmur() == 12){
            this.info = "Berat badan ideal 41 Kg dan Tinggi ideal  149 Cm";
        }else if (getUmur() > 12){
            this.info = "Silahkan pilih menu 13 Tahun Keatas ";
}
}
}
