package com.sv.udb.clases;

import java.util.*;

/**
 * Esta clase se utilizara como contenedor de los datos de los jugadores
 *
 * @author: Luis Bernal
 */
public class MetodosJugadores {

    /**
     * Lista que servira para almacenar los datos de los jugadores
     */
    List<DatosJugadores> lista;

    /**
     * Constructor que convierte la lista en un arraylist
     */
    public MetodosJugadores() {
        this.lista = new ArrayList<>();
    }

    /**
     *
     * Metodo para almacenar los objetos de la clase
     *
     * @param nombre El parámetro nombre define el nombre del jugador
     * @param edad El parámetro nombre define la edad del jugador
     * @param peso El parámetro nombre define el peso del jugador
     * @param altura El parámetro nombre define la altura del jugador
     *
     */
    public void agregar(String nombre, int edad, double peso, double altura) {
        this.lista.add(new DatosJugadores(nombre, edad, peso, altura));
    }

    /**
     * Metodo para consultar los jugadores ingresados
     *
     * @return arraylist con los nombres de los jugadores ingresados
     */

    public ArrayList<String> consulta() {
        ArrayList<String> jugadores = new ArrayList<>();
        for (DatosJugadores d : this.lista) {
            jugadores.add(d.getNombre());
        }
        return jugadores;
    }

    /**
     * Método que devuelve al jugador mas joven
     *
     * @return Un arreglo de 2 elementos que contiene el nombre y la edad del
     * jugador mas joven
     */
    public String[] edad() {
        String[] sr = new String[2];
        int edad = 0, cont = 0;
        for (DatosJugadores e : this.lista) {
            if (cont == 0) {
                edad = e.getEdad();
                sr[0] = e.getNombre();
                sr[1] = String.valueOf(e.getEdad());
                cont++;
            } else if (e.getEdad() < edad && cont > 0) {
                edad = e.getEdad();
                sr[0] = e.getNombre();
                sr[1] = String.valueOf(e.getEdad());
            }
        }
        return sr;
    }

    /**
     * Método que devuelve al jugador mas alto
     *
     * @return Un arreglo de 2 elementos que contiene el nombre y la edad del
     * jugador mas alto
     */
    public String[] altura() {
        String[] sr = new String[2];
        double altura = 0;
        for (DatosJugadores e : this.lista) {
            if (e.getAltura() > altura) {
                altura = e.getAltura();
                sr[0] = e.getNombre();
                sr[1] = String.valueOf(e.getAltura());
            }
        }
        return sr;
    }

    /**
     * Método que devuelve al jugador mas alto
     *
     * @return Un arreglo de 2 elementos que contiene el nombre y la edad del
     * jugador mas pesado
     */
    public String[] peso() {
        String[] sr = new String[2];
        double peso = 0;
        for (DatosJugadores e : this.lista) {
            if (e.getPeso() > peso) {
                peso = e.getPeso();
                sr[0] = e.getNombre();
                sr[1] = String.valueOf(e.getPeso());
            }
        }
        return sr;
    }

    /**
     * Metodo para limpiar los datos ingresados en la lista
     */
    public void limpiar() {
        this.lista.clear();
    }
}
