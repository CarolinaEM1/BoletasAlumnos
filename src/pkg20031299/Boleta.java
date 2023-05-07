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
class Boleta {

     Alumno al=new Alumno(); 
     Materia ma=new Materia();
     Promedio pr=new Promedio();
    void leerDatos() {
        al.leerDatos();
        ma.leerDatos();
        pr.leerDatos();
    }

    void calcular() {
        pr.calcular();
               
    }

    String mostrar() {
        String aux;
        aux="Boleta de calificaciones"+al.mostrar()+ma.mostrar()+pr.mostrar(); 
        return aux; 

    }
    
}
