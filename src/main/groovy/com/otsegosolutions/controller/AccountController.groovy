package com.otsegosolutions.controller

import com.otsegosolutions.domain.Account
import com.otsegosolutions.service.AccountService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
@EnableAutoConfiguration
@RequestMapping('/accounts')
@SpringBootApplication
class AccountController {


    @Autowired
    AccountService service

    @RequestMapping(value = '/', method = RequestMethod.GET)
    ResponseEntity<List<Account>> findAll() {
        List<Account> accounts = service.findAll()
        return new ResponseEntity<List<Account>>(accounts, accounts ? HttpStatus.OK : HttpStatus.NOT_FOUND)
    }

    @RequestMapping(value = '/{accountDesc}', method = RequestMethod.GET)
    ResponseEntity<Account> findByAccountDesc(@PathVariable String accountDesc) {
        Account account = service.findByAccountDesc(accountDesc)
        return new ResponseEntity<Account>(account, account ? HttpStatus.OK : HttpStatus.NOT_FOUND)
    }


}
