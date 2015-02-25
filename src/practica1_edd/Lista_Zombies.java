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
public class Lista_Zombies {
    
    static Objeto_Zombie cabeza;
    
    public void Lista_Zombie()
    {
    //cabeza = null;
    }
    
    public static void InsertarZombie(String path, String nombre, int defensa, int ataque, String tipo)
    {
    
    Objeto_Zombie zombie = new Objeto_Zombie(path, nombre, defensa, ataque, tipo);    
    if(cabeza == null)
    {
    cabeza = zombie;
    
    }
    else
    {
    
    Objeto_Zombie aux;
    aux = cabeza;
    while(aux.sig != null)
    {
    aux.sig = aux;
    }
    aux.sig = zombie;
    }
    
    }
    
}
