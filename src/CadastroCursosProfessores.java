import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCursosProfessores {

    private static ArrayList<String> cursos = new ArrayList<>();
    private static ArrayList<String> professores = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar curso");
            System.out.println("2. Adicionar professor");
            System.out.println("3. Listar cursos e professores");
            System.out.println("0. Sair");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    adicionarCurso();
                    break;
                case 2:
                    adicionarProfessor();
                    break;
                case 3:
                    listarCursosProfessores();
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void adicionarCurso() {
        System.out.println("Informe o nome do curso:");
        String curso = scanner.nextLine();
        cursos.add(curso);
        System.out.println("Curso adicionado com sucesso!");
    }

    private static void adicionarProfessor() {
        System.out.println("Informe o nome do professor:");
        String professor = scanner.nextLine();
        professores.add(professor);
        System.out.println("Professor adicionado com sucesso!");
    }

    private static void listarCursosProfessores() {
        System.out.println("\nCursos:");
        for (String curso : cursos) {
            System.out.println(curso);
        }

        System.out.println("\nProfessores:");
        for (String professor : professores) {
            System.out.println(professor);
        }
    }
}