package com.otsegosolutions.service

import org.springframework.stereotype.Service

@Service
class AccountService {

    String test()  {
        return "foo: ${new Date()}"
    }
}
