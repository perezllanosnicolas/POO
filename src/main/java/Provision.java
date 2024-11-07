<<<<<<< OURS
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author perez
 */
public class Provision {
    
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author perez
 */
public class Provision {
    private String nombre;
    private int ValorEnergetico;
    private int Caducidad;
    
    public Provision(String nom, int val, int cad){
            this.nombre= nom;
            this.ValorEnergetico= val;
            this.Caducidad= cad;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public int getCaducidad(){
        return this.Caducidad;
    }
    public int getValorEnergetico(){
        return this.ValorEnergetico;
    }
    
}
>>>>>>> THEIRS
