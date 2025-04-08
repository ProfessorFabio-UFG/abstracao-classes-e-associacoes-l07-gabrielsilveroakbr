public class Aluno {
    private String nome;
    private int matricula;
    private int ano;
    private Curso curso;

    Aluno(String nome, int matricula, int ano, Curso curso ){
        this.nome = nome;
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }
    public String getNome(){
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public int getMatricula() {
        return matricula;
    }
}
