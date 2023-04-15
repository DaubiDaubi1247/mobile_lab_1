package ru.alex.remember.dto;

import jakarta.validation.constraints.NotBlank;

public class AccountWithPasswordDto extends AccountDto{

    @NotBlank(message = "password must be not null and not empty")
    private String password;
}
