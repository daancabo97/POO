
package herencia;

import clases.Motor;
import clases.Vehiculo;


 
public class Motocicleta extends Vehiculo{
    
    String fuelInjection;

    public Motocicleta() {
    }

    public Motocicleta(String modelo, String marca, String color, int año, int cilindros, String carroceria, Motor motor) {
        super(modelo, marca, color, año, cilindros, carroceria, motor);
    }
    
}
