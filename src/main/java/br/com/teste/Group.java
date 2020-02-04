package br.com.teste;

import java.util.List;
import java.util.stream.Collectors;

public class Group {
    private String nome;
    private String codigo;
    private List<Subgroup> subgroups;
    private Integer nivel;
    private String dataCriacao;

    public Group(GroupDTO groupDTO) {
        this.nome = groupDTO.getName();
        this.codigo = groupDTO.getCode();
        this.subgroups = groupDTO.getSubgroupDTOs().stream().map(Subgroup::new).collect(Collectors.toList());
    }

    public Group(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public Group() {

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

    public List<Subgroup> getSubgroups() {
        return subgroups;
    }

    public void setSubgroups(List<Subgroup> subgroups) {
        this.subgroups = subgroups;
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
