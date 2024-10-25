package br.com.Jose;

class PessoaJuridica extends Pessoa {
    private String cnpj;

    public PessoaJuridica(String nome, String dataNascimento, String cnpj) {
        super(nome, dataNascimento);
        this.cnpj = cnpj;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Abertura: " + dataNascimento);
        System.out.println("CNPJ: " + cnpj);
    }
}