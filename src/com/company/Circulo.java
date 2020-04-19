package com.company;

public class Circulo extends Figura{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double CalcularArea(){
        return 3.14 * Math.pow(this.radio,2);
    }

    @Override
    public double CalcularPerimetro(){
        return this.radio*2 * 3.14;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
