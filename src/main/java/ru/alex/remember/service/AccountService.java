package ru.alex.remember.service;

import jakarta.validation.Valid;
import ru.alex.remember.dto.AccountDto;
import ru.alex.remember.dto.AccountWithPasswordDto;

public interface AccountService {

    AccountDto createAccount(@Valid AccountWithPasswordDto account);
}
