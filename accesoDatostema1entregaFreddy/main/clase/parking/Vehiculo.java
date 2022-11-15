package main.clase.parking;

import java.time.LocalDateTime;

public class Vehiculo {
    // atributos
    protected String matricula;
    protected LocalDateTime fechaIni;
    protected LocalDateTime fechaFin;

    //  Constructor
    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    // constructor
    public Vehiculo(String matricula, LocalDateTime fechaIni, LocalDateTime fechaFin) {
        this.matricula = matricula;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
    }

    // Getters and Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDateTime getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(LocalDateTime fechaIni) {
        this.fechaIni = fechaIni;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        return "Vehiculo [Mátricula=" + matricula + ", FechaIni=" + fechaIni + ", FechaFin=" + fechaFin + "]";
        
    }

    

   
}