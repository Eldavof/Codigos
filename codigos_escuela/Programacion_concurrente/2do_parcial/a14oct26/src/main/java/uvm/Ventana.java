package uvm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    private JLabel lbEstado;
    private JButton btnIniciar;
    private JButton btnPausa;
    private JButton btnContinuar;
    private JButton btnTerminar;

    private void accionIniciar(){
        lbEstado.setText("ESTADO: EN EJECUCIÓN");
    JOptionPane.showMessageDialog(
        this,
        "Inicia la ejecución del proceso concurrente.",
        "Función: Iniciar",
        JOptionPane.INFORMATION_MESSAGE
        );
    }
    public Ventana() {
        // Configuración básica del Frame
        setTitle("Panel de Control Hilo");
        setSize(550, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(15, 15));

        // --- SECCIÓN SUPERIOR/CENTRAL: Label con Fuente Grande ---
        lbEstado = new JLabel("ESTADO: DETENIDO", SwingConstants.CENTER);
        lbEstado.setFont(new Font("SansSerif", Font.BOLD, 28));
        lbEstado.setForeground(new Color(40, 40, 40));
        lbEstado.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        
        add(lbEstado, BorderLayout.CENTER);

        // --- SECCIÓN INFERIOR: Panel de Botones de Control ---
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 15));

        btnIniciar = new JButton("Iniciar");
        btnPausa = new JButton("Pausa");
        btnContinuar = new JButton("Continuar");
        btnTerminar = new JButton("Terminar");

        panelBotones.add(btnIniciar);
        panelBotones.add(btnPausa);
        panelBotones.add(btnContinuar);
        panelBotones.add(btnTerminar);

        add(panelBotones, BorderLayout.SOUTH);

        // --- MANEJO DE EVENTOS (Clases Anónimas e Invocación Directa) ---
        configurarEventos();

        // Centrar la ventana en pantalla
        setLocationRelativeTo(null);
    }


    private void configurarEventos() {
        // Evento Botón Iniciar
        btnIniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                accionIniciar();
            }
        });

        // Evento Botón Pausa
        btnPausa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //accion
            }
        });


        
        // Evento Botón Continuar
        btnContinuar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbEstado.setText("ESTADO: EN EJECUCIÓN");
                
            }
        });

        // Evento Botón Terminar
        btnTerminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbEstado.setText("ESTADO: TERMINADO");
                
            }
        });
    }

}

