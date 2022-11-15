package main.clase.parking;
import java.time.LocalDateTime;

public class ParkingVehiculo implements Parking {
    // constantes
    protected static double dPrecioPorMin = 0.0425;
    protected static int iPlazasMax = 100;

    // atributos
    protected String sDireccion;
    protected int iPlazasActualesOcupadas;

    // Constructor
    public ParkingVehiculo(String sDireccion) {
        this.sDireccion = sDireccion;

    }


    @Override
    public boolean hayPlaza() throws Exception {
        return iPlazasActualesOcupadas < iPlazasMax ?
         true:false;
    }


    
    @Override
    public void aparcaCoche(Vehiculo coche) throws Exception {
        if (hayPlaza()) {
            iPlazasActualesOcupadas++;
            coche.setFechaIni(LocalDateTime.now());
        } else {
            throw new Exception("No hay plazas libres");
        }

    }

    @Override
    public void sacaCoche(Vehiculo coche) throws Exception {
        if (coche.getFechaIni() != null) {
            iPlazasActualesOcupadas--;
            coche.setFechaFin(LocalDateTime.now());
        } else {
            throw new Exception("Ningún coche   ha sido aparcado");

        }

    }

    @Override
    public double getFactura(Vehiculo coche) throws Exception {
       double factura = 0.0;
        if (dPrecioPorMin !=0) {
            factura= dPrecioPorMin;
        }
        return factura;
    }


    @Override
    public String toString() {
        return "ParkingVehiculo [direccion=" + sDireccion + ", plazasActualesOcupadas=" + iPlazasActualesOcupadas + "]";
    }

    




}