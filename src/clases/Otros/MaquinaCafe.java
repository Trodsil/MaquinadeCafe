package clases.Otros;

import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.synth.SynthOptionPaneUI;
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
    public void rellenarMaquina(){
        System.out.println("¿Qué desea rellenar?\n" +
                "============================\n" +
                "1:Vasos(ud)\n" +
                "2:Cafe(g)\n" +
                "3:Leche(g)\n" +
                "4:Cacao(g)\n" +
                "5:Agua(ml)\n" +
                "0:Salir\n"+
                "============================\n");

        Integer opcion=null;
        while (opcion==null) {
            Scanner opcion_valor=new Scanner(System.in);
            try{
                opcion=opcion_valor.nextInt();
            }catch (Exception err){
                System.out.println("Prueba con otro valor");
            }
            Scanner valor;
            switch (opcion){
                case 0:
                    break;
                case 1:
                    System.out.println("¿Cuanto desea rellenar?"+
                            "============================\n");
                    valor=new Scanner(System.in);
                    Integer valor_vasos;
                    try {
                        valor_vasos=valor.nextInt();
                        if((this.vasos+=valor_vasos)>1000){
                            System.out.println("No puede sobrepasar el máximo de la máquina");
                        }else{
                            this.vasos+=valor_vasos;
                            System.out.println("Vasos añadidos: "+valor_vasos+"\nVasos totales: "+this.vasos+"\n"+"============================\n");
                        }

                    }catch (Exception err){
                        System.out.println("Prueba con otro valor");
                    }
                    rellenarMaquina();
                    break;
                case 2:
                    System.out.println("¿Cuanto desea rellenar?"+
                            "============================\n");
                    valor=new Scanner(System.in);
                    Integer valor_cafe;
                    try {
                        valor_cafe=valor.nextInt();
                        if((this.gCafe+=valor_cafe)>1000){
                            System.out.println("No puede sobrepasar el máximo de la máquina");
                        }else{
                            this.gCafe+=valor_cafe;
                            System.out.println("Vasos añadidos: "+valor_cafe+"\nVasos totales: "+this.gCafe+"\n"+"============================\n");
                        }

                    }catch (Exception err){
                        System.out.println("Prueba con otro valor");
                    }
                    rellenarMaquina();
                    break;
                case 3:
                    System.out.println("¿Cuanto desea rellenar?"+
                            "============================\n");
                    valor=new Scanner(System.in);
                    Integer valor_leche;
                    try {
                        valor_leche=valor.nextInt();
                        if((this.gLeche+=valor_leche)>1000){
                            System.out.println("No puede sobrepasar el máximo de la máquina");
                        }else{
                            this.gLeche+=valor_leche;
                            System.out.println("Vasos añadidos: "+valor_leche+"\nVasos totales: "+this.gLeche+"\n"+"============================\n");
                        }

                    }catch (Exception err){
                        System.out.println("Prueba con otro valor");
                    }
                    rellenarMaquina();
                    break;
                case 4:
                    System.out.println("¿Cuanto desea rellenar?"+
                            "============================\n");
                    valor=new Scanner(System.in);
                    Integer valor_cacao;
                    try {
                        valor_cacao=valor.nextInt();
                        if((this.gCacao+=valor_cacao)>1000){
                            System.out.println("No puede sobrepasar el máximo de la máquina");
                        }else{
                            this.gCacao+=valor_cacao;
                            System.out.println("Vasos añadidos: "+valor_cacao+"\nVasos totales: "+this.gCacao+"\n"+"============================\n");
                        }

                    }catch (Exception err){
                        System.out.println("Prueba con otro valor");
                    }
                    rellenarMaquina();
                    break;
                case 5:
                    System.out.println("¿Cuanto desea rellenar?"+
                            "============================\n");
                    valor=new Scanner(System.in);
                    Integer valor_agua;
                    try {
                        valor_agua=valor.nextInt();
                        if((this.mlAgua+=valor_agua)>1000){
                            System.out.println("No puede sobrepasar el máximo de la máquina");
                        }else{
                            this.mlAgua+=valor_agua;
                            System.out.println("Vasos añadidos: "+valor_agua+"\nVasos totales: "+this.mlAgua+"\n"+"============================\n");
                        }

                    }catch (Exception err){
                        System.out.println("Prueba con otro valor");
                    }
                    rellenarMaquina();
                    break;
                default:
                    System.out.println("Opción no disponible");
                    rellenarMaquina();
                    break;
            }
        }
    }

    public void crearCafe(){
        System.out.println("\n¿Qué nombre deseas poner?\n");
        Scanner nombre=new Scanner(System.in);
        String valor_nombre=nombre.nextLine();
        System.out.println("\n¿Cuantos gramos de cafe gastará?\n");
        Scanner cafe=new Scanner(System.in);
        Integer valor_cafe=cafe.nextInt();
        System.out.println("\n¿Cuantos gramos de leche gastará?\n");
        Scanner leche=new Scanner(System.in);
        Integer valor_leche=leche.nextInt();
        System.out.println("\n¿Cuantos gramos de cacao gastará?\n");
        Scanner cacao=new Scanner(System.in);
        Integer valor_cacao=cacao.nextInt();
        this.listaCafes.add(new Cafe(valor_nombre,valor_cafe,valor_leche,valor_cacao));
        System.out.println("\nEl café "+valor_nombre+" ha sido creado con éxito\n");
    }
    public void pedirCafe(){
        System.out.println("¿Qué café desea pedir\n" +
                "============================\n");
        for (int i = 0; i<this.listaCafes.size();i++){
            System.out.println((i+1)+":"+this.listaCafes.get(i).getNombre());
        }
        Scanner opcion=new Scanner(System.in);
        Integer valor_opcion=opcion.nextInt();
        if(valor_opcion<0||valor_opcion>this.listaCafes.size()){
            System.out.println("Prueba con otro valor");
        }else{
            if(this.vasos--<=0){
                System.out.println("No quedan vasos");
            }else if(this.gCafe-this.listaCafes.get(valor_opcion-1).getgCafe()<=0){
                System.out.println("No queda café");
            }else if (this.gLeche-this.listaCafes.get(valor_opcion-1).getgLeche()<=0) {
                System.out.println("No queda leche");
            }else if (this.gCacao-this.listaCafes.get(valor_opcion-1).getgCacao()<=0) {
                System.out.println("No queda cacao");
            }else if (this.mlAgua-this.listaCafes.get(valor_opcion-1).getMlAgua()<=0) {
                System.out.println("No queda agua");
            }else{
                this.vasos--;
                this.gCafe-=this.listaCafes.get(valor_opcion-1).getgCafe();
                this.gLeche-=this.listaCafes.get(valor_opcion-1).getgLeche();
                this.gCacao-=this.listaCafes.get(valor_opcion-1).getgCacao();
                this.mlAgua-=this.listaCafes.get(valor_opcion-1).getMlAgua();
                System.out.println("Su café esta siendo preparado\n" +
                        "Su café ha sido creado con exito\n");
            }
        }
    }
}


