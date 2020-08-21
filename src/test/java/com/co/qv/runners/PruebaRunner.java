package com.co.qv.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/pruebas.feature",
        glue = "com.co.qv.stepsdefinitions",
        snippets = SnippetType.CAMELCASE,
        tags = "")
public class PruebaRunner {


}
