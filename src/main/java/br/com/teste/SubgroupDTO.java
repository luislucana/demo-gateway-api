package br.com.teste;

public class SubgroupDTO {
    private String name;
    private String code;

    public SubgroupDTO(Subgroup subgroup) {
        this.name = subgroup.getNome();
        this.code = subgroup.getCodigo();
    }

    public SubgroupDTO() {

    }

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
}
