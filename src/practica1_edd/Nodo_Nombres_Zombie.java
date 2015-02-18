/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1_edd;

/**
 *
 * @author OscarPC
 */
public class Nodo_Nombres_Zombie {
    
    String nombre;
    int cantidad;
    Nodo_Nombres_Zombie sig;
        
    Nodo_Nombres_Zombie(String nombre, int cantidad)
    {
    sig = null;
    }
    
}
