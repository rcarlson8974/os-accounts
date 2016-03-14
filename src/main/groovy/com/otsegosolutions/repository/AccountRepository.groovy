package com.otsegosolutions.repository

import com.otsegosolutions.domain.Account
import org.springframework.data.mongodb.repository.MongoRepository

interface AccountRepository extends MongoRepository<Account, Integer>{
//interface AccountRepository extends JpaRepository<Account, Integer> {

//    List<Account> findAll()
//    Account save(Account account)
//    void delete(Integer id)
//    Account findByAccountDesc(String accountDesc)
}