package org.example.controller;

import org.example.model.Interruptor;

import java.util.Scanner;

public class Circuito {
    private Interruptor interruptor1;
    private Interruptor interruptor2;

    public void init() {
        this.interruptor1 = new Interruptor();
        this.interruptor2 = new Interruptor();
         menu();
    }

    private void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1- Acciona interruptor 1\n2- Acciona interruptor 2\n0- Salir");
        int valor = scanner.nextInt();
        switch (valor) {
            case 0:
                System.exit(0);
            case 1:
                this.interruptor1.getBombilla().toggleBombilla();
                System.out.println(this.interruptor1.getBombilla().toString());
            case 2:
                this.interruptor2.getBombilla().toggleBombilla();
                System.out.println(this.interruptor2.getBombilla().toString());
            default:
                System.out.println("ERROR");
        }
    }
}
