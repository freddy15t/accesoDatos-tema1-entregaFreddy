package main.clase.punto;
public class Suceso extends Punto3D {

    // Atributos
    protected double dTiempo;
    protected String sDescripcion;

    public Suceso(int iX, int iY, int z, double dTiempo, String sDescripcion) {
        super(iX, iY, z);
        this.dTiempo = dTiempo;
        this.sDescripcion = sDescripcion;
    }

    public boolean equals(Suceso s) {
        return this.iX == s.iX;
    }
}