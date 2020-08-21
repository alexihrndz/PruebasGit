package com.co.qv.steps;

import net.thucydides.core.annotations.Step;

import java.sql.SQLException;

public class nuevoStep {

    @Step
    public void nuevoMetodo() {

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
