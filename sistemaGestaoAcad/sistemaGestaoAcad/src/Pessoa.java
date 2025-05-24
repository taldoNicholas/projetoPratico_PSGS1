public abstract class Pessoa {
    private String nomeCompleto;
    private String dataNasc;
    private String telefone;
    private String CEP;

    // construtor da classe pessoa
    public Pessoa(String nomeCompleto, String dataNasc, String telefone, String CEP) {
        this.nomeCompleto = nomeCompleto;
        this.dataNasc = dataNasc;
        this.telefone = telefone;
        this.CEP = CEP;
    }

    // getters and setters da pessoa
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

  
    public abstract void imprimirDados();
}
