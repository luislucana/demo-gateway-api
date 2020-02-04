package br.com.teste;

import java.util.List;
import java.util.stream.Collectors;

public class User {
    private String nome;
    private Integer idade;
    private List<Group> groups;
    private String documento;
    private String dataNascimento;
    private String senha;

    public User(UserDTO userDTO) {
        this.nome = userDTO.getName();
        this.idade = userDTO.getAge();
        this.groups = userDTO.getGroupDTOs().stream().map(Group::new).collect(Collectors.toList());
    }

    public User() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
