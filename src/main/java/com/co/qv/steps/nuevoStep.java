package com.co.qv.steps;

import net.thucydides.core.annotations.Step;

public class nuevoStep {
    //nuevosCambios2

    @Step
    public void nuevoMetodo() {
        System.out.println("Pruebas pull y merge");
        System.out.println("Otro cambio para testear el merge");
        System.out.println("Otro cambio para testear el merge");
        System.out.println("Nueva linea");

    }
    @Step
    public void otherMethod(){
        System.out.println(getClass().toString());
    }

    @Step
    public void otraPrueba(){
        System.out.println("Otra prueba");
    }
}
