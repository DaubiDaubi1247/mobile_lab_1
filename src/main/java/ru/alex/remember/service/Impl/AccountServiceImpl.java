package ru.alex.remember.service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import ru.alex.remember.dto.AccountDto;
import ru.alex.remember.dto.AccountWithPasswordDto;
import ru.alex.remember.repository.AccountRepository;
import ru.alex.remember.service.AccountService;

@Service
@RequiredArgsConstructor
@Validated
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public AccountDto createAccount(AccountWithPasswordDto account) {
        return null;
    }
}
