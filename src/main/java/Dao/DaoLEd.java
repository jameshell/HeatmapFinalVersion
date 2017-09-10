/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class DaoLEd {
   public void Encendido() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
                  Class.forName("com.mysql.jdbc.Driver").newInstance();

       String url = "jdbc:mysql://localhost:3306/Edison?useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "root";
        String password = "root";
        try (Connection connection = (Connection) DriverManager.getConnection(url, username, password)) {
            String query = " insert into Led (estado)"
        + " values (?)";
        PreparedStatement preparedStmt = connection.prepareStatement(query);
        preparedStmt.setInt(1, 1);
        preparedStmt.execute();
        connection.close();
        System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
   }
   public void Apagado() throws InstantiationException, ClassNotFoundException, IllegalAccessException{
                  Class.forName("com.mysql.jdbc.Driver").newInstance();

              String url = "jdbc:mysql://localhost:3306/Edison?useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "root";
        String password = "root";
        try (Connection connection = (Connection) DriverManager.getConnection(url, username, password)) {
            String query = " insert into Led (estado)"
        + " values (?)";
        PreparedStatement preparedStmt = connection.prepareStatement(query);
        preparedStmt.setInt(1, 0);
        preparedStmt.execute();
        connection.close();
        System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
   }
}
