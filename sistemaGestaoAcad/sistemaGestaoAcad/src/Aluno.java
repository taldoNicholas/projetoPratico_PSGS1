import java.util.ArrayList;

public class Aluno extends Pessoa {
    private int ra;
    private String email;
    private String cursoMatriculado;
    private ArrayList<Turma> turmasMatriculadas;

    // Construtor
    public Aluno(String nomeCompleto, String dataNasc, String telefone, String CEP, int ra, String cursoMatriculado) {
        super(nomeCompleto, dataNasc, telefone, CEP);
        this.ra = ra;
        this.email = ra + "@mackenzista.com.br"; // Gera e-mail automaticamente
        this.cursoMatriculado = cursoMatriculado;
        this.turmasMatriculadas = new ArrayList<>();
    }

    // Getters e Setters
    public int getRa() {
        return ra;
    }

    public String getEmail() {
        return email;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public ArrayList<Turma> getTurmasMatriculadas() {
        return turmasMatriculadas;
    }

    // Métodos para adicionar/remover turma
    public void adicionarTurma(Turma turma) {
        turmasMatriculadas.add(turma);
    }

    public void removerTurma(Turma turma) {
        turmasMatriculadas.remove(turma);
    }

    // Implementação do método abstrato
    @Override
    public void imprimirDados() {
        System.out.println("\n--- Dados do Aluno ---");
        System.out.println("Nome completo: " + getNomeCompleto());
        System.out.println("Data de nascimento: " + getDataNasc());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CEP: " + getCEP());
        System.out.println("RA: " + ra);
        System.out.println("Email: " + email);
        System.out.println("Curso: " + cursoMatriculado);
        System.out.println("Turmas Matriculadas:");
        for (Turma turma : turmasMatriculadas) {
            System.out.println("  - " + turma.getCodigoTurma());
        }
    }
}
