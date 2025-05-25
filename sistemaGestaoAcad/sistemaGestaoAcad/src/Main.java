import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Pessoa> listaPessoas = new ArrayList<>();
    private static ArrayList<Disciplina> listaDisciplinas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Professor");
            System.out.println("3. Cadastrar Disciplina");
            System.out.println("4. Cadastrar Turma");
            System.out.println("5. Listar Alunos");
            System.out.println("6. Listar Professores");
            System.out.println("7. Listar Disciplinas");
            System.out.println("8. Buscar Pessoa");
            System.out.println("9. Associar Aluno à Turma");
            System.out.println("10. Associar Professor à Turma");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> cadastrarAluno(sc);
                case 2 -> cadastrarProfessor(sc);
                case 3 -> cadastrarDisciplina(sc);
                case 4 -> cadastrarTurma(sc);
                case 5 -> listarAlunos();
                case 6 -> listarProfessores();
                case 7 -> listarDisciplinas();
                case 8 -> buscarPessoa(sc);
                case 9 -> associarAlunoATurma(sc);
                case 10 -> associarProfessorATurma(sc);
            }
        } while (opcao != 0);

        sc.close();
    }

    //cadastros

    private static void cadastrarAluno(Scanner sc) {
    System.out.println("\n--- Cadastro de Aluno ---");
    System.out.print("Nome completo: ");
    String nome = sc.nextLine(); // ✅ MANTÉM esse

    System.out.print("Data de nascimento: ");
    String data = sc.nextLine();

    System.out.print("Telefone: ");
    String tel = sc.nextLine();

    System.out.print("CEP: ");
    String cep = sc.nextLine();

    System.out.print("RA (número): ");
    int ra = sc.nextInt();
    sc.nextLine(); // ✅ MANTÉM esse aqui pra limpar o Enter

    System.out.print("Curso: ");
    String curso = sc.nextLine();

    Aluno aluno = new Aluno(nome, data, tel, cep, ra, curso);
    listaPessoas.add(aluno);
    System.out.println("Aluno cadastrado com sucesso.");
}


    private static void cadastrarProfessor(Scanner sc) {
        System.out.println("\n--- Cadastro de Professor ---");
        System.out.print("Nome completo: ");
        String nome = sc.nextLine();
        System.out.print("Data de nascimento: ");
        String data = sc.nextLine();
        System.out.print("Telefone: ");
        String tel = sc.nextLine();
        System.out.print("CEP: ");
        String cep = sc.nextLine();
        System.out.print("DRT (número): ");
        int drt = sc.nextInt();
        sc.nextLine();
        System.out.print("Unidade Acadêmica: ");
        String unidade = sc.nextLine();

        Professor prof = new Professor(nome, data, tel, cep, drt, unidade);
        listaPessoas.add(prof);
        System.out.println("Professor cadastrado com sucesso.");
    }

    private static void cadastrarDisciplina(Scanner sc) {
        System.out.println("\n--- Cadastro de Disciplina ---");
        System.out.print("Código da Disciplina: ");
        String cod = sc.nextLine();
        System.out.print("Nome da Disciplina: ");
        String nome = sc.nextLine();
        System.out.print("Curso oferecido: ");
        String curso = sc.nextLine();

        Disciplina d = new Disciplina(cod, nome, curso);
        listaDisciplinas.add(d);
        System.out.println("Disciplina cadastrada.");
    }

    private static void cadastrarTurma(Scanner sc) {
    System.out.println("\n--- Cadastro de Turma ---");
    System.out.print("Código da Turma (Ex: M1, N1...): ");
    String cod = sc.nextLine();
    System.out.print("Ano: ");
    int ano = sc.nextInt();
    System.out.print("Semestre: ");
    int semestre = sc.nextInt();
    sc.nextLine();
    System.out.print("Código da disciplina vinculada: ");
    String codDisc = sc.nextLine();

    Disciplina disciplina = buscarDisciplinaPorCodigo(codDisc);
    if (disciplina != null) {
        Turma t = new Turma(cod, ano, semestre, null); 
        disciplina.adicionarTurma(t);
        System.out.println("Turma adicionada à disciplina.");
    } else {
        System.out.println("Disciplina não encontrada.");
    }
}

    // ===== LISTAGENS =====
    private static void listarAlunos() {
        System.out.println("\n--- Lista de Alunos ---");
        for (Pessoa p : listaPessoas) {
            if (p instanceof Aluno) {
                p.imprimirDados();
            }
        }
    }

    private static void listarProfessores() {
        System.out.println("\n--- Lista de Professores ---");
        for (Pessoa p : listaPessoas) {
            if (p instanceof Professor) {
                p.imprimirDados();
            }
        }
    }

    private static void listarDisciplinas() {
        System.out.println("\n--- Disciplinas Cadastradas ---");
        for (Disciplina d : listaDisciplinas) {
            d.imprimirDados();
        }
    }

    private static void buscarPessoa(Scanner sc) {
        System.out.println("\nDigite RA (Aluno) ou DRT (Professor): ");
        int id = sc.nextInt();
        for (Pessoa p : listaPessoas) {
            if ((p instanceof Aluno && ((Aluno) p).getRa() == id) ||
                (p instanceof Professor && ((Professor) p).getDrt() == id)) {
                p.imprimirDados();
                return;
            }
        }
        System.out.println("Pessoa não encontrada.");
    }

    // ===== ASSOCIAÇÕES =====
    private static void associarAlunoATurma(Scanner sc) {
        System.out.println("\nDigite o RA do aluno: ");
        int ra = sc.nextInt();
        sc.nextLine();
        Aluno aluno = null;
        for (Pessoa p : listaPessoas) {
            if (p instanceof Aluno && ((Aluno) p).getRa() == ra) {
                aluno = (Aluno) p;
                break;
            }
        }

        if (aluno == null) {
            System.out.println("Aluno não encontrado.");
            return;
        }

        System.out.print("Digite o código da turma: ");
        String codTurma = sc.nextLine();
        Turma turma = buscarTurmaPorCodigo(codTurma);
        if (turma != null) {
            aluno.adicionarTurma(turma);
            turma.adicionarAluno(aluno);
            System.out.println("Aluno associado à turma.");
        } else {
            System.out.println("Turma não encontrada.");
        }
    }

    private static void associarProfessorATurma(Scanner sc) {
        System.out.println("\nDigite o DRT do professor: ");
        int drt = sc.nextInt();
        sc.nextLine();
        Professor professor = null;
        for (Pessoa p : listaPessoas) {
            if (p instanceof Professor && ((Professor) p).getDrt() == drt) {
                professor = (Professor) p;
                break;
            }
        }

        if (professor == null) {
            System.out.println("Professor não encontrado.");
            return;
        }

        System.out.print("Digite o código da turma: ");
        String codTurma = sc.nextLine();
        Turma turma = buscarTurmaPorCodigo(codTurma);
        if (turma != null) {
            professor.adicionarTurma(turma);
            turma.setProfessorResponsavel(professor);
            System.out.println("Professor associado à turma.");
        } else {
            System.out.println("Turma não encontrada.");
        }
    }

    // ===== MÉTODOS AUXILIARES =====
    private static Disciplina buscarDisciplinaPorCodigo(String cod) {
        for (Disciplina d : listaDisciplinas) {
            if (d.getCodigoDisciplina().equalsIgnoreCase(cod)) {
                return d;
            }
        }
        return null;
    }

    private static Turma buscarTurmaPorCodigo(String cod) {
        for (Disciplina d : listaDisciplinas) {
            for (Turma t : d.getListaTurmas()) {
                if (t.getCodigoTurma().equalsIgnoreCase(cod)) {
                    return t;
                }
            }
        }
        return null;
    }
}
