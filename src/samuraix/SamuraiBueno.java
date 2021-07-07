/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraix;

/**
 *
 * @author Juan
 */
public class SamuraiBueno {
    
    //VARIABLES(ATRIBUTOS)
    public String tecnicaEspecial;
    public String nombre;
    public int vida;
    public int ataque;
    
    //CONSTRUCTOR(FUNCION ESPECIAL)
    public SamuraiBueno(String tecnicaEspecial, String nombre, int vida, int ataque) {
        this.tecnicaEspecial = tecnicaEspecial;
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }
    
   
    public SamuraiBueno(String tecnicaEspecial) {
        this.tecnicaEspecial = tecnicaEspecial;
        
    }
    
    public SamuraiBueno() {
         
    }
    
    
    
    
    
    

    //FUNCIONES(METODOS)
    public void atacar(){
        this.vida=this.vida-1;
    }
    
    public void atacar(int vida){
        this.vida=this.vida-1;
    }
    
    
    
}
