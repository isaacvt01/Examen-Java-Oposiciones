package edu.craptocraft.trabajadores;

import java.security.spec.ECParameterSpec;

public class Sanitario extends Persona{
    private String especialidad;
    private Integer numDiasTrabajados;
    public Sanitario(Integer id, String nombre, String primerApellido, String segundoApellido, String especialidad, Integer numDiasTrabajados) {
        super(id, nombre, primerApellido, segundoApellido);
        this.especialidad = especialidad;
        this.numDiasTrabajados = numDiasTrabajados;
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getNumDiasTrabajados() {
        return numDiasTrabajados;
    }

    public void setNumDiasTrabajados(Integer numDiasTrabajados) {
        this.numDiasTrabajados = numDiasTrabajados;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sanitario: ").append('\n');
        sb.append("especialidad: ").append(especialidad).append('\n');
        sb.append("numDiasTrabajados: ").append(numDiasTrabajados).append('\n');
        sb.append("id: ").append(id).append('\n');
        sb.append("nombre: ").append(nombre).append('\n');
        sb.append("Primer apellido: ").append(primerApellido).append('\n');
        sb.append("Segundo apellido: '").append(segundoApellido).append('\n');
        return sb.toString();
    }
}
