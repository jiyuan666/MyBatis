package com.example.mybatis.service;

import com.example.mybatis.bean.Account;
import com.example.mybatis.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;
    public List<Account> getAllAccounts(){
        return accountMapper.getAllAccounts();
    }
}
