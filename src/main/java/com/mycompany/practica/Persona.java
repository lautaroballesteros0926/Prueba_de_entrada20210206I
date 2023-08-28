/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica;

/**
 *
 * @author Alumno
 */
public class Persona {
    private String nombre;
    private int edad; 
    private String genero;
    
    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    
    public static double calcularEdadPromedio(Persona[] personas) {
        int totalEdades = 0;
        for (Persona persona : personas) {
            totalEdades += persona.getedad();
        }
        return (double) totalEdades / personas.length;
    }
    public int getedad(){
        return edad;
    }
    public void setedad(int edad){
        this.edad=edad;
    }
    public String getnombre(){
        return nombre;
    }
    public void Setnombre(String nombre){
        this.nombre=nombre;
    }
}
