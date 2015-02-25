/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica1_edd;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author OscarPC
 */
public class Dibujar {
    
    public static void DibujarJugadores()
    {
    try {
      
      String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
      
      String fileInputPath = "C:\\Users\\OscarPC\\Documents\\NetBeansProjects\\Practica1_EDD\\src\\Textos\\Jugadores.txt";
      String fileOutputPath = "C:\\Users\\OscarPC\\Documents\\NetBeansProjects\\Practica1_EDD\\src\\Textos\\Jugadores.jpg";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      //System.out.println(fileInputPath);
      rt.exec( cmd );
      JOptionPane.showMessageDialog(null, "Gráfica generada. Por favor revisar carpeta de origen");
    } catch (IOException ex) {
    } finally {
    }

    }
    
    public static void DibujarCategorias()
    {
    try {
      
      String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
      
      String fileInputPath = "C:\\Users\\OscarPC\\Documents\\NetBeansProjects\\Practica1_EDD\\src\\Textos\\Cat.txt";
      String fileOutputPath = "C:\\Users\\OscarPC\\Documents\\NetBeansProjects\\Practica1_EDD\\src\\Textos\\Cat.jpg";
      
      String tParam = "-Tjpg";
      String tOParam = "-o";
        
      String[] cmd = new String[5];
      cmd[0] = dotPath;
      cmd[1] = tParam;
      cmd[2] = fileInputPath;
      cmd[3] = tOParam;
      cmd[4] = fileOutputPath;
                  
      Runtime rt = Runtime.getRuntime();
      //System.out.println(fileInputPath);
      rt.exec( cmd );
      JOptionPane.showMessageDialog(null, "Gráfica generada. Por favor revisar carpeta de origen");
    } catch (IOException ex) {
    } finally {
    }
    }
    
}
