package com.co.qv.steps;

import com.co.qv.pages.PruebasPage;
import net.thucydides.core.annotations.Step;

public class PruebasSteps {

    PruebasPage pruebasPage;
    NuevoStep nuevoStep;

    @Step
    public void buscarTexto(){
        pruebasPage.ingresarTexto("JAVA");
        pruebasPage.buscarTexto();
        nuevoStep.nuevoMetodo();
    }

    @Step
    public void puedoVerTextoEnLaLista() {
        pruebasPage.veListado();
    }
}
