package paquetes_juego;

public class Npc extends Persona {
    private String dialogo;
    
    public Npc(String nombre, int edad, String dialogo) {
        super(nombre, edad);
        this.dialogo = dialogo;
    }
    
    public String getDialogo() {
        return dialogo;
    }
    
    public void setDialogo(String dialogo) {
        this.dialogo = dialogo;
    }
    
    @Override
    public String toString() {
        return "NPC{"
                + "nombre='" + getNombre() + '\''
                + ", vida=" + getVida()
                + ", dialogo='" + dialogo + '\''
                + '}';
    }
}
