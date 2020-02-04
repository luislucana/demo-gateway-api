package br.com.teste;

import java.util.List;
import java.util.stream.Collectors;

public class UserDTO {
    private String name;
    private Integer age;
    private List<GroupDTO> groupDTOs;

    public UserDTO(User user) {
        this.name = user.getNome();
        this.age = user.getIdade();
        this.groupDTOs = user.getGroups() != null ? user.getGroups().stream().map(GroupDTO::new).collect(Collectors.toList()) : null;
    }

    public UserDTO() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<GroupDTO> getGroupDTOs() {
        return groupDTOs;
    }

    public void setGroupDTOs(List<GroupDTO> groupDTOs) {
        this.groupDTOs = groupDTOs;
    }
}
