/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author perez
 */
public class Arma {
    private String nombre;
    private int potencia;
    private int alcance;
    private int numDados;
    private int valorExito;
    
    
        public Arma (String nom, int pot, int alc,int dados, int exi){
            if(pot>0 && alc>0 && dados>0 && exi>0){
                this.nombre = nom;
                this.alcance=alc;
                this.numDados= dados;
                this.potencia= pot;
                this.valorExito=exi;
            }else{
                System.out.println("Error valor no valido");
            }
        }
        
        
        public String getNombre(){
            return this.nombre;
        }
        public int getPotencia(){
            return this.potencia;
        }
        public int getAlcance(){
            return this.alcance;
        }
        public int getNumDados(){
            return this.numDados;
        }
        public int getValorExito(){
            return this.valorExito;
        }
        
        @Override 
        public boolean equals(Object o){
            if(this==o)return true;
            if(o==null)return false;
            if(this.getClass()!=o.getClass())return false;
            Arma aux = (Arma)o;
            if(aux.nombre == this.nombre)return true;
            else return false;
        }
}
