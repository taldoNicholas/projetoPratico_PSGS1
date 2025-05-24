import java.util.ArrayList;

public class Disciplina {
    private String codigoDisciplina;
    private String nomeDisciplina;
    private String cursoOferecido;
    private ArrayList<Turma> listaTurmas;

    public Disciplina(String codigoDisciplina, String nomeDisciplina, String cursoOferecido) {
        this.codigoDisciplina = codigoDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.cursoOferecido = cursoOferecido;
        this.listaTurmas = new ArrayList<>();
    }

    public void adicionarTurma(Turma turma) {
        listaTurmas.add(turma);
    }

    public void imprimirDados() {
        System.out.println("Código: " + codigoDisciplina);
        System.out.println("Nome: " + nomeDisciplina);
        System.out.println("Curso: " + cursoOferecido);
        System.out.println("Turmas:");
        for (Turma turma : listaTurmas) {
            System.out.println("- " + turma.getCodigoTurma());
        }
    }

    // Getters e Setters
    public String getCodigoDisciplina() { return codigoDisciplina; }
    public void setCodigoDisciplina(String codigoDisciplina) { this.codigoDisciplina = codigoDisciplina; }

    public String getNomeDisciplina() { return nomeDisciplina; }
    public void setNomeDisciplina(String nomeDisciplina) { this.nomeDisciplina = nomeDisciplina; }

    public String getCursoOferecido() { return cursoOferecido; }
    public void setCursoOferecido(String cursoOferecido) { this.cursoOferecido = cursoOferecido; }

    public ArrayList<Turma> getListaTurmas() { return listaTurmas; }
    public void setListaTurmas(ArrayList<Turma> listaTurmas) { this.listaTurmas = listaTurmas; }
}