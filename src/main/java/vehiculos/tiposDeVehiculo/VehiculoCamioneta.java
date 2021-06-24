package vehiculos.tiposDeVehiculo;

import vehiculos.interfaces.Camioneta;

/**
 *
 * @author pabloluis
 */
public class VehiculoCamioneta extends Vehiculo implements Camioneta {

    public VehiculoCamioneta() {
        super("Gasolina", 18, 60, 100, 10.75);
    }

    @Override
    public void iniciarMarcha() {
        System.out.println("El vehículo camioneta a iniciado la marcha a: "+aceleracionBase);
    }

    @Override
    public void transportarPersonas() {
        System.out.println("El vehículo puede trasnporta personas con una capacidad maxima de: "+cantPasajeros);
    }

    @Override
    public void girarDerecha() {
        System.out.println("La camioneta gira a la derecha");
    }

    @Override
    public void girarIzquierda() {
        System.out.println("La camioneta fira a la izquierda");
    }
    
    
    
    
}
