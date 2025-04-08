import java.util.Scanner;
public class Musica {
    private String nome;
    private int ano;
    private String tipo;
    private Compositor compositor;

    Musica(String nome, int ano, String tipo, Compositor compositor){
        this.nome = nome;
        this.ano = ano;
        this.tipo = tipo;
        this.compositor = compositor;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public void setCompositor(Compositor compositor){
        this.compositor = compositor;
    }
    public String getNome(){
        return nome;
    }
    public String getTipo(){
        return tipo;
    }

    public int getAno() {
        return ano;
    }

    public Compositor getCompositor() {
        return compositor;
    }

}
