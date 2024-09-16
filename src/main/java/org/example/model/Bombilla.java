package org.example.model;

public class Bombilla {
    private boolean encendido;

    public Bombilla () {
        this.encendido = false;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void toggleBombilla() {
        this.encendido = !this.encendido;
    }

    @Override
    public String toString() {
        return "La bombilla está " + (this.encendido ? "encendida" : "apagada");
    }
}
