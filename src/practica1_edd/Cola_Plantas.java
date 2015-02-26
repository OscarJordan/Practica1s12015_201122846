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
public class Cola_Plantas {
    
    Objeto_Planta cabeza_cola;
    Objeto_Planta final_cola;
    
    Cola_Plantas()
    {
    cabeza_cola = null;
    final_cola = null;
    }
    
    boolean Cola_Vacia()
    {
    if(cabeza_cola  == null)
    {
    return true;   
    }
    else
    {
    return false;
    }
    }
    
    
    
}
