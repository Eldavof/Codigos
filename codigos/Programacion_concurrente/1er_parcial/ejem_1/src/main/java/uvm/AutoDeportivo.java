package uvm;
import java.awt.Color; //paquete para poder poner colores
import javax.swing.JOptionPane; //paquete para poder poner ventanas emergentes

public class AutoDeportivo //declaracion de la clase AutoDeportivo con sus atributos y metodos
{ 
    private Color color;
    private String marca;

    public AutoDeportivo() {
        this.color = Color.RED;
        this.marca = "Pontiac";
    }

    public void setColor(Color x) {
        this.color = x;
    }

    public Color getColor() {
        return this.color;
    }

    public void setMarca(String x) {
        this.marca = x;
    }

    public String getMarca() {
        return this.marca;
    }

    public void encender() {
        javax.swing.JOptionPane.showMessageDialog(null, "El auto deportivo ha sido encendido :) ");
    }

    public void apagar() {
        javax.swing.JOptionPane.showMessageDialog(null, "El auto deportivo ha sido apagado :( ");
    }

    public void acelerar() {
        javax.swing.JOptionPane.showMessageDialog(null, "El auto deportivo esta aciendo roar roar");
    }

    public void frenar() {
        javax.swing.JOptionPane.showMessageDialog(null, "El auto deportivo esta dejando de hacer roar roar");
    }

}