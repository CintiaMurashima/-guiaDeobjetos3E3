package com.company;

public abstract class Figura {

    protected String color = "Azul";

    public Figura() {
    }

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double CalcularArea();
    public abstract double CalcularPerimetro();

    @Override
    public String toString() {
        return "Figura{" +
                "color='" + color + '\'' +
                '}';
    }
}
