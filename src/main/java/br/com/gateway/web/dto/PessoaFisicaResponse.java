package br.com.gateway.web.dto;

import java.math.BigDecimal;

public class PessoaFisicaResponse {
    private EnderecoResponse endereco;

    private BigDecimal salario;

    private String cpf;

    private String profissao;

    private String nome;

    private String dataNascimento;

    public EnderecoResponse getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoResponse endereco) {
        this.endereco = endereco;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "PessoaFisicaResponse [endereco = " + endereco + ", salario = " + salario + ", cpf = " + cpf + ", profissao = " + profissao + ", nome = " + nome + ", dataNascimento = " + dataNascimento + "]";
    }
}
