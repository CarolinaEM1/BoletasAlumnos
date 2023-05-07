
package pkg20031299;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Promedio {
    double calif1,calif2,calif3,calif4,promedio;
    String Estatus;
    

    void leerDatos() {
        calif1=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion del parcial 1"));
        calif2=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion del parcial 2"));
        calif3=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion del parcial 3"));
        calif4=Double.parseDouble(JOptionPane.showInputDialog("Ingresa la calificacion del parcial 4"));
    }

    void calcular() {
        promedio=(calif1+calif2+calif3+calif4)/4;
        if (promedio >=70){
            Estatus= "Aprobado";
        }
        else{
            if (promedio<70){
                Estatus= "Reprobado";
            }
        }
    }

    String mostrar() {
         String aux; 
 aux="\nCalificacion 1: "+calif1+"\nCalificacion 2: "+calif2+"\nCalificacion 3:  "+calif3+"\nCalificacion 4: "+calif4+"\nPromedio: "+promedio+"\nEstatus: "+Estatus; 
 return (aux); 

    }
    
}
