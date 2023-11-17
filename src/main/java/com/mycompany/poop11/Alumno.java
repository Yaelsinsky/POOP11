package com.mycompany.poop11;
// Importamos las clases necesarias para trabajar con archivos y entrada/salida
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Definimos la clase alumno
 */
class Alumno {
    // Atributos de la clase Alumno
    String nombre;
    String apellido;
    int edad;
    String matricula;
    double calificacion;
    String direccion;

    /**
     * Constructor de la clase Alumno que inicializa los atributos con los valores proporcionados.
     * @param nombre El nombre del alumno.
     * @param apellido El apellido del alumno.
     * @param edad La edad del alumno.
     * @param matricula La matrícula del alumno.
     * @param calificacion La calificación del alumno.
     * @param direccion La dirección del alumno.
     */
    public Alumno(String nombre, String apellido, int edad, String matricula, double calificacion, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.matricula = matricula;
        this.calificacion = calificacion;
        this.direccion = direccion;
    }

    /**
     * Sobrescribe el método toString para proporcionar una representación de cadena de un objeto Alumno.
     * @return Una cadena que representa el objeto Alumno en formato de atributos separados por comas.
     */
    @Override
    public String toString() {
        return nombre + "," + apellido + "," + edad + "," + matricula + "," + calificacion + "," + direccion;
    }
}

