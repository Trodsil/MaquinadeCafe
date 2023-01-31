package clases.Otros;

public class Cafe{
    private String nombre;
    private int gCafe;
    private int gLeche;
    private int gCacao;
    private int mlAgua;

    public Cafe(String nombre, int gCafe, int gLeche, int gCacao) {
        this.nombre = nombre;
        this.gCafe = gCafe;
        this.gLeche = gLeche;
        this.gCacao = gCacao;
        this.mlAgua=gCacao+gCafe+gLeche;

    }

    public int getgCafe() {
        return gCafe;
    }

    public int getgLeche() {
        return gLeche;
    }

    public int getgCacao() {
        return gCacao;
    }

    public int getMlAgua() {
        return mlAgua;
    }

    public String getNombre() {
        return nombre;
    }
}
