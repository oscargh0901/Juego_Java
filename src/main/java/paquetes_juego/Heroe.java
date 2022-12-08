/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetes_juego;

/**
 *
 * @author CodeWithDaro
 */
public class Heroe {
    
    private String nombreHeroe;
    private int vidaHeroe;
    private boolean armaHeroe;

    public Heroe(String nombreHeroe, int vidaHeroe, boolean armaHeroe) {
        this.nombreHeroe = nombreHeroe;
        this.vidaHeroe = vidaHeroe;
        this.armaHeroe = armaHeroe;
    }

    public String getNombreHeroe() {
        return nombreHeroe;
    }

    public void setNombreHeroe(String nombreHeroe) {
        this.nombreHeroe = nombreHeroe;
    }

    public int getVidaHeroe() {
        return vidaHeroe;
    }

    public void setVidaHeroe(int vidaHeroe) {
        this.vidaHeroe = vidaHeroe;
    }

    public boolean isArmaHeroe() {
        return armaHeroe;
    }

    public void setArmaHeroe(boolean armaHeroe) {
        this.armaHeroe = armaHeroe;
    }

    @Override
    public String toString() {
        return "Heroe creado exitosamente... \n Nombre -> " + nombreHeroe + "\n Vida -> " + vidaHeroe + "\n Arma -> " + armaHeroe;
    }
    
}
