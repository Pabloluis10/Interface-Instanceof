package vehiculos.tiposDeVehiculo;
/**
 *
 * @author pabloluis
 */
public abstract class Vehiculo {
    
    protected String tipoCombustible;
    protected int cantGalonesCombustibel;
    protected int cantPasajeros;
    protected int velocidadMaxima;
    protected double aceleracionBase;

    public Vehiculo(String tipoCombustible, int cantGalonesCombustibel, int cantPasajeros, int velocidadMaxima, double aceleracionBase) {
        this.tipoCombustible = tipoCombustible;
        this.cantGalonesCombustibel = cantGalonesCombustibel;
        this.cantPasajeros = cantPasajeros;
        this.velocidadMaxima = velocidadMaxima;
        this.aceleracionBase = aceleracionBase;
    }
    
    public abstract void iniciarMarcha();

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getCantGalonesCombustibel() {
        return cantGalonesCombustibel;
    }

    public void setCantGalonesCombustibel(int cantGalonesCombustibel) {
        this.cantGalonesCombustibel = cantGalonesCombustibel;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getAceleracionBase() {
        return aceleracionBase;
    }

    public void setAceleracionBase(double aceleracionBase) {
        this.aceleracionBase = aceleracionBase;
    }
    
    
}
