# Examen-Java-Oposiciones

Enunciado del examen:
El Govern de les Illes Balears, nos ha pedido que implementemos un sistema para adjudicar
las plazas de los interinos que forman parte tanto los docentes como los sanitarios, por
tanto, nuestro sistema informático quiere tratar principalmente con información de docentes
y sanitarios:
a. Tanto   docentes   y   sanitarios   tienen   atributos   comunes,   así   que   hemos
decidido crear una clase Persona (1 punto) que tendrá los siguientes datos:
id, nombre, primer apellido, segundo apellido y contador que nos informará
del número de personas dadas de alta (este atributo estará compartido por
todas las instancias y lo utilizaremos para aprovechar y dar de alta las
distintas personas). Por tanto, los docentes y sanitarios son una especialidad
de persona.
b. Los Docentes se caracterizan por tener una titulación y un número de puntos
(que pueden ser decimales), que se utilizarán para adjudicar las plazas (1
punto).
c. Los Sanitarios se caracterizan por tener una especialidad y un número de
días trabajado (serán números enteros), que se utilizarán para adjudicar las
plazas (1 punto).
d. Las Plazas se caracterizan por tener un id de la plaza, tipo de plaza (“D” es
una plaza para docentes, “S” es una plaza para sanitarios), adjudicada (un
booleano que nos informa a true, cuando este adjudicada y false en caso
contrario) y finalmente una Persona, que estará informado si está adjudicada
la plaza y si no es así no estará informada (inicialmente cuando se crean las
plazas no tienen adjudicados ningún interino). (1 punto).
e. Para las tres clases anteriores, crea los getters/setters y constructores que
necesites de manera adecuada. (1 punto).
El programa no tendrá ningún menú, lo único que hace es llamar a un método llamado
adjudicarPlazas (3 puntos), que recibe como parámetro una lista de Plazas (que puede
haber plazas para sanitarios y para docentes), y una única lista no ordenada tanto de
docentes como de sanitarios disponibles. El método de adjudicación será el siguiente: por
orden de plaza, se seleccionará el especialista correspondiente (que esté en la lista con
mayor puntuación o días trabajados, según corresponda). Obviamente una persona solo
puede trabajar en un sitio (no se le pueden adjudicar varias plazas, y podrían quedar plazas
sin adjudicar), por tanto, si se adjudica una plaza, sale de la lista.
Finalmente, cuando termine el método mostrarAdjudicaciones mostrará la lista de plazas
por pantalla, primero los sanitarios y luego los docentes (1 punto).
Implementa   el   método  simularAdjudicacion  (1 punto),   o   métodos   que     consideres
oportunos para realizar una simulación de adjudicación, es decir, crea una lista automática
de plazas y personas.
