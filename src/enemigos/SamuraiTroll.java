/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enemigos;

/**
 *
 * @author Juan
 */
public class SamuraiTroll {
    
    //VARIABLES(ATRIBUTOS)
    private String tecnicaEspecial;
    private String nombre;
    private int vida;
    private int ataque;

    //CONSTRUCTOR
    public SamuraiTroll() {
    }
    
    //METODOS ENCAPSULAMIENTO (set/get)
    //SET: ASIGNANDO UN VALOR A UN ATRIBUTO
    //GET: OBTENIENDO/ACCEDER/BUSCAR/LEER UN VALOR DE UN ATRIBUTO

    public String getTecnicaEspecial() {
        return tecnicaEspecial;
    }

    public void setTecnicaEspecial(String tecnicaEspecial) {
        this.tecnicaEspecial = tecnicaEspecial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        
       
        return vida;
    }

    public void setVida(int vida) {
        
        if(vida<100){
            System.out.println("Por favor rectifica tu valor de vida");
            
        }else{
            this.vida = vida;
        }
        
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
    
    
    
    
}
