package clases;

import clases.Otros.Cafe;
import clases.Otros.MaquinaCafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controlador {
    MaquinaCafe maquina_cafe=new MaquinaCafe("123456789B",new ArrayList<>(List.of(
            new Cafe("Café Moka",10,10,10)
    )),100,100,80,70,120 );

    public Controlador() {
        menuInicio();
    }
    public void menuInicio(){

        boolean boleano=true;
        while (boleano){
            Scanner opcioninicio=new Scanner(System.in);
            System.out.println("Bienvenido a la máquina de café\n" +
                    "=====================\n"+
                    "1.Pedir Café\n" +
                    "2.Rellenar Máquina\n" +
                    "3.Crear Nuevo Café\n");
            switch (opcioninicio.nextInt()){
                case 2:
                    maquina_cafe.rellenarMaquinamenu();
                    break;
                case 0:
                    boleano=false;
                    break;
                default:
                    System.out.println("Valor no válido");
            }
        }
    }

}
