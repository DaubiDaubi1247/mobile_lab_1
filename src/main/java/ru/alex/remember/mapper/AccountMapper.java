package ru.alex.remember.mapper;

import org.mapstruct.Mapper;
import ru.alex.remember.dto.AccountDto;
import ru.alex.remember.dto.AccountWithPasswordDto;
import ru.alex.remember.entity.Account;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    Account toEntity(AccountWithPasswordDto account);

    AccountDto toDto(Account account);
}
