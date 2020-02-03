package br.com.gateway.web.dto;

public class PessoaJuridicaResponse {

    private String nomeFantasia;

    private EnderecoResponse endereco;

    private String cnpj;

    private String razaoSocial;

    private String dataAbertura;

    private String ramoAtividade;

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public EnderecoResponse getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoResponse endereco) {
        this.endereco = endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getRamoAtividade() {
        return ramoAtividade;
    }

    public void setRamoAtividade(String ramoAtividade) {
        this.ramoAtividade = ramoAtividade;
    }

    @Override
    public String toString() {
        return "PessoaJuridicaResponse [nomeFantasia = " + nomeFantasia + ", endereco = " + endereco + ", cnpj = " + cnpj + ", razaoSocial = " + razaoSocial + ", dataAbertura = " + dataAbertura + ", ramoAtividade = " + ramoAtividade + "]";
    }
}
