/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package paquetes_juego;

/**
 *
 * @author CodeWithDaro
 */
public class Juego_Java {

    public static void main(String[] args) {
        logica();
    }
    
    public static void logica() {
    	System.out.println("\n Comenzando una nueva partida...");
        System.out.println("\n <-- Creacion del heroe --> \n");
        
        String nombreHeroe = ReadSC.readString("Nombre: ");
        int vidaHeroe = ReadSC.readInteger("Vida: ");
        String armaHeroe = ReadSC.readString("Arma: ");
        
        boolean arma = false;
        
        if(armaHeroe.equals("Si") || armaHeroe.equals("si"))
        {
            arma = true;
        }
        
        Heroe heroe1 = new Heroe(nombreHeroe, vidaHeroe, arma);
        System.out.println("\n" + heroe1);
    }
}
