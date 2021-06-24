package vehiculos.tiposDeVehiculo;

import vehiculos.interfaces.Carga;

/**
 *
 * @author pabloluis
 */
public class VehiculoCarga extends Vehiculo implements Carga {

    public VehiculoCarga() {
        super("Disel", 18, 3, 75, 2.5);
    }
    
    

    @Override
    public void iniciarMarcha() {
        System.out.println("El vehiculo tipo carga a iniciado la marcha acelerando a: "+this.aceleracionBase);
    }

    @Override
    public void transportarMaterial() {
        System.out.println("El vehicula transporta materiales ya que es de carga");
    }

    @Override
    public void girarDerecha() {
        System.out.println("Vehículo de carga girando a la derecha");
    }

    @Override
    public void girarIzquierda() {
        System.out.println("Vehículo de carga girando a la izquierda");
    }
}
