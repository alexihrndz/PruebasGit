package com.co.qv.steps;

import net.thucydides.core.annotations.Step;

import java.time.Instant;

public class NuevoStep {

    @Step
    public static void nuevoMetodo() {
        Instant hora = Instant.now();
        System.out.println(hora);
    }
    @Step
    public void otherMethod(){

    }

    @Step
    public void otherMethod80(){
        String a = "nueva cadena";
        String b = a.replace("nueva", "new");
        System.out.println(b);
    }

    @Step
    public void otraPrueba(){

    }

    public void unMetodo(){

    }
}
