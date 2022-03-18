package com.api.restapitutorial1.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class AddUserDTO {
    private String name;
    private String email;
    private String password;
    private String role;
}
