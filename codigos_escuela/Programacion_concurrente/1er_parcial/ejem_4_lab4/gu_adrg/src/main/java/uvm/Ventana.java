package uvm;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class Ventana extends JFrame {

    private JButton b1, b2;
    private JTextField caja;
    private JLabel letrero;
    private JCheckBox op1, op2;
    private JRadioButton rb1, rb2;
    private ButtonGroup gr1;

    private void construccion(){

        b1= new JButton("accion 1");
        b2= new JButton("accion 2");
        caja = new JTextField(10);
        letrero = new JLabel("Nombre aqui >");
        op1 = new JCheckBox("Opción 1");
        op2 = new JCheckBox("Opción 2");
        rb1 = new JRadioButton("Opción A");
        rb2 = new JRadioButton("Opción B");

        gr1 = new ButtonGroup();
        gr1.add(rb1);
        gr1.add(rb2);
    }


    public Ventana(){

        setTitle("Mi primera ventana");
        setBounds(200,200,400,155);
        construccion();
        setLayout(new BorderLayout());

        JPanel opciones = new JPanel();
        JPanel opciones2 = new JPanel();
        JPanel opciones5 = new JPanel();
        JPanel opciones3 = new JPanel();
        JPanel opciones4 = new JPanel();

        opciones.setLayout(new FlowLayout());
        add(opciones, BorderLayout.CENTER);
        add(opciones4, BorderLayout.NORTH);
        add(opciones2, BorderLayout.WEST);
        add(opciones5, BorderLayout.EAST);
        add(opciones3, BorderLayout.SOUTH);
        opciones.add(letrero);
        opciones.add(caja);
        opciones4.add(op1);
        opciones4.add(op2);
        opciones2.add(b1);
        opciones5.add(b2);
        opciones3.add(rb1);
        opciones3.add(rb2);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}