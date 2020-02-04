package br.com.teste;

public class Subgroup {
    private String nome;
    private String codigo;
    private Integer nivel;
    private String dataCriacao;

    public Subgroup(SubgroupDTO subgroupDTO) {
        this.nome = subgroupDTO.getName();
        this.codigo = subgroupDTO.getCode();
    }

    public Subgroup() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }
}
