package com.example.myapp;

public class Pregunta {

    private String my_texto;
    private String val;

    public Pregunta() {
    }

    public Pregunta(String my_texto, String val) {
        this.my_texto = my_texto;
        this.val = val;

    }

    public String getMy_texto() {
        return my_texto;
    }

    public void setMy_texto(String my_texto) {
        this.my_texto = my_texto;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
}
