package com.company;

public class Cuadrado extends Figura {

    private double alto;

    public Cuadrado(double alto) {
        this.alto = alto;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public double CalcularArea(){
        return this.alto * this.alto;
    }

    @Override
    public double CalcularPerimetro(){
        return this.alto*4;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "alto=" + alto +
                '}';
    }
}
