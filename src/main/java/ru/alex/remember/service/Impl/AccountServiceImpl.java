package ru.alex.remember.service.Impl;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import ru.alex.remember.dto.AccountDto;
import ru.alex.remember.dto.AccountWithPasswordDto;
import ru.alex.remember.entity.Account;
import ru.alex.remember.entity.Role;
import ru.alex.remember.mapper.AccountMapper;
import ru.alex.remember.repository.AccountRepository;
import ru.alex.remember.service.AccountService;

@Service
@RequiredArgsConstructor
@Validated
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    @Override
    @Transactional
    //todo убрать добавление новой роли, просто хочу удостовериться что правильно настроил сщуности
    public AccountDto createAccount(@Valid AccountWithPasswordDto account) {
        Account savedAccount = accountMapper.toEntity(account);

        Role role = Role.builder().name("admin").build();
        role.addAccount(savedAccount);

        savedAccount.addRole(role);

        return accountMapper.toDto(accountRepository.save(savedAccount));
    }
}
