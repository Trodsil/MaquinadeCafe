package clases;

import clases.otros.Cafe;
import clases.otros.MaquinaCafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    MaquinaCafe maquinacafe = new MaquinaCafe("1597526B", new ArrayList<Cafe>(List.of(
            new Cafe("Café Moka",10,10,10),
            new Cafe("Capuchino",15,10,20),
            new Cafe("Café Latte",10,20,10),
            new Cafe("Café Largo",30,0,20)
    )),50,300,300,300,300);


    public Controller() {
    }
    boolean boleano=true;
    while(boolean){
        Scanner opcion_opcion=new Scanner(System.in);
        int opcion=opcion_opcion.nextInt();
        System.out.println("Bienvenido a la máquina de café\n" +
                "===============================\n" +
                "Escoja una opción: \n"+
                "1.Pedir café\n" +
                "2.Rellenar máquina\n" +
                "3.Crear nuevo café"
        );
        switch (opcion){
            case 1:
                maquinacafe.pedirCafe();
            case 2:
            case 3:
            default:
                System.out.println("Valor no válido");
        }
    }
}
