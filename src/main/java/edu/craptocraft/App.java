package edu.craptocraft;

import edu.craptocraft.plazas.AdjudicadorPlazas;
import edu.craptocraft.plazas.Plaza;
import edu.craptocraft.trabajadores.Docente;
import edu.craptocraft.trabajadores.Persona;
import edu.craptocraft.trabajadores.Sanitario;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Plaza> plazas = Arrays.asList(
                new Plaza(1, 'D'),
                new Plaza(2, 'S'),
                new Plaza(3, 'D'),
                new Plaza(4, 'S'),
                new Plaza(5, 'D'),
                new Plaza(6, 'S'),
                new Plaza(7, 'D'),
                new Plaza(8, 'S'),
                new Plaza(9, 'D'),
                new Plaza(10, 'S')
        );

        Persona p1 = new Docente(1, "Juan", "Perez", "Garcia", "Matematicas", 100.0);
        Persona p2 = new Docente(2, "Maria", "Gomez", "Garcia", "Matematicas", 20.0);
        Persona p3 = new Docente(3, "Jose", "Garcia", "Garcia", "Matematicas", 10.0);
        Persona p4 = new Docente(4, "Luis", "Garcia", "Garcia", "Matematicas", 9.0);
        Persona p5 = new Docente(5, "Antonio", "Garcia", "Garcia", "Matematicas", 110.0);
        Persona p6 = new Sanitario(6, "Juan", "Perez", "Garcia", "Medicina", 190);
        Persona p10 = new Sanitario(10, "Antonio", "Garcia", "Garcia", "Medicina", 104);

        List<Persona> personas = Arrays.asList(p1, p2, p3, p4, p5, p6, p10);
        AdjudicadorPlazas adjudicadorPlazas = new AdjudicadorPlazas();
        adjudicadorPlazas.adjudicarPlazas(plazas, personas);
        adjudicadorPlazas.mostrarPlazas(plazas);
    }
}
