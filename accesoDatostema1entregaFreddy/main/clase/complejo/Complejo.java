package main.clase.complejo;

public class Complejo {
    // Atributos
    Double dPReal;
    Double dPImag;

   // Constructor
    public Complejo(Double dPReal, Double dPImag) {
        this.dPReal = dPReal;
        this.dPImag = dPImag;
    }

    

    // Getters and Setters
        public Double getdPReal() {
        return dPReal;
    }

    public void setdPReal(Double dPReal) {
        this.dPReal = dPReal;
    }



    
    public Double getdPImag() {
        return dPImag;
    }

    public void setdPImag(Double dPImag) {
        this.dPImag = dPImag;
    }





    // Metodos
    public void asignar(double x, double y) {
        this.dPReal = x;
        this.dPImag = y;

    }

    public Complejo sumar(Complejo c1, Complejo c2) {
        double dSumaReal;
        double dSumaImag;

        dSumaReal = this.dPReal + c1.dPReal;
        dSumaImag = this.dPImag + c1.dPImag;
        Complejo total = new Complejo(dSumaReal, dPImag);
        return total;
    }


    public void imprimir() {
        System.out.println(" Parte real: " + dPReal.toString() + "  Parte imaginaria: " + dPImag.toString());
    }

    @Override
    public String toString() {
        return "Complejo: Parte real=" + dPReal + " y parte imaginaria=" + dPImag ;

    }
    
}

