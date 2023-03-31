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
        menu();
    }
    
    public static void menu() {
    	boolean menu = false;
    	
    	do {
    		System.out.println("\n MENU PRINCIPAL");
	    	System.out.println("\n 1.- Nueva partida");
	    	System.out.println("\n 2.- Cargar partida");
	    	System.out.println("\n 3.- Ajustes");
	    	System.out.println("\n 4.- Salir");
    		
	    	int respuesta = ReadSC.readInteger("\nAcción: ");
	    	
	    	switch(respuesta) {
	    		case 1:
	    			int nueva_partida = ReadSC.readInteger("\n¿Desea comenzar una nueva aventura?\n1.- Comenzar\n2.- Cancelar\n");
	    			
	    			switch(nueva_partida) {
		    			case 1:
		    				menu = false;
		    				logica();
		    				break;
		    				
		    			case 2:
		    				menu = true;
		    				break;
	    			}
	    			
	    			break;
	    			
	    		case 2:
	    			//obtener datos de la partida
	    			break;
	    			
	    		case 3:
	    			//obtener los ajustes del usuario
	    			break;
	    			
	    		case 4:
	    			System.out.println("\nSaliendo...");
	    			System.exit(0);
	    			break;
	    	}
    	}while(menu);
    }
    
    public static void logica() {
    	System.out.println("\n Comenzando una nueva partida...");
        System.out.println("\n <-- Creación del heroe --> \n");
        
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
