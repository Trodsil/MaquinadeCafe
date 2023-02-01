package clases;

import clases.Otros.Cafe;
import clases.Otros.MaquinaCafe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Controlador {
    private MaquinaCafe maquina_cafe;
    public Controlador() {
        this.maquina_cafe=new MaquinaCafe("123456789B",new ArrayList<>(List.of(
                new Cafe("Café Moka",10,10,10)
        )),100,100,80,70,120 );
        this.menuInicio();
    }
    public void menuInicio(){
        System.out.println("Bienvenido al menú de inicio\n" +
                "============================\n" +
                "1:Pedir café\n" +
                "2:Rellenar máquina\n" +
                "3:Crear café\n" +
                "0:Cerrar\n" +
                "============================\n");
        Integer opcion=null;
        while (opcion==null){

            while (opcion==null){
                Scanner valor_opcion=new Scanner(System.in);
                try{
                    opcion=valor_opcion.nextInt();
                }catch (Exception err){
                    System.out.println("Prueba con otro valor");
                    opcion=null;
                }
            }


            switch (opcion){
                case 0:
                    break;
                case 1:
                    this.maquina_cafe.pedirCafe();
                    menuInicio();
                    break;
                case 2:
                    this.maquina_cafe.rellenarMaquina();
                    menuInicio();
                    break;
                case 3:
                    this.maquina_cafe.crearCafe();
                    menuInicio();
                    break;
                default:
                    System.out.println("Opción no disponible\n");
                    menuInicio();


            }

        }

    }

}
