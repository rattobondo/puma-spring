package it.quix.puma.pumaspring.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor
public class UserDTO {

    private String id;

    private String fullname;

    private String firstname;

    private String lastname;

    private String middlename;

    private String email;

}