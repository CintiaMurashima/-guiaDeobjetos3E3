package com.company;

public class Rectangulo extends Cuadrado{


    private double largo;

    public Rectangulo( double alto, double largo) {
       super(alto);
       this.largo= largo;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public double CalcularArea(){
        return this.largo * super.getAlto();
    }

    @Override
    public double CalcularPerimetro(){
        return this.largo*2 + super.getAlto()*2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "alto=" + super.getAlto() +
                ", largo=" + largo +
                '}';
    }
}
