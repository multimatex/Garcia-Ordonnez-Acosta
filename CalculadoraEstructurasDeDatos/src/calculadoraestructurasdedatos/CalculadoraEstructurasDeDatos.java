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
public class CalculadoraEstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here    
        Interfaz marco = new Interfaz();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocation(500, 150);
        marco.setResizable(false);
        marco.setSize(400, 400);
        marco.setVisible(true);
        marco.IconoFrame();
    }
    
}
