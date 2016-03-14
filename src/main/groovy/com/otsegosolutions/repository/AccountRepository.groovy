package com.otsegosolutions.repository

import com.otsegosolutions.domain.Account
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface AccountRepository extends MongoRepository<Account, ObjectId>{

    List<Account> findAll()
}