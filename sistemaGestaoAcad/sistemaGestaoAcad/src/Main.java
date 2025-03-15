import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        Pessoa[] pessoas = new Pessoa[3];
        Disciplina[] disciplinas = new Disciplina[3];

        
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("\n" + "Digite os dados da " + (i + 1) + "ª pessoa: \n");

            System.out.println("Nome completo: ");
            String nomeCompleto = scanner.nextLine();

            System.out.println("Data de nascimento (DD/MM/AAAA): ");
            String dataNasc = scanner.nextLine();

            System.out.println("Telefone (somente números): ");
            String telefone = scanner.nextLine();

            System.out.println("CEP (XXXXX-XXX): ");
            String CEP = scanner.nextLine();

            System.out.println("Matrícula ou DRT: ");
            String matricula = scanner.nextLine();

            System.out.println("Curso (aperte a tecla ENTER caso seja professor): ");
            String curso = scanner.nextLine();
            
            String unidadeAcad = "";
            if (curso.isEmpty()) {
                System.out.println("Unidade Acadêmica: ");
                unidadeAcad = scanner.nextLine();
            }

            pessoas[i] = new Pessoa(nomeCompleto, dataNasc, telefone, CEP, matricula, curso, unidadeAcad);
            System.out.println("\n" + "Pessoa adicionada: " + nomeCompleto + " Matrícula/DRT: " + matricula + "\n");
        }

        
        for (Pessoa pessoa : pessoas) {
            pessoa.imprimirDados();
        }


        for (int i = 0; i < disciplinas.length; i++) {
            System.out.println("\nDigite os dados da " + (i + 1) + "ª disciplina: \n");

            System.out.println("Código da disciplina: ");
            int codDisciplina = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Nome da disciplina: ");
            String nomeDisciplina = scanner.nextLine();

            System.out.println("Nome do curso: ");
            String nomeCurso = scanner.nextLine();

            disciplinas[i] = new Disciplina(codDisciplina, nomeDisciplina, nomeCurso);

            System.out.println("\n" + "Disciplina adicionada: " + nomeDisciplina + " código: " + codDisciplina + "\n");
        }

        for (Disciplina disciplina : disciplinas) {
            disciplina.imprimirDados();
        }
               scanner.close();  
    }
}
