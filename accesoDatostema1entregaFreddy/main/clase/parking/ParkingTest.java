package main.clase.parking;
public class ParkingTest {
    public static void main(String[] args) {
        System.out.println("Inicio ParkingTest");
        try{
            Vehiculo coche1 = new Vehiculo("1234LZP");
            ParkingVehiculo parkingCortes = new ParkingVehiculo("Cortes 1 Madrid");
            parkingCortes.aparcaCoche(coche1);
            //Espero 2 minutos
            parkingCortes.sacaCoche(coche1);
            double dFactura=parkingCortes.getFactura(coche1);
            System.out.println(coche1+"; Factura="+dFactura);

        }catch(Exception e){
            e.printStackTrace();

        }

        try{
            Vehiculo coche1 = new Vehiculo("6496PJH");
            ParkingVehiculo parkingCortes = new ParkingVehiculo("Cortes 2 Madrid");
            parkingCortes.aparcaCoche(coche1);
            //Espero 2 minutos
            parkingCortes.sacaCoche(coche1);
            double dFactura=parkingCortes.getFactura(coche1);
            System.out.println(coche1+"; Factura="+dFactura);

        }catch(Exception e){
            e.printStackTrace();
        }


        try{
            Vehiculo coche1 = new Vehiculo("7695LOP");
            ParkingVehiculo parkingCortes = new ParkingVehiculo("Cortes 3 Madrid");
            parkingCortes.aparcaCoche(coche1);
            //Espero 2 minutos
            parkingCortes.sacaCoche(coche1);
            double dFactura=parkingCortes.getFactura(coche1);
            System.out.println(coche1+"; Factura="+dFactura);

        }catch(Exception e){
            e.printStackTrace();


        }


        try{
            Vehiculo coche1 = new Vehiculo("8603PAL");
            ParkingVehiculo parkingCortes = new ParkingVehiculo("Cortes 4 Madrid");
            parkingCortes.aparcaCoche(coche1);
            //Espero 2 minutos
            parkingCortes.sacaCoche(coche1);
            double dFactura=parkingCortes.getFactura(coche1);
            System.out.println(coche1+"; Factura="+dFactura);

        }catch(Exception e){
            e.printStackTrace();
        }


        try{
            Vehiculo coche1 = new Vehiculo("6936CHY");
            ParkingVehiculo parkingCortes = new ParkingVehiculo("Cortes 5 Madrid");
            parkingCortes.aparcaCoche(coche1);
            //Espero 2 minutos
            parkingCortes.sacaCoche(coche1);
            double dFactura=parkingCortes.getFactura(coche1);
            System.out.println(coche1+"; Factura="+dFactura);

        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
