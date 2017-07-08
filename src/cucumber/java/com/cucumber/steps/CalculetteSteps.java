package com.cucumber.steps;

import com.samples.Calculette;
import cucumber.api.java.fr.Alors;
import cucumber.api.java.fr.Etantdonné;
import cucumber.api.java.fr.Lorsque;

import static org.junit.Assert.assertEquals;

public class CalculetteSteps {

    private Calculette calculette = null;

    @Etantdonné("^une calculette a une valeur de (-?\\d+.\\d+)$")
    public void une_calculette_a_une_valeur_de(Double value) throws Throwable {
        calculette = new Calculette(value);
    }

    @Lorsque("^j'ajoute (-?\\d+.\\d+)$")
    public void j_ajoute(Double value) throws Throwable {
        calculette.add(value);
    }

    @Lorsque("^que j'ajoute (-?\\d+.\\d+)$")
    public void que_j_ajoute(Double value) throws Throwable {
        j_ajoute(value);
    }

    @Lorsque("^je soustrais (-?\\d+.\\d+)$")
    public void je_soustrais(Double value) throws Throwable {
        calculette.sub(value);
    }

    @Lorsque("^que je soustrais (-?\\d+.\\d+)$")
    public void que_je_soustrais(Double value) throws Throwable {
        je_soustrais(value);
    }

    @Alors("^j'obtiens le résultat de (-?\\d+.\\d+)$")
    public void j_obtiens_le_résultat_de(Double expected) throws Throwable {
        assertEquals(expected, calculette.getValue());
    }
}
