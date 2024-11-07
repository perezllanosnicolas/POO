<<<<<<< OURS
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author perez
 */
public class Inventario {
    private Arma []arma;
    private Provision []provisiones;
    private int suma;
    private static final int TamañoInventario = 5;
    private int numArmas;
    private int numProvisiones;
    private int []armasActivas;
    
    
    
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
public class Inventario {
    private Arma []armas;
    private Provision []provisiones;
    private static final int TamanoInventario = 5;
    private int numArmas;
    private int numProvisiones;
    private int numObjetos= numArmas + numProvisiones;
    private int posArmaActiva1;
    private int posArmaActiva2;

    
    public Inventario(){
        this.armas= null;
        this.numArmas = 0;
        this.numProvisiones = 0;
        this.posArmaActiva1=-1;
        this.posArmaActiva2= -1;
    }
    
    
    public Arma getArma(int posicion){
        return this.armas[posicion];
    }
    public Provision getProvision(int posicion){
        return this.provisiones[posicion];
    }
    public int getNumArmas(){
        return this.numArmas;
    }
    public int getNumProvisiones(){
        return this.numProvisiones;
    }
    public int getNumObjetos(){
        return this.numObjetos;
    }
    
    //Obtener la posicion de un arma. Si no tienes ese arma devuelve un -1
    public int getPosArma(Arma arm){
        for(int i=0; i<numArmas;i++){
            if(armas[i].equals(arm)){
                return i;
            }
        }
        return -1;
    }
    
    public int getPosArmaActiva1(){
        return this.posArmaActiva1;
    }
    public int getPosArmaActiva2(){
        return this.posArmaActiva2;
    }
    
    public boolean tengoEseArma(Arma arm){
        return getPosArma(arm)>=0;
    }
    
    public boolean esArmaActiva(Arma arm){
        if(tengoEseArma(arm)){
            if(getPosArma(arm)==posArmaActiva1){
                return true;
            }
            return getPosArma(arm)== posArmaActiva2;
        }
        return false;
    }
    
    private boolean puedoRecogerObjeto(){
        return (numObjetos<TamanoInventario);
    }
    
    
    public boolean recogerArma(Arma arm){
        if(puedoRecogerObjeto()){
            this.armas[numArmas++]= arm;        
            return true;
        }else{
            return false;
        }
    }
    

    
    public boolean setArmaActiva1(Arma arm){
       if(tengoEseArma(arm) && posArmaActiva2!=getPosArma(arm)){
           posArmaActiva1= getPosArma(arm);
           return true;
       }
       return false;
    }
    
    public boolean setArmaActiva2(Arma arm){
       if(tengoEseArma(arm)&& posArmaActiva1!=getPosArma(arm)){
           posArmaActiva2= getPosArma(arm);
           return true;
       }
       return false;
    }
    
    
    public boolean dropArma(Arma eliminada){
        if(tengoEseArma(eliminada)){
            numArmas--;
            //Si es arma activa deja de ser arma activa :)
            if(esArmaActiva(eliminada)){
                if(getPosArmaActiva1()==getPosArma(eliminada)){
                    posArmaActiva1=-1;
                }else{
                    posArmaActiva2=-1;
                }
            }
            //Aqui el arma no es activa
            if(numArmas!= getPosArma(eliminada)){
            //Aqui el arma no es activa y además no es la ultima.
                if(esArmaActiva(armas[numArmas])){
                    if(getPosArmaActiva1()==getPosArma(armas[numArmas])){
                        posArmaActiva1=getPosArma(eliminada);
                    }else{
                        posArmaActiva2= getPosArma(eliminada);
                    }
                }
                armas[getPosArma(eliminada)]=armas[numArmas];
                armas[numArmas]=null;
                return true;
                
            }
            //Aqui el arma no es activa y además es la ultima
            armas[numArmas]=null;
            return true;
        }
        return false;
        
    }
 
    public boolean recogerProvisiones(Provision prov){
        if(puedoRecogerObjeto()){
            this.provisiones[numProvisiones++]= prov;
            return true;
        }else{
            return false;
        }
    }
    
    
    public int getPosProvision(Provision prov){
        for(int i=0; i<numProvisiones;i++){
            if(provisiones[i].equals(prov)){
                return i;
            }
        }
        return -1;
    }
    
    public boolean tengoEsaProvision(Provision prov){
        return getPosProvision(prov)>=0;
    }
    
    public boolean dropProvision(Provision prov){
        if(tengoEsaProvision(prov)){
            numProvisiones--;
            if(numProvisiones!=getPosProvision(prov)){
                provisiones[getPosProvision(prov)]=provisiones[numProvisiones];
                provisiones[numProvisiones]=null;
                return true;
            }
            provisiones[numProvisiones]=null;
            return true;
            
     
        }
        return false;
    }
    
    
    

    

}
>>>>>>> THEIRS
