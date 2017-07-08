package com.samples;

public class Calculette {
    private Double value;

    public Calculette(Double def) {
        value = def;
    }

    public void add(Double toAdd) {
        this.value += toAdd;
    }

    public void sub(Double value) {
        this.value -= value;
    }

    public Double getValue() {
        return this.value;
    }
}
