/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.cinema.dao;

import java.sql.*;
public class AbstractDAOD {
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://bd9a6dbf222e94:deb3db86@us-cdbr-east-06.cleardb.net/heroku_33fd814061645e6?reconnect=true",
                    "bd9a6dbf222e94", "deb3db86");
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
