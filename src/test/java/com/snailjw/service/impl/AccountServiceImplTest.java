package com.snailjw.service.impl;

import com.snailjw.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountServiceImplTest {

    @Autowired
    private AccountService service;
    @Test
    void findByUsername() {
        System.out.println(service.findByUsername("ls"));
    }
}