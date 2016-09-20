/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Интернет
 */
public class DBConnectionHelper {
    private static String dbName = "jdbc:sqlite:hospitalDB.db";
    private static String driver = "org.sqlite.JDBC";
    public static Connection getDBConnection() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver was not found!");
            return null;
        }   
        Connection conn;
        try {
            conn = DriverManager.getConnection(dbName);
        } catch (SQLException ex) {
            System.out.println("DB was not found!");
            return null;
        }
        return conn;
    }
}
