package com.samples;

import java.math.BigDecimal;

public class Calculette {
    private BigDecimal value;

    public Calculette(BigDecimal def) {
        value = def;
    }

    public void add(BigDecimal toAdd) {
        this.value = this.value.add(toAdd);
    }

    public void sub(BigDecimal value) {
        this.value = this.value.subtract(value);
    }

    public BigDecimal getValue() {
        return this.value;
    }
}
