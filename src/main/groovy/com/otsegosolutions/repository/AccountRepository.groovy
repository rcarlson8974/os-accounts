package com.otsegosolutions.repository

import com.otsegosolutions.domain.Account
import org.springframework.data.mongodb.repository.MongoRepository

interface AccountRepository extends MongoRepository<Account, Long>{

    List<Account> findAll()
}