package Dao;


import Datos.pos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class DaoLuz {

    public DaoLuz() {
    }
    
    public ArrayList<pos> busqueda() {
    ArrayList<pos> ans=new ArrayList();
        try
    { 
        Class.forName("com.mysql.jdbc.Driver").newInstance();
      String myUrl = "jdbc:mysql://localhost:3306/Edison?useLegacyDatetimeCode=false&serverTimezone=UTC";
      Connection conn = DriverManager.getConnection(myUrl, "root", "root");
      String query = "SELECT lux,hora FROM DatosEdison order by id desc limit 50";
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(query);
      while (rs.next())
      {
        Timestamp d=rs.getTimestamp("hora");
        float f=rs.getFloat("lux");
        pos p=new pos(f, d);
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
