package br.com.norton.Entities.User;

import lombok.Data;

import java.util.List;

@Data
public class User {

    private Long ID_USER;
    private String NOM_USUARIO;
    private String NOM2_USUARIO;

    private Timeline TIMELINE;
    private List<Permission> PERMISSION;

}
