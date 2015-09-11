/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraestructurasdedatos;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
        
/**
 *
 * @author w7
 */
public class CalculadoraEstructurasDeDatosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here    
        Interfaz marco = new Interfaz();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        //marco.setLocation(500, 150); //antiguo codigo que establece el jframe en estas coordenadas no sirve al pasar a otro pc que poseea mayor resolucion(o en config monitores duales)
        marco.pack();//metodo que inicializa y maneja los tamaños de los componentews y los ajusta de acuerdo a su contenido(o al tamaño minimo)
        marco.setLocationRelativeTo(null);//establece la localizacion del objeto siendo relativa a un componente(en este ncaso con el null estableceria la pos en el centro de la pantalla)
        marco.setResizable(false);
        marco.setSize(400, 400);        
        marco.IconoFrame();
    }
    
}
