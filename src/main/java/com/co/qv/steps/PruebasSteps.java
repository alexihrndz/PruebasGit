package com.co.qv.steps;

import com.co.qv.pages.PruebasPage;
import net.thucydides.core.annotations.Step;

import static com.co.qv.steps.NuevoStep.nuevoMetodo;

public class PruebasSteps {

    PruebasPage pruebasPage;

    @Step
    public void buscarTexto(){
        pruebasPage.ingresarTexto("JAVA");
        pruebasPage.buscarTexto();
        nuevoMetodo();
    }

    @Step
    public void puedoVerTextoEnLaLista() {
        pruebasPage.veListado();
    }
}
