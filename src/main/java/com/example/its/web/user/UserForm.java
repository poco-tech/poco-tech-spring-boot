package com.example.its.web.user;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class UserForm {

    @NotBlank
    private String username;

    @NotBlank
    private String password;

}
