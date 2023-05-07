
package pkg20031299;
import javax.swing.JOptionPane;


/**
 *
 * @author Carolina EM
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Promedio a=new Promedio();
        a.leerDatos();
        a.calcular();
        JOptionPane.showMessageDialog(null,a.mostrar());
        
        Alumno z=new Alumno();
        z.leerDatos();
        JOptionPane.showMessageDialog(null,z.mostrar());
        
        Materia x=new Materia();
        x.leerDatos();
        JOptionPane.showMessageDialog(null,x.mostrar());
        
        Boleta bol=new Boleta();
        bol.leerDatos();
        bol.calcular();
        JOptionPane.showMessageDialog(null,bol.mostrar());
        
        System.exit(0);
               
    }
    
}
