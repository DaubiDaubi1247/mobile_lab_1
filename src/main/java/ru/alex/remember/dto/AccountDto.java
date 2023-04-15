package ru.alex.remember.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class AccountDto {

    @NotBlank(message = "name must be not null and not empty")
    private String name;

    @NotBlank(message = "role must be not null and not empty")
    private String role;

}
