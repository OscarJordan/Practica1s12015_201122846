/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1_edd;

import javax.swing.JOptionPane;

/**
 *
 * @author OscarPC
 */
public class Lista_Plantas {
    
    static Objeto_Planta cabeza;
    
    public void Lista_Plantas()
    {
    //cabeza = null;
    }
    
    public static void InsertarPlanta(String path, String nombre, int defensa, int ataque, String tipo)
    {
    
    Objeto_Planta planta = new Objeto_Planta(path, nombre, defensa, ataque, tipo);    
    if(cabeza == null)
    {
    cabeza = planta;
    
    }
    else
    {
    
    Objeto_Planta aux;
    aux = cabeza;
    while(aux.sig != null)
    {
    aux.sig = aux;
    }
    aux.sig = planta;
    }
    
    }
    
    
}
