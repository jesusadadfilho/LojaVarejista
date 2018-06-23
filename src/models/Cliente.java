package models;

public class Cliente {
    private int cpf;
    private String nome;
    private int totalCompras;
    private String localidade;

    public Cliente(int cpf, String nome, String localidade) {
        this.cpf = cpf;
        this.nome = nome;
        this.localidade = localidade;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getTotalCompras() {
        return totalCompras;
    }

    public void setTotalCompras(int totalCompras) {
        this.totalCompras = totalCompras;
    }
}
