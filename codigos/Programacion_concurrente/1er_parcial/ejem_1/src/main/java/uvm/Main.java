package uvm;
import javax.swing.JOptionPane; //paquete para poder poner ventanas emergentes

public class Main {
    public static void main(String[] args) {
        AutoDeportivo obj;
        obj = new AutoDeportivo();
        obj.encender();
        obj.acelerar();
        obj.frenar();
        obj.apagar();
        javax.swing.JOptionPane.showMessageDialog(null, "El auto deportivo es de la marca: " + obj.getMarca());
        javax.swing.JOptionPane.showMessageDialog(null, "El auto deportivo es de color: " + obj.getColor());
        obj.mostrarInfo();
    }
}