package paquetes_juego;

import java.util.ArrayList;
import java.util.List;

public class Juego {
    private List<Personaje> personajes;
    private List<Npc> npcs;
    
    public Juego() {
        personajes = new ArrayList<>();
        npcs = new ArrayList<>();
    }
    
    public void agregarPersonaje(Personaje personaje) {
        personajes.add(personaje);
    }
    
    public void agregarNPC(Npc npc) {
        npcs.add(npc);
    }
    
    public List<Personaje> getPersonajes() {
        return personajes;
    }
    
    public List<Npc> getNPCs() {
        return npcs;
    }
}

