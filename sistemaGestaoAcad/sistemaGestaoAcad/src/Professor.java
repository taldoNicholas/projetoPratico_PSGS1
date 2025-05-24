import java.util.ArrayList;

public class Professor extends Pessoa {
    private int drt;
    private String email;
    private String unidadeAcademica;
    private ArrayList<Turma> turmasResponsaveis;

    // Construtor
    public Professor(String nomeCompleto, String dataNasc, String telefone, String CEP, int drt, String unidadeAcademica) {
        super(nomeCompleto, dataNasc, telefone, CEP);
        this.drt = drt;
        this.email = drt + "@mackenzie.br"; // Gera e-mail automaticamente
        this.unidadeAcademica = unidadeAcademica;
        this.turmasResponsaveis = new ArrayList<>();
    }

    // Getters e Setters
    public int getDrt() {
        return drt;
    }

    public String getEmail() {
        return email;
    }

    public String getUnidadeAcademica() {
        return unidadeAcademica;
    }

    public void setUnidadeAcademica(String unidadeAcademica) {
        this.unidadeAcademica = unidadeAcademica;
    }

    public ArrayList<Turma> getTurmasResponsaveis() {
        return turmasResponsaveis;
    }

    // Métodos para adicionar/remover turma
    public void adicionarTurma(Turma turma) {
        turmasResponsaveis.add(turma);
    }

    public void removerTurma(Turma turma) {
        turmasResponsaveis.remove(turma);
    }

    // Implementação do método abstrato
    @Override
    public void imprimirDados() {
        System.out.println("\n--- Dados do Professor ---");
        System.out.println("Nome completo: " + getNomeCompleto());
        System.out.println("Data de nascimento: " + getDataNasc());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CEP: " + getCEP());
        System.out.println("DRT: " + drt);
        System.out.println("Email: " + email);
        System.out.println("Unidade Acadêmica: " + unidadeAcademica);
        System.out.println("Turmas Responsáveis:");
        for (Turma turma : turmasResponsaveis) {
            System.out.println("  - " + turma.getCodigoTurma());
        }
    }
}
