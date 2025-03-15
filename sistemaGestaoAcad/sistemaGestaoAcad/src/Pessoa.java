public class Pessoa {
   String nomeCompleto;
   String dataNasc;
   int telefone;
   int CEP;
   int matricula;
   String email;
   String curso;
   String oferecMatric;
   String unidadeAcad;
   String oferecResp;
   int tipo; // 0 para estudante, 1 para professor

   // construtor da classe pessoa para estudante, com os atributos únicos de estudante vindo antes dos compartilhados/vindos por herança da classe Pessoa.
   public Pessoa(String curso, String oferecMatric, String nomeCompleto, String dataNasc, int telefone, int CEP, int matricula) {
       this.nomeCompleto = nomeCompleto;
       this.dataNasc = dataNasc;
       this.telefone = telefone;
       this.CEP = CEP;
       this.matricula = matricula;
       this.email = matricula + "@mackenzista.com.br"; 
       this.curso = curso;
       this.oferecMatric = oferecMatric;
       this.tipo = 0;
   }

   // construtor da classe pessoa para professor, com os atributos únicos de professor vindo após os compartilhados/ vindos por herança da classe Pessoa.
   public Pessoa(String nomeCompleto, String dataNasc, int telefone, int CEP, int matricula, String unidadeAcad, String oferecResp) {
       this.nomeCompleto = nomeCompleto;
       this.dataNasc = dataNasc;
       this.telefone = telefone;
       this.CEP = CEP;
       this.matricula = matricula;
       this.email = matricula + "@mackenzie.com.br"; 
       this.unidadeAcad = unidadeAcad;
       this.oferecResp = oferecResp;
       this.tipo = 1;
   }

// método que imprime os dados da Pessoa

   public void imprimrDadosPes(){
    System.out.println("Nome completo:" + nomeCompleto);
    System.out.println("Data nascimento:" + dataNasc);
    System.out.println("Telefone:" + telefone);
    System.out.println("CEP:" + CEP);
    System.out.println("Matrícula:" + matricula);
    System.out.println("Email: " + email);
    if (tipo == 0){
    System.out.println("Unidade acadêmica: " + unidadeAcad);
    System.out.println("Oferecimento responsável: " + oferecResp);
    } else {
    System.out.println("Curso: " + curso);
    System.out.println("Oferecimento matriculado:" + oferecMatric); 
    }
   }
}
