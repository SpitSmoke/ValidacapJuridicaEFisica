package br.com.Jose;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoa1 = new PessoaFisica("João da Silva", "01/01/1990", "123.456.789-09");
        PessoaJuridica pessoa2 = new PessoaJuridica("Empresa X", "10/10/2000", "12.345.678/0001-90");

        System.out.println("Informações da Pessoa Física:");
        pessoa1.imprimirInformacoes();

        System.out.println("\nInformações da Pessoa Jurídica:");
        pessoa2.imprimirInformacoes();
    }
}
