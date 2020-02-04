package br.com.teste;

import java.util.List;
import java.util.stream.Collectors;

public class GroupDTO {
    private String name;
    private String code;
    private List<SubgroupDTO> subgroupDTOs;

    public GroupDTO(Group group) {
        this.name = group.getNome();
        this.code = group.getCodigo();
        this.subgroupDTOs = group.getSubgroups() != null ? group.getSubgroups().stream().map(SubgroupDTO::new).collect(Collectors.toList()) : null;
    }

    public GroupDTO() {}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public GroupDTO(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public List<SubgroupDTO> getSubgroupDTOs() {
        return subgroupDTOs;
    }

    public void setSubgroupDTOs(List<SubgroupDTO> subgroupDTOs) {
        this.subgroupDTOs = subgroupDTOs;
    }
}
