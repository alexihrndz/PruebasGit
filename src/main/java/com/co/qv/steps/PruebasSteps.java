package com.co.qv.steps;

import com.co.qv.pages.PruebasPage;
import net.thucydides.core.annotations.Step;

public class PruebasSteps {

    PruebasPage pruebasPage;

    @Step
    public void buscarTexto(){
        pruebasPage.ingresarTexto("JAVA");
        pruebasPage.buscarTexto();
    }

    @Step
    public void puedoVerTextoEnLaLista() {
        pruebasPage.veListado();
    }
}
