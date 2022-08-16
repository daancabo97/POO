/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author ASUS
 */
public class Motor {

    String modelo;
    int caballos;
    double potencia;
    int resistencia;
    int numCilindros;

    public Motor() {

    }

    public Motor(String modelo, int caballos, double potencia, int resistencia, int numCilindros) {
        this.modelo = modelo;
        this.caballos = caballos;
        this.potencia = potencia;
        this.resistencia = resistencia;
        this.numCilindros = numCilindros;
    }
    
    
}
