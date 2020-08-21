package com.co.qv.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;

import java.util.List;

@DefaultUrl("http://www.google.com")
public class PruebasPage extends PageObject {

    @FindBy(name = "q")
    WebElementFacade cuadroTexto;
    @FindBy(name = "btnK")
    WebElementFacade btnBuscar;
    @FindBy(xpath = "//h3[contains(text(), 'JAVA')]")
    List<WebElementFacade> listaResultados;

    public void ingresarTexto(String texto) {
        cuadroTexto.sendKeys(texto);
    }

    public void buscarTexto() {
        btnBuscar.click();
    }

    public void veListado() {
        Assert.assertTrue(listaResultados.size() > 0);
    }
}
