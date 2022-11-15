package main.clase.punto;
public class Punto3D extends Punto {
    // atributos
    protected int iZ;

    // Constructor
    public Punto3D(int iX, int iY, int z) {
        super(iX, iY);
        this.iZ = z;
    }

    public double distancia(Punto3D punto3D) {
        int distancia = (this.iX - punto3D.iX) + (this.iY - punto3D.iY) + (this.iZ - punto3D.iZ);
        double r = Math.sqrt(distancia);
        return r;
    }

    public boolean equals(Punto3D p3D) {
        return this.iX == p3D.iX ;
    }

}