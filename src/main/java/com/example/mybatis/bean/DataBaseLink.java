package com.example.mybatis.bean;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseLink {
    static public Connection getConn() {
        String serverName="com.mysql.jdbc.Driver";
        String dbURL="jdbc:mysql://localhost:3306/demo01";
        String userName="root";
        String userPwd="306121";
        try {
            Class.forName(serverName);
            Connection tmp = DriverManager.getConnection(dbURL, userName, userPwd);
            System.out.println("成功连接数据库");
            return tmp;
        }
        catch(Exception e) {
            System.out.println("连接数据库失败");
            System.out.println(e);
        }
        return null;
    }
}
