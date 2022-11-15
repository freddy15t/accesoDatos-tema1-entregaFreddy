package main.clase.ordenadores;
public class Ordenadores {

    // Atributos
    protected int iCodigo;
    protected int iRam;
    protected String sCPU;
    protected double dPrecio;


    // Constructor
    public Ordenadores(int iCodigo, int iRam, String sCPU, double dPrecio) {
        this.iCodigo = iCodigo;
        this.iRam = iRam;
        this.sCPU = sCPU;
        this.dPrecio = dPrecio;
    }


    // Getters and Setters
    public int getiCodigo() {
        return iCodigo;
    }

     public void setiCodigo(int iCodigo) {
        this.iCodigo = iCodigo;
    }



    public int getiRam() {
        return iRam;
    }


    public void setiRam(int iRam) {
        this.iRam = iRam;
    }




    public String getsCPU() {
        return sCPU;
    }

    public void setsCPU(String sCPU) {
        this.sCPU = sCPU;
    }



    public double getdPrecio() {
        return dPrecio;
    }

     public void setdPrecio(double dPrecio) {
        this.dPrecio = dPrecio;
    }


    // Metodo getCaracteristicas
    public void getCaracteristica() {
        System.out.println("Características: " + "Código:" + this.iCodigo  + "  RAM:"+ this.iRam + "  CPU:"+ this.sCPU + "  Precio:"+ this.dPrecio);
    }


   

    
   

}