package edu.craptocraft.trabajadores;

public class Docente extends Persona{
    private String titulacion;
    private double puntos;

    public Docente(Integer id, String nombre, String primerApellido, String segundoApellido, String titulacion, double puntos) {
        super(id, nombre, primerApellido, segundoApellido);
        this.titulacion = titulacion;
        this.puntos = puntos;
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public double getPuntos() {
        return puntos;
    }

    public void setPuntos(float puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Docente: ").append('\n');
        sb.append("id: ").append(id).append('\n');
        sb.append("Titulación: ").append(titulacion).append('\n');
        sb.append("Puntos: ").append(puntos).append('\n');
        sb.append("Nombre: ").append(nombre).append('\n');
        sb.append("Primer apellido: ").append(primerApellido).append('\n');
        sb.append("Segundo apellido: ").append(segundoApellido).append('\n');
        return sb.toString();
    }
}
