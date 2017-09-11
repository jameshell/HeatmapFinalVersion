/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Datos.Posi;
import Datos.Posicion;
import Datos.pos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author CARLOS
 */
public class DaoPos {

    public DaoPos() {
    }
    
    public ArrayList<Posi> busqueda() {
    ArrayList<Posi> ans=new ArrayList();
        try
    { 
        Class.forName("com.mysql.jdbc.Driver").newInstance();
      String myUrl = "jdbc:mysql://localhost:3306/Edison?useLegacyDatetimeCode=false&serverTimezone=UTC";
      Connection conn = DriverManager.getConnection(myUrl, "root", "root");
      String query = "SELECT posx,posy FROM DatosPi order by id desc limit 1";
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(query);
      while (rs.next())
      {
        int x=rs.getInt("posx");
        int y=rs.getInt("posy");
        Posi p=new Posi(x, y);
        ans.add(p);
      }
        rs.close();
         st.close();
         conn.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getCause());
    }
    
        return ans;
    }
}
