/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Olman
 */
public class Pais {
    
    private String nombre;
    private Double puntos;

    public Pais() {
    }

    public Pais(String nombre, Double puntos) {
        this.nombre = nombre;
        this.puntos = puntos;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPuntos() {
        return puntos;
    }

    public void setPuntos(Double puntos) {
        this.puntos = puntos;
    }
    
    
    
}
