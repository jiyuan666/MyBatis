package com.example.mybatis.controller;

import com.example.mybatis.bean.Account;
import com.example.mybatis.bean.DataBaseLink;
import com.example.mybatis.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @ResponseBody
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public List<Account> get(){
        Connection conn= DataBaseLink.getConn();
        if(conn!=null){
            String sql="select name from account";
            try {
                PreparedStatement pst = conn.prepareStatement(sql);
                ResultSet results = pst.executeQuery();
                while (results.next()){
                    System.out.println(results.getString("name"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return accountService.getAllAccounts();
    }

}

