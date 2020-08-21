package com.co.qv.steps;

import net.thucydides.core.annotations.Step;

import java.sql.SQLException;

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
    public void otherMethod80(){
        String a = "nueva cadena";
        String b = a.replace("nueva", "new");
        System.out.println(b);
    }

    @Step
    public void otraPrueba(){
        System.out.println("Cambio en otro método");
    }

    public void unMetodo(){
        System.out.println("Cambio en otro método");
    }
}
