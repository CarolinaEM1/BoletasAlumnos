/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20031299;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina EM
 */
public class Materia {
    String nomMateria, claveMateria;
    byte creditos;

    void leerDatos() {
         nomMateria=JOptionPane.showInputDialog("Teclea nombre de la Materia"); 
         claveMateria=JOptionPane.showInputDialog("Teclea clave de la Materia\n"+nomMateria);
         creditos=Byte.parseByte(JOptionPane.showInputDialog("Teclea créditos de la Materia\n"  +nomMateria));
        
        
    }
    
    String mostrar(){
       String aux; 
 aux="”\nClave de la Materia: "+claveMateria+"\nNombre de la materia:  "+nomMateria+"\nCreditos: "+creditos; 
 return (aux); 


    }
    
}
