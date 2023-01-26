package clases.Otros;

import clases.Controlador;

import javax.swing.plaf.PanelUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class MaquinaCafe extends Controlador {
    private String numeroSerie;
    private ArrayList<Cafe> listaCafes;
    private int vasos;
    private int gCafe;
    private int gLeche;
    private int gCacao;
    private int mlAgua;

    public MaquinaCafe(String numeroSerie, ArrayList<Cafe> listaCafes, int vasos, int gCafe, int gLeche, int gCacao, int mlAgua) {
        this.numeroSerie = numeroSerie;
        this.listaCafes = listaCafes;
        this.vasos = vasos;
        this.gCafe = gCafe;
        this.gLeche = gLeche;
        this.gCacao = gCacao;
        this.mlAgua = mlAgua;
    }
    //FÚNCIONES

    public void pedirCafe(){

    }
    public void rellenarMaquinamenu(){
        boolean boleano=true;
        while (boleano){
            Scanner opcionRellenar=new Scanner(System.in);
            System.out.println("Que desea rellenar\n" +
                    "1.Vasos\n" +
                    "2.Granos de Café(g)\n" +
                    "3.Leche(g)\n" +
                    "4.Cacao(g)\n" +
                    "5.Agua(ml)\n" +
                    "0.Salir");

            switch (opcionRellenar.nextInt()){

                case 0:
                    menuInicio();
                case 1:
                    rellenar("Cuantos vasos desea reponer","Se añadieron",this.vasos);
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    System.out.println("Valor no válido");
            }
        }



    }

    public void rellenar(String texto_superior,String texto_posterior,int valor_modificar){
        Scanner valor_agregar=new Scanner(System.in);
        System.out.println(texto_superior);
        Integer valor_sumar=null;
        while (valor_sumar==null){
            try{
                valor_sumar=valor_agregar.nextInt();
            }catch (Exception err){
                System.out.println("Prueba con un número");
            }
        }

        valor_modificar+=valor_sumar;
        System.out.println(texto_posterior+" "+valor_sumar);
    }
    public void crearCafe(){

    }
}
