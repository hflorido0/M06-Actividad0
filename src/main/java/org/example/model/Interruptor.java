package org.example.model;

public class Interruptor {

    private Bombilla bombilla;

    public Interruptor() {
        this.bombilla = new Bombilla();
    }

    public Bombilla getBombilla() {
        return bombilla;
    }

    public void setBombilla(Bombilla bombilla) {
        this.bombilla = bombilla;
    }
}
