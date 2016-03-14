package com.otsegosolutions.domain

import groovy.transform.ToString
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@ToString(excludes = 'id')
@Document(collection = "accounts")
class Account {

    @Id
    Long id
    String accountDesc
    String userId
    String passwordHint
    String pinHint
    String url
}
