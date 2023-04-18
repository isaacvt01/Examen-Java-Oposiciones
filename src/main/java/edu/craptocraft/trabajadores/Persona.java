package edu.craptocraft.trabajadores;

public abstract class Persona {
    protected Integer id;
    protected String nombre;
    protected String primerApellido;
    protected String segundoApellido;

    protected boolean tienePlaza;

    public boolean isTienePlaza() {
        return tienePlaza;
    }

    public void setTienePlaza(boolean tienePlaza) {
        this.tienePlaza = tienePlaza;
    }

    protected Persona(Integer id, String nombre, String primerApellido, String segundoApellido) {
        this.id = id;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }
    public static Integer contador = 0;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
}
