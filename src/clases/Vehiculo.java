package clases;

public class Vehiculo {

    // 1. Atributos
    protected String modelo;
    protected String marca;
    protected String color;
    private int año;
    protected int cilindros;
    protected String carroceria;
    Motor motor;
    protected int velocidad;
    
    // 2. Constructores
    public Vehiculo(){
    
    }
    
    public Vehiculo(String modelo, String marca, String color, int año, int cilindros, String carroceria, Motor motor) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.año = año;
        this.cilindros = cilindros;
        this.carroceria = carroceria;
        this.velocidad = 0;
        this.motor = motor;
    }

    
    // 3. Metodos (Comportamiento)
    public void acelerar(int cantidadMaxima){
        this.velocidad += cantidadMaxima;
    
    }

    // 4. getter y setter
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", a\u00f1o=" + año + ", cilindros=" + cilindros + ", carroceria=" + carroceria + ", motor=" + motor + ", velocidad=" + velocidad + '}';
    }


        
    
    
    
}
