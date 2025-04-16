public class Condutor {
    private String nome;
    private Integer numeroCNH;
    public Condutor(String nome, Integer numeroCNH){
        this.nome = nome;
        this.numeroCNH = numeroCNH;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getNumeroCNH() {
        return numeroCNH;
    }
    public void setNumeroCNH(Integer numeroCNH) {
        this.numeroCNH = numeroCNH;
    }
}
