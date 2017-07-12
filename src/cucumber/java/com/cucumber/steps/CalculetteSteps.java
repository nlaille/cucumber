package com.cucumber.steps;

import com.samples.Calculette;
import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Etantdonné;
import cucumber.api.java.fr.Lorsque;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class CalculetteSteps {

    private Calculette calculette = null;

    @Etantdonné("^une calculette a une valeur de (.+)$")
    public void une_calculette_a_une_valeur_de(BigDecimal value) throws Throwable {
        calculette = new Calculette(value);
    }

    @Lorsque("^j'ajoute (.+)$")
    public void j_ajoute(BigDecimal value) throws Throwable {
        calculette.add(value);
    }

    @Lorsque("^que j'ajoute (.+)$")
    public void que_j_ajoute(BigDecimal value) throws Throwable {
        j_ajoute(value);
    }

    @Lorsque("^je soustrais (.+)$")
    public void je_soustrais(BigDecimal value) throws Throwable {
        calculette.sub(value);
    }

    @Lorsque("^que je soustrais (.+)$")
    public void que_je_soustrais(BigDecimal value) throws Throwable {
        je_soustrais(value);
    }

    @Alors("^j'obtiens le résultat de (.+)$")
    public void j_obtiens_le_résultat_de(BigDecimal expected) throws Throwable {
        assertEquals(expected, calculette.getValue());
    }
}
