public class Departamento {
    private String nome;
    private String sigla;

    Departamento(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
}
