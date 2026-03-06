package models;

public class Cachorro {

    private String cor;
    private String som;
    private String nome;
    private String raca;
    private Integer idade;
    private Double peso;

    // Construtor para Inicializar
    public Cachorro(String nome, Integer idade, String cor, String som){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
        this.som = som;
    }

    public Cachorro(String nome, String cor){
        this.nome = nome;
        this.cor = cor;
    }
    // Get e Set, separadas para cada caracteristica
    public void setNome(String nome) {
        this.nome = nome;
    } 
    public String getNome() {
        return nome;
    }
    //
    public void setCor(String cor) {
        this.cor = cor;
    } 
    public String getCor() {
        return cor;
    }
    //
    public void setRaca(String raca) {
        this.raca = raca;
    } 
    public String getRaca() {
        return raca;
    }
    //
    public void setIdade(Integer idade) {
        this.idade = idade;
    } 
    public Integer getIdade() {
        return idade;
    }
    //
    public void setCor(Double peso) {
        this.peso = peso;
    } 
    public Double getPeso() {
        return peso;
    }

    /* 
    public void emitirSom() {
        this.som = "SIUUU";
        System.out.println(this.som);
    }*/

    public void setSom(String som) {
        this.som = som;
    } 
    public String getSom() {
        return som;
    }

    //
    public String toString(){
        return "Nome: " + this.nome + "\ncor: " + this.cor;
    }
}
