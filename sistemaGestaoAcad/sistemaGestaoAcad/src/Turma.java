import java.util.ArrayList;

public class Turma {
    private String codigoOferecimento; // Ex: M1, M2, N1, etc.
    private int ano;
    private int semestre;
    private Professor professorResponsavel;
    private ArrayList<Aluno> alunosMatriculados;

    // Construtor
    public Turma(String codigoOferecimento, int ano, int semestre, Professor professorResponsavel) {
        this.codigoOferecimento = codigoOferecimento;
        this.ano = ano;
        this.semestre = semestre;
        this.professorResponsavel = professorResponsavel;
        this.alunosMatriculados = new ArrayList<>();
    }

    // Getters e Setters
    public String getCodigoTurma() {
        return codigoOferecimento;
    }

    public void setCodigoOferecimento(String codigoOferecimento) {
        this.codigoOferecimento = codigoOferecimento;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public ArrayList<Aluno> getAlunosMatriculados() {
        return alunosMatriculados;
    }

    // Métodos
    public void adicionarAluno(Aluno aluno) {
        alunosMatriculados.add(aluno);
    }

    public void imprimirDados() {
        System.out.println("\n--- Dados da Turma ---");
        System.out.println("Código de Oferecimento: " + codigoOferecimento);
        System.out.println("Ano: " + ano);
        System.out.println("Semestre: " + semestre);
        System.out.println("Professor Responsável: " + professorResponsavel.getNomeCompleto());

        System.out.println("Alunos Matriculados:");
        for (Aluno aluno : alunosMatriculados) {
            System.out.println("  - " + aluno.getNomeCompleto());
        }
    }
}
