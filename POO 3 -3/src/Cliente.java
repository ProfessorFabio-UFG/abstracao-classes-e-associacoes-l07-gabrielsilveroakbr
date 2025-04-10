public class Cliente {
    private String nome;
    private String cpf;
    private Endereço end;
    Cliente(String nome, String cpf, Endereço end){
        this.nome = nome;
        this.cpf = cpf;
        this.end = end;
    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereço getEnd() {
        return end;
    }
}
