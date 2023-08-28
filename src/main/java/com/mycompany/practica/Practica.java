/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practica;
import java.util.Scanner; 

/**
 *
 * @author Alumno
 */
public class Practica {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Persona 1",25, "femenino");
        Persona persona2 = new Persona("Persona 2", 30, "femenino");
        Persona persona3 = new Persona("Persona 3", 28, "masculino");

        // Calcular y mostrar la edad promedio
        Persona[] personas = {persona1, persona2, persona3};
        double edadPromedio = Persona.calcularEdadPromedio(personas);
        System.out.println("Edad promedio: " + edadPromedio);
        
    }
}
