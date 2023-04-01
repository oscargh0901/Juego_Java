package paquetes_juego;

public class Persona {

	private String nombre;
	private int vida;
	
	public Persona(String nombre, int vida) {
		this.nombre = nombre;
		this.vida = vida;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
}
