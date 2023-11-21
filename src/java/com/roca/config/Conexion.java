/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.roca.config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ADMIN
 */
public class Conexion {
    Connection conex;
    String url = "jdbc:mysql://localhost:3306/bdordencompra?autoReconnect=true&useSSL=false";
    String user = "root";
    String pass = "nacional7";
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conex=DriverManager.getConnection(url,user,pass);
            System.out.println("conectado");
        } catch (Exception e) {
            System.err.println("Error" +e);
        }
        System.out.println("conectado");
        return conex;
        
    }
}
