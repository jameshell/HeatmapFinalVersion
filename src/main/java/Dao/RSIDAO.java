/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Datos.RSI;
import Datos.pos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class RSIDAO {

    public RSIDAO() {
    }
        public ArrayList<RSI> busqueda() {
    ArrayList<RSI> ans=new ArrayList();
        try
    { 
        Class.forName("com.mysql.jdbc.Driver").newInstance();
      String myUrl = "jdbc:mysql://localhost:3306/Edison?useLegacyDatetimeCode=false&serverTimezone=UTC";
      Connection conn = DriverManager.getConnection(myUrl, "root", "root");
      String query = "SELECT rssi_b1,rssi_b2,rssi_b3,rssi_b4,rssi_b5,rssi_b6,hora FROM DatosEdison order by id desc limit 100";
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(query);
      while (rs.next())
      {
        Timestamp d=rs.getTimestamp("hora");
        float b1=rs.getFloat("rssi_b1");
        float b2=rs.getFloat("rssi_b2");
        float b3=rs.getFloat("rssi_b3");
        float b4=rs.getFloat("rssi_b4");
        float b5=rs.getFloat("rssi_b5");
        float b6=rs.getFloat("rssi_b6");
        RSI rsi=new RSI(d, b1, b2, b3, b4, b5, b6);
        ans.add(rsi);
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
