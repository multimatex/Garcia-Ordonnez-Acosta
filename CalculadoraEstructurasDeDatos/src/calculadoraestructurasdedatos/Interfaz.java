/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraestructurasdedatos;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author Equipo
 */
public class Interfaz extends JFrame
{    
   
    // Todos los botones declarados
    private JButton btn0,btn1,btn2,btn3, btn4,btn5,btn6,btn7,btn8,btn9,btnSuma,btnResta,btnMult,btnDiv,btnPot,btnMod,btnDivE,btnIgual,btnPunto,btnBorrar,btnPar1,btnPar2,btnC;
    private JTextField jtCalculadora;
    private JPanel pnlBotones2,pnlBotones,pnltexto,Contenedor1;
  
    public Interfaz()
    {
        // mira mi huevo.
        super ("Calculadora del Averno");
        Contenedor1 = new JPanel(new GridLayout(3, 1));
        add(Contenedor1);        
        AgregarBoton();
        botonEscuchador();//comentario de prueba
        this.setSize(800, 800);
 
    }
    
    //Este metodo Crea los botones y los Agrega
    public void AgregarBoton()
    {
        jtCalculadora = new JTextField();
        pnltexto = new JPanel(new GridLayout(1, 1));
        pnltexto.add(jtCalculadora);
        Contenedor1.add(pnltexto);
        pnlBotones = new JPanel(new GridLayout(2,6));
        pnlBotones2 = new JPanel(new GridLayout(2,6));        
        Contenedor1.add (pnlBotones);
        Contenedor1.add (pnlBotones2);
        btnBorrar = new JButton("(Borrar)");
        pnlBotones.add(btnBorrar);
        btnIgual = new JButton("=");
        pnlBotones.add(btnIgual);
        btnC = new JButton("C");
        pnlBotones.add(btnC);
        btnSuma = new JButton("+");
        pnlBotones.add(btnSuma);
        btnPar1 = new JButton("(");
        pnlBotones.add(btnPar1);
        btn7 = new JButton("7");
        pnlBotones.add(btn7);
        btn8 = new JButton("8");
        pnlBotones.add(btn8);
        btn9 = new JButton("9");
        pnlBotones.add(btn9);
        btnDiv = new JButton("/");
        pnlBotones.add(btnDiv);
        btnPar2 = new JButton(")");
        pnlBotones.add(btnPar2);
        btn4 = new JButton("4");
        pnlBotones.add(btn4);
        btn5 = new JButton("5");
        pnlBotones.add(btn5);
        btn6 = new JButton("6");
        pnlBotones2.add(btn6);
        btnMult = new JButton("*");
        pnlBotones2.add(btnMult);
        btnMod = new JButton("Mod");
        pnlBotones2.add(btnMod);
        btn1 = new JButton("1");
        pnlBotones2.add(btn1);     
        btn2 = new JButton("2");
        pnlBotones2.add(btn2);
        btn3 = new JButton("3");
        pnlBotones2.add(btn3);
        btnResta = new JButton("-");
        pnlBotones2.add(btnResta);
        btn0 = new JButton("0");
        pnlBotones2.add(btn0);
        btnPunto = new JButton(".");
        pnlBotones2.add(btnPunto);
        btnDivE = new JButton("Div");
        pnlBotones2.add(btnDivE);
        btnIgual = new JButton("=");
        pnlBotones2.add(btnIgual);
        
        
    }
    
    public void botonEscuchador()
    {
       botonManejador manejador = new botonManejador();
       btn1.addActionListener(manejador);
       btn2.addActionListener(manejador);
       btn3.addActionListener(manejador);
       btn4.addActionListener(manejador);
       btn5.addActionListener(manejador);
       btn6.addActionListener(manejador);
       btn7.addActionListener(manejador);
       btn8.addActionListener(manejador);
       btn9.addActionListener(manejador);
       btn0.addActionListener(manejador);
    }
    
    public class botonManejador implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
          JButton temp = (JButton)e.getSource();
          System.out.println(temp.getText());
        }
    }
}
