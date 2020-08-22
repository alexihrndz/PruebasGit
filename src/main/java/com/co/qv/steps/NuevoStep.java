package com.co.qv.steps;

import net.thucydides.core.annotations.Step;
import org.joda.time.Instant;

public class NuevoStep {

    @Step
    public static void nuevoMetodo() {
        Instant hora = Instant.now();
        System.out.println(hora.toString().substring(1, 10));
    }

    @Step
    public void otherMethod() {
        System.out.println("Hola Git");
    }

    @Step
    public void otherMethod80() {
        String a = "nueva cadena100009999";
        String b = a.replace("nueva", "new");
        System.out.println(b+"Otra cosa777");
    }

    @Step
    public void otraPrueba() {

    }

    public void unMetodo() {

    }
}
