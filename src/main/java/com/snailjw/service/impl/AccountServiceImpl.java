package com.snailjw.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.snailjw.entity.Account;
import com.snailjw.mapper.AccountMapper;
import com.snailjw.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper mapper;
    @Override
    public Account findByUsername(String username) {
        QueryWrapper wrapper =new QueryWrapper();
        wrapper.eq("username",username);
        return mapper.selectOne(wrapper);
    }
}
