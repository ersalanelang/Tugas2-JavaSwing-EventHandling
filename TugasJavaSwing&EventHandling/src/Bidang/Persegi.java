/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bidang;

/**
 *
 * @author ASUS
 */
public class Persegi implements MenghitungBidang{
    
    double panjang, lebar;

    public Persegi(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double keliling() {
        return 2*(panjang+lebar);
    }

    @Override
    public double luas() {
        return panjang*lebar;
    }
   
}
