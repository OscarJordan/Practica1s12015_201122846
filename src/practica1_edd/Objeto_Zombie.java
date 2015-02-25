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
public class Objeto_Zombie {
    
    Objeto_Zombie sig;
    String path;
    String nombre;
    int defensa;
    int ataque;
    String tipo;
    
    public Objeto_Zombie(String ruta, String nom, int def, int at, String type)
    {
    this.sig = null;
    this.path = ruta;
    this.nombre = nom;
    this.ataque = at;
    this.defensa = def;
    this.tipo = type;
    }
    
}
