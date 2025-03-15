public class Principal {
    public static void main(String[] args) {
        
    Pessoa[] pessoas = new Pessoa[3];
    Disciplina[] disciplinas = new Disciplina[3];

    // exemplo de criação de objeto pessoa para professor
    pessoas[0] = new Pessoa("João Pereira Alves", "12/05/1995", "11937546321", "6493050", "10452631", "", "FCI");
    
    // exemplo de criação de objeto pessoa para estudante
    pessoas[1] = new Pessoa("Maria Souza", "13/08/2005", "11987654321", "6493050", "10452631", "Sistemas de Informação", "");
    pessoas[2] = new Pessoa("Marcos Dias", "30/05/2003", "11923354128", "6493020", "22451634", "Ciência da Computação", "");

    // exemplo de criação de objeto disciplina
    disciplinas[0] = new Disciplina(15, "Programação de Sistemas I", "Sistemas de Informação");
    disciplinas[1] = new Disciplina(16, "Redes de Computadores", "Sistemas de Informação");
    disciplinas[2] = new Disciplina(17, "Pensamento Computacional", "Ciência da Computação");

    System.out.println("Dados das pessoas:" + "\n");
    for (Pessoa pessoa : pessoas) {
        pessoa.imprimirDados();
    }

    System.out.println("Dados das disciplinas:" + "\n");
    for (Disciplina disciplina : disciplinas) {
        disciplina.imprimirDados();
    }

    }
}