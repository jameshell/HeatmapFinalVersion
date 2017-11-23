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
public class heatmap2 {
    long fecha1=0;
    long fecha2=0;
    long fecha3=0;
    float ejeX;
    float ejeY;
    float temperatura;
    float humedad;
    float ejeX2;
    float ejeY2;
    float temperatura2;
    float humedad2;
    float ejeX3;
    float ejeY3;
    float temperatura3;
    float humedad3;

    public heatmap2(Timestamp a,float ejeX, float ejeY, float temperatura, float humedad,Timestamp b, float ejeX2, float ejeY2, float temperatura2, float humedad2, Timestamp c, float ejeX3, float ejeY3, float temperatura3, float humedad3) {
        
        Timestamp tod=a;
        
        TimeZone t=TimeZone.getTimeZone("UTC-5");
        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        sdf.setTimeZone(t);
        
        //formateo del tiempo
        Date a1=new Date(sdf.format(tod));
        Date b1=new Date(sdf.format(tod));
        Date c1=new Date(sdf.format(tod));
        
        //Fechas para conseguir el tiempo
        fecha1 = a1.getTime();
        fecha2 = b1.getTime();
        fecha3 = c1.getTime();
        
        
        
        this.ejeX = ejeX;
        this.ejeY = ejeY;
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.ejeX2 = ejeX2;
        this.ejeY2 = ejeY2;
        this.temperatura2 = temperatura2;
        this.humedad2 = humedad2;
        this.ejeX3 = ejeX3;
        this.ejeY3 = ejeY3;
        this.temperatura3 = temperatura3;
        this.humedad3 = humedad3;
    }
    
    
    
    
    
    public long getFecha1() {
        return fecha1;
    }

    public void setFecha1(long fecha1) {
        this.fecha1 = fecha1;
    }

    public long getFecha2() {
        return fecha2;
    }

    public void setFecha2(long fecha2) {
        this.fecha2 = fecha2;
    }

    public long getFecha3() {
        return fecha3;
    }

    public void setFecha3(long fecha3) {
        this.fecha3 = fecha3;
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

    public float getEjeX2() {
        return ejeX2;
    }

    public void setEjeX2(float ejeX2) {
        this.ejeX2 = ejeX2;
    }

    public float getEjeY2() {
        return ejeY2;
    }

    public void setEjeY2(float ejeY2) {
        this.ejeY2 = ejeY2;
    }

    public float getTemperatura2() {
        return temperatura2;
    }

    public void setTemperatura2(float temperatura2) {
        this.temperatura2 = temperatura2;
    }

    public float getHumedad2() {
        return humedad2;
    }

    public void setHumedad2(float humedad2) {
        this.humedad2 = humedad2;
    }

    public float getEjeX3() {
        return ejeX3;
    }

    public void setEjeX3(float ejeX3) {
        this.ejeX3 = ejeX3;
    }

    public float getEjeY3() {
        return ejeY3;
    }

    public void setEjeY3(float ejeY3) {
        this.ejeY3 = ejeY3;
    }

    public float getTemperatura3() {
        return temperatura3;
    }

    public void setTemperatura3(float temperatura3) {
        this.temperatura3 = temperatura3;
    }

    public float getHumedad3() {
        return humedad3;
    }

    public void setHumedad3(float humedad3) {
        this.humedad3 = humedad3;
    }

    @Override
    public String toString() {
        return "heatmap2{" + "fecha1=" + fecha1 + ", fecha2=" + fecha2 + ", fecha3=" + fecha3 + ", ejeX=" + ejeX + ", ejeY=" + ejeY + ", temperatura=" + temperatura + ", humedad=" + humedad + ", ejeX2=" + ejeX2 + ", ejeY2=" + ejeY2 + ", temperatura2=" + temperatura2 + ", humedad2=" + humedad2 + ", ejeX3=" + ejeX3 + ", ejeY3=" + ejeY3 + ", temperatura3=" + temperatura3 + ", humedad3=" + humedad3 + '}';
    }
    
    
    
    
}
