package paquetes_juego;

import javax.swing.JOptionPane;

public class Juego_Java {

    public static void main(String[] args) {
        menu();
    }
    
    public static void menu() {
        boolean menu = false;
        
        do {
            int respuesta = JOptionPane.showOptionDialog(null, "MENU PRINCIPAL", "Juego", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Nueva partida", "Cargar partida", "Ajustes", "Salir"}, null);
            
            switch(respuesta) {
                case 0:
                    int nueva_partida = JOptionPane.showOptionDialog(null, "¿Desea comenzar una nueva aventura?", "Juego", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Comenzar", "Cancelar"}, null);
                    
                    switch(nueva_partida) {
                        case 0:
                            menu = false;
                            logica();
                            break;
                            
                        case 1:
                            menu = true;
                            break;
                    }
                    
                    break;
                    
                case 1:
                    //obtener datos de la partida
                    break;
                    
                case 2:
                    //obtener los ajustes del usuario
                    break;
                    
                case 3:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    System.exit(0);
                    break;
            }
        } while(menu);
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
