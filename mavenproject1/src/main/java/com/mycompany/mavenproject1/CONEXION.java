/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author aezeq11
 */
public class CONEXION {

    private String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private String url = "jdbc:sqlserver://localhost:1433;databaseName=Northwind";
    private String user = "sa";
    private String pass = "123456";

    CONEXION() {
    }

    public Connection conectar() {
        try {
                        System.out.println("EXITO");
            Class.forName(driver);
            return (DriverManager.getConnection(url, user, pass));
        } catch (Exception e) {

        }
        return null;
    }

    public void CerrarConexion(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
        }
    }
}
