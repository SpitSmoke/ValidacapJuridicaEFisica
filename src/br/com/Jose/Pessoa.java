package br.com.Jose;

abstract class Pessoa {
    protected String nome;
    protected String dataNascimento;


    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }


    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    // Método abstrato para imprimir informações da pessoa
    public abstract void imprimirInformacoes();
}