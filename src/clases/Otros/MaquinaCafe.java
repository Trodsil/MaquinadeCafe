package clases.Otros;

import java.util.ArrayList;
import java.util.Scanner;

public class MaquinaCafe {
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
    public void menuInicio(){


        Integer opcion=null;
        while (opcion==null){
            Scanner opcioninicio=new Scanner(System.in);
            System.out.println("Bienvenido a la máquina de café\n" +
                    "=====================\n"+
                    "1.Pedir Café\n" +
                    "2.Rellenar Máquina\n" +
                    "3.Crear Nuevo Café\n");
            opcion=opcioninicio.nextInt();
            switch (opcion){
                case 1:
                    pedirCafe();
                    break;
                case 2:
                    rellenarMaquinamenu();
                    break;
                case 3:
                    crearCafe();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Valor no válido");
                    opcion=null;
            }
        }
    }
    public void pedirCafe(){
        Integer opcion = null;
        while(opcion==null){
            Scanner opcion_in=new Scanner(System.in);

            System.out.println("Que desea tomar");


            for (int i=0;i<listaCafes.size();i++) {
                System.out.println((i + 1) + "." + listaCafes.get(i).getNombre());
            }
            System.out.println("0.Salir");
            try{
                opcion=opcion_in.nextInt();
            }catch (Exception err){
                System.out.println("Valor no válido");
            }

            if(opcion==0){
                menuInicio();
            }else if(opcion > 0&&opcion <= listaCafes.size()){
                hacerCafe(opcion);
                opcion=null;
            }else{
                System.out.println("Valor no válido");
                opcion=null;
            }
        }


    }
    public void hacerCafe(Integer opcion){
        Cafe cafe_escogido=listaCafes.get(opcion-1);
        boolean boleano=true;
        if (this.vasos - 1 < 0) {
            boleano=false;
            System.out.println("No quedan vasos\n" +
                    "Se le enviara al menú principal\n");
            menuInicio();

        }else{
            this.vasos--;
        }

        if(this.gCafe-cafe_escogido.getgCafe()<0){
            boleano=false;
            System.out.println("No queda café para preparar el café\n" +
                    "Se le enviara al menú principal\n");
            menuInicio();
        }else {
            this.gCafe-=cafe_escogido.getgCafe();
        }
        this.gCafe-=cafe_escogido.getgCafe();
        if(this.gLeche-cafe_escogido.getgLeche()<0){
            boleano=false;
            System.out.println("No queda leche para preparar el café\n" +
                    "Se le enviara al menú principal\n");
            menuInicio();
        }else {
            this.gLeche-=cafe_escogido.getgLeche();
        }
        this.gLeche-=cafe_escogido.getgLeche();
        if(this.gCacao-cafe_escogido.getgLeche()<0){
            System.out.println("No queda cacao para preparar el café\n" +
                    "Se le enviara al menú principal\n");
            menuInicio();
            boleano=false;
        }else {
            this.gCacao-=cafe_escogido.getgLeche();
        }
        this.gCacao-=cafe_escogido.getgCacao();
        if(this.mlAgua-cafe_escogido.getMlAgua()<0){
            System.out.println("No queda agua para preparar el café\n" +
                    "Se le enviara al menú principal\n");
            menuInicio();
            boleano=false;
        }else {
            this.mlAgua-=cafe_escogido.getMlAgua();
        }
        this.mlAgua-=cafe_escogido.getMlAgua();
        if(boleano){
            System.out.println("\nPreparando café...\n" +
                    "Café preparado con éxito\n");
        }
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
                    boleano=false;
                    break;
                case 1:
                    rellenar("Cuantos vasos desea reponer","Vasos repuestos",this.vasos,"Vasos");
                    break;
                case 2:
                    rellenar("Cuantos gramos de grano de café desea reponer","Granos de café repuestos",this.gCafe,"Granos de café");
                    break;
                case 3:
                    rellenar("Cuantos gramos de leche desea reponer","Gramos de Leche repuestos",this.gLeche,"Leche");
                    break;
                case 4:
                    rellenar("Cuantos gramos de Cacao desea reponer","Gramos de Cacao repuestos",this.gCacao,"Cacao");
                    break;
                case 5:
                    rellenar("Cuantos ml de Agua desea reponer","Ml de agua repuestos",this.mlAgua,"Agua");
                    break;
                default:
                    System.out.println("Valor no válido");
            }
        }



    }

    public void rellenar(String texto_superior,String texto_posterior,int valor_modificar,String nombre_objeto_rellenar){

        System.out.println(texto_superior);
        Integer valor_sumar=null;
        while (valor_sumar==null){
            Scanner valor_agregar=new Scanner(System.in);
            try{
                valor_sumar=valor_agregar.nextInt();
            }catch (Exception err){
                System.out.println("Prueba con un número");
            }
        }

        valor_modificar+=valor_sumar;
        System.out.println(texto_posterior+" "+valor_sumar+"\n" +
                "El total de "+nombre_objeto_rellenar+" es: "+valor_modificar);


    }
    public void crearCafe(){
        //nombre
        System.out.println("¿Que nombre le desea poner al café?");
        Scanner nombre_in=new Scanner(System.in);
        String nombre=nombre_in.nextLine();

        //gCafe
        System.out.println("¿Cuántos gramos de café gasta?");
        Integer cafe=null;
        while (cafe==null){
            Scanner cafe_in=new Scanner(System.in);
            try {
                cafe=cafe_in.nextInt();
            }catch (Exception err){
                System.out.println("Valor no válido");
            }
        }

        //gLeche
        System.out.println("¿Cuántos gramos de leche gasta?");
        Integer leche=null;
        while (leche==null){
            Scanner leche_in=new Scanner(System.in);
            try {
                leche=leche_in.nextInt();
            }catch (Exception err){
                System.out.println("Valor no válido");
            }
        }
        //gCacao
        System.out.println("¿Cuántos gramos de cacao gasta?");
        Integer cacao=null;
        while (cacao==null){
            Scanner cacao_in=new Scanner(System.in);
            try {
                cacao=cacao_in.nextInt();
            }catch (Exception err){
                System.out.println("Valor no válido");
            }
        }
        this.listaCafes.add(new Cafe(nombre,cafe,leche,cacao));
        System.out.println("Café: "+nombre+" creado con éxito");
        menuInicio();
    }

}
