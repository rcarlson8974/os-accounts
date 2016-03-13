package com.otsegosolutions.controller

import com.otsegosolutions.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@EnableAutoConfiguration
class AccountController {

    @Autowired
    AccountService service

    @RequestMapping("/")
    String home() {
        return service.test()
    }
}
