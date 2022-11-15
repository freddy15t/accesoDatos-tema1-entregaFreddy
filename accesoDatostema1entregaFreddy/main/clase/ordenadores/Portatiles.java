package main.clase.ordenadores;
public class Portatiles extends Ordenadores {
    // Atributos
    protected double dPeso;

    // Constructores
    public Portatiles(int iCodigo, int iRam, String sCPU, double dPrecio, double dPeso) {
        super(iCodigo, iRam, sCPU, dPrecio);
        this.dPeso = dPeso;
    }

    // Getters and Setters
    public double getPeso() {
        return dPeso;
    }

    public void setPeso(double peso) {
        this.dPeso = peso;
    }

    // Metodos
    public void getCaracteristica() {
        super.getCaracteristica();
        System.out.println("Peso: " + this.dPeso );

    }

    @Override
    public String toString() {
        return "Portatiles=> Peso=" + dPeso ;
    }

   

}
