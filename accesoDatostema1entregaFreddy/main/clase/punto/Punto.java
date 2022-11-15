package main.clase.punto;

public class Punto {
    protected int iX;
    protected int iY;

    public Punto(int iX, int iY) {
        this.iX = iX;
        this.iY = iY;
    }

    public double distancia(Punto otroPunto) {
        int distancia = (this.iX - otroPunto.iX)*(this.iX - otroPunto.iX);
        double r = Math.sqrt(distancia);
        return r;
    }

   
    public boolean equals(Suceso s) {
        return this.iX == s.iX;
    }
}