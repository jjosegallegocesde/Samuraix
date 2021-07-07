/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuraix;

import enemigos.SamuraiTroll;

/**
 *
 * @author Juan
 */
public class Samuraix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Usar la clase SamuraBueno
        //Para usar una clase, le debo sacar copia
        //Creo una VARIABLE especial(EL TIPO DE LA VARIABLE YA NO ES UN DATO PRIMITIVO)
        //(MI AVRIABLE SERA DEL TIPO CLASE)
        
  
        
  
        
        SamuraiBueno samurai=new SamuraiBueno("amakakeru ryu no hirameki","Henshin",100,4);
        System.out.println("EL nombre del samurai 1 es: "+samurai.nombre);
       
        
        SamuraiTroll samurai2= new SamuraiTroll();
        //ASIGNAR ATRIBUTOS
        samurai2.setNombre("Pedro el escamoso ");
        samurai2.setTecnicaEspecial("Machete ventiao");
        samurai2.setVida(-100);
        samurai2.setAtaque(900);
       
        //obtener/buscar/acceder a un atributo (nombre del samurai)
        System.out.println("EL nombre del samurai 2 es: "+samurai2.getNombre());
        
        
        
    }
    
    
    
}
