package com.otsegosolutions.service

import com.otsegosolutions.domain.Account
import com.otsegosolutions.repository.AccountRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class AccountService {

    @Autowired
    AccountRepository repository

    List<Account> findAll() {
        return repository.findAll()
    }

    Account findByAccountDesc(String accountDesc) {
        return repository.findByAccountDesc(accountDesc)
    }
}
