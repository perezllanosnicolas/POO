<<<<<<< OURS
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author perez
 */
public class superviviente {
    
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
public class superviviente {
    private Casilla posicion;
    private Inventario inventario;
    private int numVidas;
    private boolean vivo;
    private static final int numMaxActividades = 3;
    private int numActividadesPendientes;
    private int kills;
    
    
    
    public superviviente (Casilla pos, Inventario inv, int vid){
        this.posicion=pos;
        this.inventario= inv;
        this.numVidas= vid;
        this.vivo = true;
        this.kills=0;
        this.numActividadesPendientes=numMaxActividades;
    }
    
    public Casilla getCasilla(){
        return posicion;
    }
    public Inventario getInventario(){
        return inventario;
    }
    public int getNumVidas(){
        return numVidas;
    }
    public boolean getVivo(){
        return vivo;
    }
    public int getNumActividadesPendientes(){
        return numActividadesPendientes;
    }
    public int getNumkills(){
        return kills;
    }
    
    public void sumarKills(int n){
        kills+=n;
    }
    public void sumarVidas(int n){
        numVidas+=n;
    }
    public boolean setPosicion(Casilla po){
        if(po!=null){
            posicion=po;
            return true;
        }
        return false;
    }
    public int getXPosicion(){
        return this.posicion.getX();
    }
    public int getYPosicion(){
        return this.posicion.getY();
    }
    
    public boolean moverse(Casilla destino){
        if(destino.getX()- this.posicion.getX()==1||destino.getX()- this.posicion.getX()==-1){
            posicion=destino;
            return true;
        }
        return false;
    }
    
    
    
    
    
}
>>>>>>> THEIRS
