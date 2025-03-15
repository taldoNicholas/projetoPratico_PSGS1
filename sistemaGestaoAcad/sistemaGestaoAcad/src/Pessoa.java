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
 
   
    // metodo para exibir dados da pessoa no console
    public void imprimirDados(){
     System.out.println("Nome completo: " + nomeCompleto);
     System.out.println("Data nascimento: " + dataNasc);
     System.out.println("Telefone: " + telefone);
     System.out.println("CEP: " + CEP);
     System.out.println("Matrícula: " + matricula);
     System.out.println("Email: " + email);
     if (tipo == 1){
     System.out.println("Unidade acadêmica: " + unidadeAcad + "\n");
    } else
     System.out.println("Curso: " + curso + "\n");
     }
 }
 
 