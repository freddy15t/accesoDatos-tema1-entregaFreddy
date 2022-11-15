package main.clase.ordenadores;

public class Sobremesa extends Ordenadores {
    // Atributos
    protected String sTipo;

    // Constructores
    public Sobremesa(int iCodigo, int iRam, String sCPU, double dPrecio, String sTipo) {
        super(iCodigo, iRam, sCPU, dPrecio);
        this.sTipo = sTipo;
    }

    // Getters and Setters
    public String getsTipo() {
        return sTipo;
    }

    public void setsTipo(String sTipo) {
        this.sTipo = sTipo;
    }

    // Metodos
    public void getCaracteristica() {
        super.getCaracteristica();
        System.out.println("Tipo: " + this.sTipo );

    }

    @Override
    public String toString() {
        return "Sobremesa=> Tipo=" + sTipo ;
    }

}