/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mipaquete;

/**
 *
 * @author estudiantes
 */
public class Principal02 {

    /**
     * @param args the command line arguments
     * Se ha realizaco configuración de Netbeans en equipo personal.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Deaclaración de objeto 01
        Perro fifi;
        fifi = new Perro();
        
        // Deraclaración de objeto 02
        PerroPeligroso danger = new PerroPeligroso();
        
        danger.Asustar();
        fifi.ladrar();
    }
    
}
