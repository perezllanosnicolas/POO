/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author perez
 */
public class Casilla {
    private int x;
    private int y;
    private boolean looteada;
    
    public Casilla(int xa,int ya){
        if(x>=0 && y>=0){
            this.x=xa;
            this.y=ya;
        }else{
            System.out.println("Error, cordenadas no validas");
        }
    }
    
    public boolean lootear(){
        int i = (int)Math.random()*2;
        if(i>1){
            looteada=true;
            return true;
        }
        
        return false;
    }
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
}
