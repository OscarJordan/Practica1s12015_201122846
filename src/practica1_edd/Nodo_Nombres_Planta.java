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
public class Nodo_Nombres_Planta {
    String nombre;
    int cantidad;
    Nodo_Nombres_Planta sig;
        
    Nodo_Nombres_Planta(String nombre1, int cantidad2)
    {
        nombre = nombre1;
        cantidad = cantidad2;
        sig = null;
    }
        
}
