package org.example.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    private static DbConnection dbConection;
    private Connection connection;
    private DbConnection() throws Exception {
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/ student","root","loshani@123");
    }
    public static DbConnection getInstance() throws Exception {
        if(dbConection==null){
            dbConection=new DbConnection();
        }
        return dbConection;
    }
    public Connection getConnection() {
        return connection;
    }
}
