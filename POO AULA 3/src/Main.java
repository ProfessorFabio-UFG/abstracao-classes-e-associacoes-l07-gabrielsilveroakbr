import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Compositor compositor = new Compositor("Michael Jackson", "Estadunidense");

        Musica musica = new Musica("Bad" , 1987,"Pop", compositor );

        System.out.println("Música: " + musica.getNome());
        System.out.println("Compositor: " + musica.getCompositor().getNome());
        System.out.println("Nacionalidade: " + musica.getCompositor().getNacionalidade());

    }

}