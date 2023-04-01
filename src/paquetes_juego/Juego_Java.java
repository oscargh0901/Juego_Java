package paquetes_juego;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Juego_Java extends JFrame implements ActionListener {
    
    public Juego_Java() {
        super("Juego");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        
        JButton nuevaPartidaButton = new JButton("Nueva partida");
        nuevaPartidaButton.addActionListener(this);
        panel.add(nuevaPartidaButton);
        
        JButton cargarPartidaButton = new JButton("Cargar partida");
        cargarPartidaButton.addActionListener(this);
        panel.add(cargarPartidaButton);
        
        JButton ajustesButton = new JButton("Ajustes");
        ajustesButton.addActionListener(this);
        panel.add(ajustesButton);
        
        JButton salirButton = new JButton("Salir");
        salirButton.addActionListener(this);
        panel.add(salirButton);
        
        add(panel);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        
        if (action.equals("Nueva partida")) {
            int nueva_partida = JOptionPane.showOptionDialog(this, "¿Desea comenzar una nueva aventura?", "Juego", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Comenzar", "Cancelar"}, null);
                    
            switch(nueva_partida) {
                case 0:
                    logica();
                    break;
                    
                case 1:
                    break;
            }
        }
        else if (action.equals("Cargar partida")) {
            //obtener datos de la partida
        }
        else if (action.equals("Ajustes")) {
            //obtener los ajustes del usuario
        }
        else if (action.equals("Salir")) {
            JOptionPane.showMessageDialog(this, "Saliendo...");
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        new Juego_Java();
    }
    
    public static void logica() {
        JOptionPane.showMessageDialog(null, "Comenzando una nueva partida...");
        JOptionPane.showMessageDialog(null, "<-- Creación del heroe -->");
        
        String nombreJugador = JOptionPane.showInputDialog(null, "Nombre:");
        int vidaJugador = Integer.parseInt(JOptionPane.showInputDialog(null, "Vida:"));
        int nivel = 0; // Nivel inicial
        
        Personaje crearPersonaje = new Personaje(nombreJugador, vidaJugador, nivel);
        
        String nombreNpc = "Anastasio";
        int vidaNpc = 80;
        String dialogo = "Tengo ganas de irme a una taberna a comer unas alitas picantes.";
        Npc compañera = new Npc(nombreNpc, vidaNpc, dialogo);
        
        Juego juego = new Juego();
        juego.agregarPersonaje(crearPersonaje);
        juego.agregarNPC(compañera);

        for (Personaje personaje : juego.getPersonajes()) {
            JOptionPane.showMessageDialog(null, personaje.toString());
        }
        for (Npc npc : juego.getNPCs()) {
            JOptionPane.showMessageDialog(null, npc.toString());
        }
    }
}
