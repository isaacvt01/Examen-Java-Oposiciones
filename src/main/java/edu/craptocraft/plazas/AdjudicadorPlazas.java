package edu.craptocraft.plazas;

import edu.craptocraft.trabajadores.Docente;
import edu.craptocraft.trabajadores.Persona;
import edu.craptocraft.trabajadores.Sanitario;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AdjudicadorPlazas {

    public void adjudicarPlazas(List<Plaza> plazas, List<Persona> personas) {
        boolean finalizado = false;

            for (Plaza plaza : plazas) {
                if (!plaza.isAdjudicada()) {
                    if (plaza.getTipo() == 'D'){

                        Optional<Docente> docenteMaxPuntuacion = personas.stream()
                                .filter(persona -> persona instanceof Docente)
                                .filter(persona -> !persona.isTienePlaza())
                                .map(persona -> (Docente) persona)
                                .max(Comparator.comparing(Docente::getPuntos));
                        asignarDocente(plaza, docenteMaxPuntuacion.get());
                        if (docenteMaxPuntuacion.isPresent()) {
                            asignarDocente(plaza, docenteMaxPuntuacion.get());
                        }

                    }else if (plaza.getTipo() == 'S'){
                            Optional<Sanitario> sanitarioMaxDiasTrabajados = personas.stream()
                                    .filter(persona -> persona instanceof Sanitario)
                                    .filter(persona -> !persona.isTienePlaza())
                                    .map(persona -> (Sanitario) persona)
                                    .max(Comparator.comparing(Sanitario::getNumDiasTrabajados));
                            if (sanitarioMaxDiasTrabajados.isPresent()) {
                                asignarSanitario(plaza, sanitarioMaxDiasTrabajados.get());
                            }

                }
            }
        }
    }

    public void mostrarPlazas(List<Plaza> plazas) {
        for (Plaza plaza : plazas) {
            System.out.println(plaza.toString());
        }
    }
    private void asignarDocente(Plaza plaza, Persona docente) {

        plaza.setAdjudicada(true);
        plaza.setPersona(docente);
        docente.setTienePlaza(true);
        Docente.contador += 1;
    }
    private void asignarSanitario(Plaza plaza, Persona sanitario) {
        plaza.setAdjudicada(true);
        plaza.setPersona(sanitario);
        sanitario.setTienePlaza(true);
        Sanitario.contador += 1;
    }
}
