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
public class Lista_Nombres {
    
    Lista_Nombres cabecera;
    Lista_Nombres sig;
    String tipo;
    boolean bandera_planta = false;
    boolean bandera_zombie = false;
    
    Lista_Nombres()
    {
    String tipo = "cabeza";    
    Lista_Nombres nuevo = new Lista_Nombres();
    cabecera = nuevo;
    cabecera.sig = null;
    }
    
    
    
    public void Insertar_Planta()
    {
    tipo = "planta";
    Lista_Nombres planta = new Lista_Nombres();
    if(cabecera.sig == null)
    {
    cabecera.sig = planta;
    bandera_planta = true;
    }
    else
    {
    Lista_Nombres aux;
    aux = cabecera;
    while(aux.sig != null)
    {
    aux = aux.sig;
    }
    aux.sig = planta;
    bandera_planta = true;
    }
    }
    
    public void Insertar_Zombie()
    {
    tipo = "zombie";
    Lista_Nombres zombie = new Lista_Nombres();
    if(cabecera.sig == null)
    {
    cabecera.sig = zombie;
    bandera_zombie = true;
    }
    else
    {
    Lista_Nombres aux;
    aux = cabecera;
    while(aux.sig != null)
    {
    aux = aux.sig;
    }
    aux.sig = zombie;
    bandera_zombie = true;
    }
    }
}