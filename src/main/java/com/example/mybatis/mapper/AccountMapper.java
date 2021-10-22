package com.example.mybatis.mapper;

import com.example.mybatis.bean.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper {
    List<Account> getAllAccounts();

}
