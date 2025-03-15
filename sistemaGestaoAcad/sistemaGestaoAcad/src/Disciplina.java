public class Disciplina {
    int codDisciplina;
    String nomeDisciplina;
    String nomeCurso;

    // construtor da classe disciplina
    public Disciplina(int codDisciplina, String nomeDisciplina, String nomeCurso){
        this.codDisciplina = codDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.nomeCurso = nomeCurso;
    }

    // método que imprime os dados da disciplina
    public void imprimirDados(){
    System.out.println("Código da disciplina: " + codDisciplina);
    System.out.println("Nome da Disciplina: " + nomeDisciplina);
    System.out.println("Nome do Curso: " + nomeCurso + "\n");
    }
}
