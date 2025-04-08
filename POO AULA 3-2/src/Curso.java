public class Curso {
    private String nome;
    private String sigla;
    private Departamento depto;

    Curso(String nome, String sigla, Departamento depto){
        this.nome = nome;
        this.sigla = sigla;
        this.depto = depto;
    }

    public Departamento getDepto() {
        return depto;
    }
    public String getNome(){
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
