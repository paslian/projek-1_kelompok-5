/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author hp
 */
public class IdealOld {
    private double tb, bb, total;
    private String info;

    public void setTb(double tb) {
        this.tb = tb / 100;
    }

    public double getTb() {
        return tb;
    }

    public void setBb(double bb) {
        this.bb = bb;
    }

    public double getBb() {
        return bb;
    }

    public void setTotal(double total) {
        this.total = total;
    }

  public double getTotal() {
        return total = this.bb / (this.tb * this.tb);
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void hasilinfo(){
        if (getTotal() < 18.5) {
            this.info = "Anda Kurus";
        }else if (getTotal() < 24.9){
            this.info = "Anda Ideal";
        }else if (getTotal() < 29.9){
            this.info = "Anda Overweight";
        }else if (getTotal() > 30.0){
            this.info = "Anda Obesitas";
}
}
}

