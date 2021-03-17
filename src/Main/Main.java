package Main;

import Deporte.*;

public class Main {
    public static void main(String[] args) {

        Deporte futbol = new Deporte();
        futbol.setNombre("futbol");
        futbol.setJugadores(11);
        futbol.setTipo("terrestre");
        futbol.setTiempo(90);

        Deporte nado_sincronizado = new Deporte();
        nado_sincronizado.setNombre("nado sincronizado");
        nado_sincronizado.setJugadores(8);
        nado_sincronizado.setTipo("acuático");
        nado_sincronizado.setTiempo(3);

        Deporte quidditch = new Deporte();
        quidditch .setNombre("quidditch");
        quidditch .setJugadores(7);
        quidditch .setTipo("aéreo");
        quidditch .setTiempo(3);



        System.out.println("el deporte " + futbol.getNombre() +
                " es de tipo " + futbol.getTipo() + ", tiene " + futbol.getJugadores() +
                " jugadores por equipo y un tiempo de " + futbol.getTiempo() + " minutos\n");


        System.out.println("el deporte " + nado_sincronizado.getNombre() +
                " es de tipo " + nado_sincronizado.getTipo() + ", tiene " + nado_sincronizado.getJugadores() +
                " jugadores por equipo y un tiempo de " + nado_sincronizado.getTiempo() + " minutos\n");


        System.out.println("el deporte " + quidditch.getNombre() +
                " es de tipo " + quidditch.getTipo() + ", tiene " + quidditch.getJugadores() +
                " jugadores por equipo y un tiempo de hasta " + quidditch.getTiempo() + " meses\n");

    }
}
