package ru.alex.remember.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.alex.remember.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
}
