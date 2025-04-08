import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Departamento depto = new Departamento("Escola das Engenharias", "EMC");
        Curso curso = new Curso("Engenharia da Computação", "EC", depto);
        Aluno aluno = new Aluno("Gabriel", 202403119, 2, curso);
        System.out.println("Nome do Aluno: " + aluno.getNome());
        System.out.println("Matricula do Aluno: " + aluno.getMatricula());
        System.out.println("Curso: " + aluno.getCurso().getNome());
        System.out.println("Departamento: " + aluno.getCurso().getDepto().getNome());


    }

}