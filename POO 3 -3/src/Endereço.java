public class Endereço {
    private String rua;
    private String bairro;
    private String complemento;
    private String cidade;
    private String estado;
    private int numero;
    Endereço(String rua,String bairro,String complemento,String cidade,String estado, int numero){
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
        this.estado = estado;
        this.numero = numero;
    }
    public String getRua(){
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getEstado() {
        return estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
