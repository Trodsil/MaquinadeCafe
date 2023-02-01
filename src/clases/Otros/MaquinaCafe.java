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
            while (opcion==null){
                Scanner opcion_valor=new Scanner(System.in);
                try{
                    opcion=opcion_valor.nextInt();
                }catch (Exception err){
                    System.out.println("Prueba con otro valor");
                    opcion=null;
                }
            }
            switch (opcion){
                case 0:
                    break;
                case 1:
                    System.out.println("¿Cuanto desea rellenar\n?"+
                            "============================\n");

                    Integer valor_vasos=null;
                    while(valor_vasos==null){
                        Scanner opcion_vasos=new Scanner(System.in);
                        try {
                            valor_vasos=opcion_vasos.nextInt();
                        }catch (Exception err){
                            System.out.println("Prueba con otro valor");
                        }

                    }
                    if(this.vasos+valor_vasos>1000){
                        System.out.println("No puede sobrepasar el máximo de la máquina");
                    }else{
                        this.vasos+=valor_vasos;
                        System.out.println("Vasos añadidos: "+valor_vasos+"\nVasos totales: "+this.vasos+"\n============================\n");
                    }
                    rellenarMaquina();
                    break;
                case 2:
                    System.out.println("¿Cuanto desea rellenar\n?"+
                            "============================\n");
                    Integer valor_cafe=null;
                    while(valor_cafe==null){
                        Scanner opcion_cafe=new Scanner(System.in);
                        try {
                            valor_cafe=opcion_cafe.nextInt();
                            if((this.gCafe+=valor_cafe)>1000){
                                System.out.println("No puede sobrepasar el máximo de la máquina");
                            }else{
                                this.gCafe+=valor_cafe;
                                System.out.println("Gramos de café añadidos: "+valor_cafe+"\nGramos de café totales: "+this.gCafe+"\n============================\n");
                            }

                        }catch (Exception err){
                            System.out.println("Prueba con otro valor");
                        }
                    }
                    if(this.gCafe+valor_cafe>1000){
                        System.out.println("No puede sobrepasar el máximo de la máquina");
                    }else{
                        this.gCafe+=valor_cafe;
                        System.out.println("Gramos de café añadidos: "+valor_cafe+"\nGramos de café totales: "+this.gCafe+"\n============================\n");
                    }
                    rellenarMaquina();
                    break;
                case 3:
                    System.out.println("¿Cuanto desea rellenar\n?"+
                            "============================\n");
                    Integer valor_leche=null;
                    while(valor_leche==null){
                        Scanner opcion_leche=new Scanner(System.in);
                        try {
                            valor_leche=opcion_leche.nextInt();


                        }catch (Exception err){
                            System.out.println("Prueba con otro valor");
                        }
                    }
                    if(this.gLeche+valor_leche>1000){
                        System.out.println("No puede sobrepasar el máximo de la máquina");
                    }else{
                        this.gLeche+=valor_leche;
                        System.out.println("\"Gramos de leche añadidos: "+valor_leche+"\nGramos de leche totales: "+this.gLeche+"\n============================\n");
                    }
                    rellenarMaquina();
                    break;
                case 4:
                    System.out.println("¿Cuanto desea rellenar\n?"+
                            "============================\n");
                    Integer valor_cacao=null;
                    while(valor_cacao==null){
                        Scanner opcion_cacao=new Scanner(System.in);
                        try {
                            valor_cacao=opcion_cacao.nextInt();
                        }catch (Exception err){
                            System.out.println("Prueba con otro valor");
                        }
                    }
                    if((this.gCacao+=valor_cacao)>1000){
                        System.out.println("No puede sobrepasar el máximo de la máquina");
                    }else{
                        this.gCacao+=valor_cacao;
                        System.out.println("Gramos de cacao añadidos: "+valor_cacao+"\nGramos de cacao: "+this.gCacao+"\n============================\n");
                    }
                    rellenarMaquina();
                    break;
                case 5:
                    System.out.println("¿Cuanto desea rellenar\n?"+
                            "============================\n");
                    Integer valor_agua=null;
                    while(valor_agua==null){
                        Scanner opcion_agua=new Scanner(System.in);
                        try {
                            valor_agua=opcion_agua.nextInt();
                        }catch (Exception err){
                            System.out.println("Prueba con otro valor");
                        }
                    }
                    if((this.mlAgua+=valor_agua)>1000){
                        System.out.println("No puede sobrepasar el máximo de la máquina");
                    }else{
                        this.mlAgua+=valor_agua;
                        System.out.println("Agua añadida: "+valor_agua+"\nAgua total: "+this.mlAgua+"\n============================\n");
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
        Integer valor_cafe=null;
        while(valor_cafe==null){
            Scanner cafe=new Scanner(System.in);
            try{
                valor_cafe=cafe.nextInt();
            }catch (Exception err){
                System.out.println("Prueba con otro valor");
            }
        }
        System.out.println("\n¿Cuantos gramos de leche gastará?\n");
        Integer valor_leche=null;
        while(valor_leche==null){
            Scanner leche=new Scanner(System.in);
            try{
                valor_leche=leche.nextInt();
            }catch (Exception err){
                System.out.println("Prueba con otro valor");
            }
        }
        System.out.println("\n¿Cuantos gramos de cacao gastará?\n");
        Integer valor_cacao=null;
        while(valor_cacao==null){
            Scanner cacao=new Scanner(System.in);
            try{
                valor_cacao=cacao.nextInt();
            }catch (Exception err){
                System.out.println("Prueba con otro valor");
            }
        }
        this.listaCafes.add(new Cafe(valor_nombre,valor_cafe,valor_leche,valor_cacao));
        System.out.println("\nEl café "+valor_nombre+" ha sido creado con éxito\n");
    }
    public void pedirCafe(){
        System.out.println("¿Qué café desea pedir\n" +
                "============================\n");
        for (int i = 0; i<this.listaCafes.size();i++){
            System.out.println((i+1)+":"+this.listaCafes.get(i).getNombre());
        }
        System.out.println("0:Salir");

        Integer valor_opcion=null;
        boolean condicion=true;
        while (valor_opcion==null || condicion){
            Scanner opcion=new Scanner(System.in);
            try{
                valor_opcion=opcion.nextInt();
                condicion=valor_opcion<0 || valor_opcion>this.listaCafes.size();
                if(condicion){
                    System.out.println("Opción no válida");
                }
            }catch (Exception err){
                System.out.println("Prueba con otro valor");
            }


        }
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


