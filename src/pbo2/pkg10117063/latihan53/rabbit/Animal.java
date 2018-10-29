/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117063.latihan53.rabbit;

/*
Nama : Cessario Sheva L.P.A
Kelas: IF-2
Nim  : 10117063
Deskripsi Program : Menampilkan Kelinci
 */
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOflegs;

    public Animal(boolean vegetarian, String eats, int noOflegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOflegs = noOflegs;
    }
    
    public boolean isVegetarian(){
     return vegetarian;   
    }

    public String getEats() {
        return eats;
    }

    public int getNoOflegs() {
        return noOflegs;
    }
    
}
