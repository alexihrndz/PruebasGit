package com.co.qv.steps;

import net.thucydides.core.annotations.Step;

public class nuevoStep {

    @Step
    public void nuevoMetodo() {
        System.out.println("Pruebas pull y merge");
        System.out.println("Nueva linea");

    }
    @Step
    public void otherMethod(){
        System.out.println(getClass().toString());
    }

    @Step
    public void otraPrueba(){
        System.out.println("Cambio en otro método");
    }

    public void unMetodo(){
        System.out.println("Cambio en otro método");
    }
}
