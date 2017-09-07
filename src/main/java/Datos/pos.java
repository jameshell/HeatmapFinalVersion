/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 *
 * @author Carlos
 */
public class pos {
    long x=0;
    float y=0;

    @Override
    public String toString() {
        return "pos{" + "x=" + x + ", y=" + y + '}';
    }
    public pos(float f,Timestamp d) {
        Timestamp tod=d;
        TimeZone t=TimeZone.getTimeZone("UTC-5");
        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        sdf.setTimeZone(t);
        Date d1=new Date(sdf.format(tod));
        x =d1.getTime();
        y=f;
    }

    public void setX(long x) {
        this.x = x;
    }

    public long getX() {
        return x;
    }


    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
