/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetes_juego;

/**
 *
 * @author CodeWithDaro
 */
public class Personaje extends Persona {
    private int nivel;
    
    public Personaje(String nombre, int edad, int nivel) {
        super(nombre, edad);
        this.nivel = nivel;
    }
    
    public int getNivel() {
        return nivel;
    }
    
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    @Override
    public String toString() {
        return "Personaje{"
                + "nombre='" + getNombre() + '\''
                + ", vida=" + getVida()
                + ", nivel=" + nivel
                + '}';
    }
}
