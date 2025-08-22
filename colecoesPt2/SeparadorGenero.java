import java.util.ArrayList;
import java.util.Scanner;

public class SeparadorGenero {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            ArrayList<String> feminino = new ArrayList<>();
            ArrayList<String> masculino = new ArrayList<>();
            
            System.out.println("=== SEPARADOR POR GÊNERO ===");
            System.out.println("Digite 'sair' para encerrar");
            System.out.println("Use 'F' para feminino e 'M' para masculino\n");
            
            while (true) {
                System.out.print("Digite o nome: ");
                String nome = scanner.nextLine();
                
                if (nome.equalsIgnoreCase("sair")) {
                    break;
                }
                
                System.out.print("Digite o gênero (F/M): ");
                String genero = scanner.nextLine().toUpperCase();
                
                if (genero.equals("F")) {
                    feminino.add(nome);
                    System.out.println(nome + " adicionado ao grupo feminino\n");
                } else if (genero.equals("M")) {
                    masculino.add(nome);
                    System.out.println(nome + " adicionado ao grupo masculino\n");
                } else {
                    System.out.println("Gênero inválido! Use apenas F ou M\n");
                }
            }
            
            System.out.println("\n=== RESULTADOS ===");
            System.out.println("Grupo Feminino (" + feminino.size() + " pessoas):");
            for (String nome : feminino) {
                System.out.println("- " + nome);
            }
            
            System.out.println("\nGrupo Masculino (" + masculino.size() + " pessoas):");
            for (String nome : masculino) {
                System.out.println("- " + nome);
            }
        }
    }
}