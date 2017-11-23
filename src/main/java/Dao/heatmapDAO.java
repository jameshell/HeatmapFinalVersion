/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Datos.heatmap;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author james
 */
public class heatmapDAO {
    public heatmapDAO() {
    }
    
    public ArrayList<heatmap> busqueda() {
    ArrayList<heatmap> ans=new ArrayList();
        try
    { 
        Class.forName("com.mysql.jdbc.Driver").newInstance();
      String myUrl = "jdbc:mysql://localhost:3306/Edison?useLegacyDatetimeCode=false&serverTimezone=UTC";
      Connection conn = DriverManager.getConnection(myUrl, "root", "root");
      String query = "SELECT temperatura,posicionX,posicionY,humedad,hora FROM Raspberry order by id desc limit 100";
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(query);
      while (rs.next())
      {
        Timestamp d=rs.getTimestamp("hora");
        float b1=rs.getFloat("temperatura");
        float b2=rs.getFloat("posicionX");
        float b3=rs.getFloat("posicionY");
        float b4=rs.getFloat("humedad");
        heatmap heat=new heatmap(d, b1, b2, b3, b4);
        ans.add(heat);
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
