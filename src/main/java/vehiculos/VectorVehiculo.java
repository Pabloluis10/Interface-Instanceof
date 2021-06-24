package vehiculos;

import java.util.ArrayList;
import java.util.Random;
import vehiculos.tiposDeVehiculo.Vehiculo;
import vehiculos.tiposDeVehiculo.VehiculoCamioneta;
import vehiculos.tiposDeVehiculo.VehiculoCarga;
import vehiculos.tiposDeVehiculo.VehiculoCarrera;

/**
 *
 * @author pabloluis
 */
public class VectorVehiculo {
    
    public ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private Random rd = new Random();
    
    public void generarVehiculos(){
        for(int i=0; i<20; i++) {
            int tipo = rd.nextInt(3);
            if (tipo == 0) {
                vehiculos.add(new VehiculoCamioneta());
            } else  if (tipo == 1){
                vehiculos.add(new VehiculoCarga());
            } else {
                vehiculos.add(new VehiculoCarrera());
            }
        }
    }
    
    public void determinarTipo(){
        for(int i=0; i<vehiculos.size(); i++){
            System.out.println("\nVehículo "+(i+1)+": ");
            definirTipo(vehiculos.get(i));
        }
    }
    
    public void definirTipo(Vehiculo vehiculo){    
        if(vehiculo instanceof VehiculoCamioneta) {
            System.out.println("Este vehículo es de tipo camioneta, sirver para transportar personas");
        } else if (vehiculo instanceof VehiculoCarga) {
            System.out.println("Este vehículo es de tipo carga, puede llevar materiales y cargar mucho peso");
        } else {
            System.out.println("Este vheículo puede realizar carreras, ya que es de tipo carrera");
        }
        
    }
}
