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
public class Pila_Zombies {
    
    Objeto_Zombie cabeza_pila;
    Objeto_Zombie final_pila;
    
    public Pila_Zombies()
    {
        cabeza_pila = null;
        final_pila = null;
    }
    
    boolean Pila_Vacia()
    {
    if(cabeza_pila == null)
    {
    return true;
    }
    else
    {
    return false;
    }
    }
    
    public static void Ingresar()
    {
    
    }
    
}
