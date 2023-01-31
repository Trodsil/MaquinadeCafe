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
        maquina_cafe.menuInicio();
    }


}
