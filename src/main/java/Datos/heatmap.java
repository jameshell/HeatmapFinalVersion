/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author james
 */
public class heatmap {
    long x=0;
    float ejeX;
    float ejeY;
    float temperatura;
    float humedad;

    public heatmap(Timestamp d,float temperatura, float ejeX, float ejeY, float humedad) {
         Timestamp tod=d;
        TimeZone t=TimeZone.getTimeZone("UTC-5");
        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        sdf.setTimeZone(t);
        Date d1=new Date(sdf.format(tod));
        x =d1.getTime();
        this.ejeX = ejeX;
        this.ejeY = ejeY;
        this.temperatura = temperatura;
        this.humedad = humedad;
    }

    public long getX() {
        return x;
    }

    public void setX(long x) {
        this.x = x;
    }

    public float getEjeX() {
        return ejeX;
    }

    public void setEjeX(float ejeX) {
        this.ejeX = ejeX;
    }

    public float getEjeY() {
        return ejeY;
    }

    public void setEjeY(float ejeY) {
        this.ejeY = ejeY;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getHumedad() {
        return humedad;
    }

    public void setHumedad(float humedad) {
        this.humedad = humedad;
    }
    
    

    @Override
    public String toString() {
        return "heatmap{" + "x=" + x + ", ejeX=" + ejeX + ", ejeY=" + ejeY + ", temperatura=" + temperatura + ", humedad=" + humedad +'}';
    }
    
    
}
