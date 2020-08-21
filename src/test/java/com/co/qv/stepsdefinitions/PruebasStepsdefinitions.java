package com.co.qv.stepsdefinitions;

import com.co.qv.pages.PruebasPage;
import com.co.qv.steps.PruebasSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PruebasStepsdefinitions {

    PruebasPage pruebasPage;

    @Steps
    PruebasSteps pruebasSteps;

    @Given("^que somos un equipo$")
    public void queSomosUnEquipo() {
        pruebasPage.open();
    }


    @When("^trabajemos en el mismo proyecto$")
    public void trabajemosEnElMismoProyecto() throws Exception {
        pruebasSteps.buscarTexto();
    }

    @Then("^podemos integrar los cambios$")
    public void podemosIntegrarLosCambios() {
        pruebasSteps.puedoVerTextoEnLaLista();
    }
}
