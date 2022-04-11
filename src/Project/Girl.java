/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author hp
 */
public class Girl  extends IdealYoung{
    public void hasilinfo(){
        if (getUmur() == 1) {
            this.info = "Berat badan ideal 7 - 11,5 Kg";
        }else if (getUmur() == 2){
            this.info = "Berat badan ideal 9 - 14,8 Kg";
        }else if (getUmur() == 3){
            this.info = "Berat badan ideal 10,8 - 18,1 Kg";
        }else if (getUmur() == 4){
            this.info = "Berat badan ideal 12,3 - 21,5 Kg";
        }else if (getUmur() == 5){
            this.info = "Berat badan ideal 13,7 - 24,9 Kg";
        }else if (getUmur() == 6){
            this.info = "Berat badan ideal 20 Kg dan Tinggi ideal 115Cm";
        }else if (getUmur() == 7){
            this.info = "Berat badan ideal 23 Kg dan Tinggi ideal 122 Cm";
        }else if (getUmur() == 8){
            this.info = "Berat badan ideal 26 Kg dan Tinggi ideal  128 Cm";
        }else if (getUmur() == 9){
            this.info = "Berat badan ideal 29 Kg dan Tinggi ideal 133 Cm";
        }else if (getUmur() == 10){
            this.info = "Berat badan ideal 33 Kg dan Tinggi ideal 138 Cm";
        }else if (getUmur() == 11){
            this.info = "Berat badan ideal 37 Kg dan Tinggi ideal 144 Cm";
        }else if (getUmur() == 12){
            this.info = "Berat badan ideal 42 Kg dan Tinggi ideal 152 Cm";
        }else if (getUmur() > 12){
            this.info = "Silahkan pilih menu 13 Tahun Keatas ";
}
}
}

