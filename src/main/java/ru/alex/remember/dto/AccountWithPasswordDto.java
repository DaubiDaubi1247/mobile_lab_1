package ru.alex.remember.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class AccountWithPasswordDto extends AccountDto{

    @NotBlank(message = "password must be not null and not empty")
    private String password;
}
