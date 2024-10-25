package br.com.Jose;

class PessoaFisica extends Pessoa {
    private String cpf; // Propriedade específica da pessoa física

    public PessoaFisica(String nome, String dataNascimento, String cpf) {
        super(nome, dataNascimento);
        this.cpf = cpf;
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("CPF: " + cpf);
    }
}
