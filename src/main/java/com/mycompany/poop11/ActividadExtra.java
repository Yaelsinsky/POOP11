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
import java.util.StringTokenizer;
/**
 *
 * @author Urbano Meza Joseph Gael
 * @author Camarena Arevalo Yael Eduardo 
 * @author Galindo Mayar Johann Zair
 */
/**
 * Definimos la clase ActividadExtra
 */
public class ActividadExtra {

    
    public static void main(String[] args) {
        // Creación de objetos Alumno originales
        Alumno[] alumnosOriginales = new Alumno[5];
        alumnosOriginales[0] = new Alumno("Rodrigo", "Sanchez", 20, "123456", 9.9, "Copilco 300 Coyoacan");
        // ... (se crean cuatro objetos Alumno más)

        // Escritura en el archivo
        try (PrintWriter impresoraDeArchivos = new PrintWriter(new BufferedWriter(new FileWriter("alumnos.csv")))) {
            // Iteramos sobre los alumnos originales y escribe sus detalles en el archivo CSV
            for (Alumno alumno : alumnosOriginales) {
                impresoraDeArchivos.println(alumno);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Creación de objetos Alumno a partir de la lectura del archivo
        Alumno[] alumnosNuevos = new Alumno[5];
        try (BufferedReader br = new BufferedReader(new FileReader("alumnos.csv"))) {
            // Lee cada línea del archivo CSV, tokeniza los valores y crea objetos Alumno
            String linea;
            int indice = 0;
            while ((linea = br.readLine()) != null && indice < 5) {
                StringTokenizer tokenizador = new StringTokenizer(linea, ",");
                if (tokenizador.countTokens() == 7) {
                    // Crea un nuevo objeto Alumno a partir de los valores tokenizados
                    alumnosNuevos[indice] = new Alumno(
                        tokenizador.nextToken(),
                        tokenizador.nextToken(),
                        Integer.parseInt(tokenizador.nextToken()),
                        tokenizador.nextToken(),
                        Double.parseDouble(tokenizador.nextToken()),
                        tokenizador.nextToken()
                    );
                    indice++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        
        for (int i = 0; i < alumnosNuevos.length; i++) {
            if (alumnosNuevos[i] != null) {
                System.out.println("Alumno " + (i + 6) + ": " + alumnosNuevos[i]);
            }
        }
    }
}


