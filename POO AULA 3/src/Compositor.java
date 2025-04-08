import java.util.Scanner;
public class Compositor {
    private String nome;
    private String nacionalidade;

    Compositor(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade= nacionalidade;
    }
    public String getNome(){
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}
