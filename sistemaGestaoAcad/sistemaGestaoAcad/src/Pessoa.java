public class Pessoa {
    String nomeCompleto;
    String dataNasc;
    String telefone;
    String CEP;
    String matricula;
    String email;
    String curso;
    String unidadeAcad;
    int tipo;
 
    // metodo construtor pessoa para estudante
    public Pessoa(String nomeCompleto, String dataNasc, String telefone, String CEP, String matricula, String curso, String unidadeAcad) {
        this.nomeCompleto = nomeCompleto;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.CEP = CEP;
        this.matricula = matricula;
        this.email = matricula + "@mackenzista.com.br"; 
        this.curso = curso;
        this.unidadeAcad = unidadeAcad;

        // if que compara se o conteúdo da string unidadeacad é igual a vazio (espaço em branco)
        if (!unidadeAcad.equals("")){
        this.tipo = 1;
        }else{
        this.tipo = 0;
        }
    }
 
   

    public void imprimirDados() {
        System.out.println("\n" + "Nome completo: " + nomeCompleto);
        System.out.println("Data de nascimento: " + dataNasc);
        System.out.println("Telefone: " + telefone);
        System.out.println("CEP: " + CEP);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Email: " + email);
    
        // if que compara o tipo para exibir o valor correto
        if (tipo == 0) {
            System.out.println("Curso: " + curso + "\n");
        } else { 
            System.out.println("Unidade Acadêmica: " + unidadeAcad + "\n");
        }
    }
}
    
 
 