/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraestructurasdedatos;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
<<<<<<< HEAD
import javax.swing.ImageIcon;
=======
import java.util.ArrayList;
>>>>>>> Alejo
import javax.swing.JOptionPane;
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
    private double var1, var2;
    private int operacion;
    private ArrayStack operadores,valores,operaciones_temp,valores_temp;
    
    
    public Interfaz()
    {
        // mira mi huevo.
        super ("Calculadora del Averno");
        Contenedor1 = new JPanel(new GridLayout(3, 1));
        add(Contenedor1);
        AgregarBoton();
        botonEscuchador();//comentario de prueba
        jtCalculadora.setText("0");
        this.setSize(800, 800);        
        
 
    }
    public void IconoFrame()
    {
     setIconImage(new ImageIcon(getClass().getResource("../ImagenIcono/calcuworld.png")).getImage());
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
        btn7 = new JButton("7");
        pnlBotones.add(btn7);
        btn8 = new JButton("8");
        pnlBotones.add(btn8);
        btn9 = new JButton("9");
        pnlBotones.add(btn9);
        btnSuma = new JButton("+");
        pnlBotones.add(btnSuma);
        btnC = new JButton("C");
        pnlBotones.add(btnC);
        btnBorrar = new JButton("<==");
        pnlBotones.add(btnBorrar);
        btn4 = new JButton("4");
        pnlBotones.add(btn4);
        btn5 = new JButton("5");
        pnlBotones.add(btn5);
        btn6 = new JButton("6");
        pnlBotones.add(btn6);
        btnDiv = new JButton("/");
        pnlBotones.add(btnDiv);
        btnPar1 = new JButton("(");
        pnlBotones.add(btnPar1);
        btnPar2 = new JButton(")");
        pnlBotones.add(btnPar2);
        btn1 = new JButton("1");
        pnlBotones2.add(btn1);     
        btn2 = new JButton("2");
        pnlBotones2.add(btn2);
        btn3 = new JButton("3");
        pnlBotones2.add(btn3);
        btnMult = new JButton("*");
        pnlBotones2.add(btnMult);
        btnMod = new JButton("Mod");
        pnlBotones2.add(btnMod);
        btnResta = new JButton("-");
        pnlBotones2.add(btnResta);
        btnPunto = new JButton(".");
        pnlBotones2.add(btnPunto);
        btn0 = new JButton("0");
        pnlBotones2.add(btn0);
        btnDivE = new JButton("Div");
        pnlBotones2.add(btnDivE);
        btnIgual = new JButton("=");
        pnlBotones2.add(btnIgual);
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
       btnBorrar.addActionListener(manejador);
       btnC.addActionListener(manejador);
       btnIgual.addActionListener(manejador);
       btnSuma.addActionListener(manejador);
    }
    private void cant1KeyPressed(java.awt.event.KeyEvent evt) {  //este metodo borra letras que hayan ingresado del teclado
        // aqui ponemos la validacion: 
        int k = (int) evt.getKeyChar(); //k = al valor de la tecla presionada 
        if (k >= 97 && k <= 122 || k >= 65 && k <= 90) { //Si el carácter ingresado es una letra 
            evt.setKeyChar((char) KeyEvent.VK_CLEAR); //Limpiar el carácter ingresado 
            JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Validando Datos", 
            JOptionPane.ERROR_MESSAGE); 
        }
    }
    
    public class botonManejador implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if (e.getSource() == btnSuma)
            {
                operacion = 1;
                var1 = Double.parseDouble(jtCalculadora.getText());
            }
            
            if (e.getSource() != btnBorrar && e.getSource() != btnC && e.getSource() != btnIgual && e.getSource() != btnDiv
                    && e.getSource() != btnDivE && e.getSource() != btnMod && e.getSource() != btnMult && e.getSource() != btnResta
                    && e.getSource() != btnSuma)
            {
                JButton temp = (JButton)e.getSource();
                jtCalculadora.setText(jtCalculadora.getText() + temp.getText());
                
            }
            
            if (e.getSource() == btnBorrar)
            {
                if(jtCalculadora.getText().length()!=0)
                {
                jtCalculadora.setText(jtCalculadora.getText().substring(0,jtCalculadora.getText().length()-1));
                }
            }
            if (e.getSource() == btnC)
                jtCalculadora.setText("");
            
            if (e.getSource() == btnIgual)
            {
                 String texto_de_entrada = "0" + jtCalculadora.getText();
                 texto_de_entrada = texto_de_entrada.trim();
                 texto_de_entrada = texto_de_entrada.replaceAll(" ", "");
                 texto_de_entrada = texto_de_entrada.replaceAll("-", "+-");
                 String temp = "";
                 for (int i = 0; i < texto_de_entrada.length(); i++) {
                     char indice_de_navegacion = texto_de_entrada.charAt(i);
                     
                     if (indice_de_navegacion == '-') {
                         temp = "-" + temp;                         
                     } 
                     
                     else if (indice_de_navegacion != '+' &&  indice_de_navegacion != '*' && indice_de_navegacion != '/' ) {
                         temp= temp + indice_de_navegacion;
                         
                     }
                     else
                     {
                         valores.push(Double.parseDouble(temp));
                         operadores.push((int)indice_de_navegacion);
                         temp = "";
                         
                     }
                    
                }
                 
                 valores.push(Double.parseDouble(temp));
                 char simbolos_de_operaciones[] ={'/','*','+'};
                 
                 
                 
                double num = Integer.parseInt(jtCalculadora.getText());
                System.out.println(num);
            }
            if (e.getSource() == btnResta) {
                
                operacion = 2;
               
            }
        }

    }
}
