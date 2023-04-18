package edu.craptocraft.plazas;

import edu.craptocraft.trabajadores.Persona;

public class Plaza {
    private Integer id;
    private char tipo;
    private boolean adjudicada;
    private Persona persona;

    public Plaza(int id, char tipo) {
        this.id = id;
        this.tipo = tipo;
        this.adjudicada = false;
        this.persona = null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public boolean isAdjudicada() {
        return adjudicada;
    }

    public void setAdjudicada(boolean adjudicada) {
        this.adjudicada = adjudicada;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("-------------------------------------------------------------------- ").append('\n');
        sb.append("Plaza: ").append('\n');
        sb.append("id: ").append(id).append('\n');
        sb.append("tipo: ").append(tipo).append('\n');
        sb.append("adjudicada: ").append(adjudicada).append('\n');
        sb.append("persona: ").append(persona).append('\n');
        return sb.toString();
    }
}
