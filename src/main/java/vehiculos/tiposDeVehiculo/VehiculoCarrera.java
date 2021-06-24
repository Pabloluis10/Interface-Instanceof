package vehiculos.tiposDeVehiculo;

import vehiculos.interfaces.Carrera;

/**
 *
 * @author pabloluis
 */
public class VehiculoCarrera extends Vehiculo implements Carrera {

    public VehiculoCarrera() {
        super("Octano", 12, 2, 350, 20.5);
    }

    @Override
    public void iniciarMarcha() {
        System.out.println("Ya que es un vehículo de carrera aplica turbo");
        System.out.println("Inicia la marcha con una acelereacón triplicada");
        System.out.println("que es: "+aplicarTurbo());
    }

    @Override
    public double aplicarTurbo() {
        double aceleracionTotal;
        aceleracionTotal = 3*aceleracionBase;
        return aceleracionTotal;
    }

    @Override
    public void girarDerecha() {
        System.out.println("Vehículo de carrera girando a la derecha");
    }

    @Override
    public void girarIzquierda() {
        System.out.println("Vehículo de carrera girando a la izquierda");
    }
    
    
}
