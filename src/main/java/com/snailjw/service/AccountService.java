package com.snailjw.service;

import com.snailjw.entity.Account;

public interface AccountService {
    Account findByUsername(String username);
}
