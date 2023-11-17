// Importamos las clases necesarias para trabajar con archivos y entrada/salida
package com.mycompany.poop11;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.*;
/**
 *
 * @author Urbano Meza Joseph Gael
 * @author Camarena Arevalo Yael Eduardo 
 * @author Galindo Mayar Johann Zair
 */

// Definimos nuestra clase principal
public class POOP11 {

    // Método principal
    public static void main(String[] args) {
        // Imprime un encabezado en la consola
        System.out.println("##########File##########");

        // Crea un objeto File para representar un archivo llamado "archivo.txt"
        File archivo = new File("archivo.txt");

        // Verifica si el archivo ya existe
        System.out.println("Archivo existe: " + archivo.exists());

        // Si el archivo no existe, intenta crearlo
        if (!archivo.exists()) {
            try {
                // Intenta crear el archivo y muestra el mensaje de se creo un archivo
                boolean seCreo = archivo.createNewFile();
                System.out.println("Se creó un archivo " + seCreo);
                System.out.println("Archivo existe" + archivo.exists());
            } catch (IOException ex) {
                // Uso de excepciones en caso de error durante la creación del archivo
                System.out.println(ex.getMessage());
            }
        }

        //Damos un encabezado para la sección de FileWriter
        System.out.println("##########FileWriter##########");

        try {
            // Crea un BufferedReader para leer la entrada del usuario desde la consola
            System.out.println("##### Lectura desde teclado #####");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Escriba el texto para el archivo");
            String texto = br.readLine(); // Lee la línea de texto ingresada por el usuario
            System.out.println("El usuario escribió: " + texto);

            // Sección de escritura en el archivo
            System.out.println("#### Escritura del archivo ####");

            // Crea un FileWriter para escribir en el archivo
            FileWriter fw = new FileWriter("archivo.txt");

            // Crea un BufferedWriter para mejorar el rendimiento de escritura
            BufferedWriter bw = new BufferedWriter(fw);

            // Crea un PrintWriter para escribir texto en el archivo
            PrintWriter impresoraDeArchivos = new PrintWriter(bw);

            // Escribe el texto en el archivo
            impresoraDeArchivos.println(texto);

            // Cierra la impresora de archivos
            impresoraDeArchivos.close();

            // Sección de lectura desde el archivo
            System.out.println("###### Lectura del archivo ######");

            // Crea un FileReader para leer el contenido del archivo
            FileReader fr = new FileReader("archivo.txt");

            // Crea un BufferedReader para mejorar el rendimiento de lectura
            br = new BufferedReader(fr);

            // Imprime el contenido del archivo línea por línea
            System.out.println("El texto del archivo es:");
            String linea = br.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }

            // Cierra el BufferedReader
            br.close();

        } catch (IOException ex) {
            // Uso de excepciones en caso de error durante la lectura o escritura de archivos
            System.out.println(ex.getMessage());
        }
    }
}

