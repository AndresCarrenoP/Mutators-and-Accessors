package Deporte;

public class Deporte {

    private String nombre;
    private int jugadores;
    private String tipo;
    private int tiempo;


    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public int getNombre (){
        return this.nombre;


    public void setJugadores (int jugadores){
        this.jugadores = jugadores;
    }

    public int getJugadores (){
        return this.jugadores;
    }


    public void setTipo (String tipo){
        this.tipo = tipo;
    }

    public String getTipo (){
        return this.tipo;
    }

    public void setTiempo (int tiempo){
        this.tiempo = tiempo;
    }

    public int getTiempo (){
        return this.tiempo;
    }


}