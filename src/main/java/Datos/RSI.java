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
 * @author Carlos
 */
public class RSI {
    long x=0;
    float rssi_b1;
    float rssi_b2;
    float rssi_b3;
    float rssi_b4;
    float rssi_b5;
    float rssi_b6;

    public RSI(Timestamp d,float rssi_b1, float rssi_b2, float rssi_b3, float rssi_b4, float rssi_b5, float rssi_b6) {
        Timestamp tod=d;
        TimeZone t=TimeZone.getTimeZone("UTC-5");
        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        sdf.setTimeZone(t);
        Date d1=new Date(sdf.format(tod));
        x =d1.getTime();
        this.rssi_b1 = rssi_b1;
        this.rssi_b2 = rssi_b2;
        this.rssi_b3 = rssi_b3;
        this.rssi_b4 = rssi_b4;
        this.rssi_b5 = rssi_b5;
        this.rssi_b6 = rssi_b6;
    }

    public float getRssi_b1() {
        return rssi_b1;
    }

    public void setRssi_b1(float rssi_b1) {
        this.rssi_b1 = rssi_b1;
    }

    public float getRssi_b2() {
        return rssi_b2;
    }

    public void setRssi_b2(float rssi_b2) {
        this.rssi_b2 = rssi_b2;
    }

    public float getRssi_b3() {
        return rssi_b3;
    }

    public void setRssi_b3(float rssi_b3) {
        this.rssi_b3 = rssi_b3;
    }

    public float getRssi_b4() {
        return rssi_b4;
    }

    public void setRssi_b4(float rssi_b4) {
        this.rssi_b4 = rssi_b4;
    }

    public float getRssi_b5() {
        return rssi_b5;
    }

    public void setRssi_b5(float rssi_b5) {
        this.rssi_b5 = rssi_b5;
    }

    public float getRssi_b6() {
        return rssi_b6;
    }

    public void setRssi_b6(float rssi_b6) {
        this.rssi_b6 = rssi_b6;
    }

    @Override
    public String toString() {
        return "RSI{" + "x=" + x + ", rssi_b1=" + rssi_b1 + ", rssi_b2=" + rssi_b2 + ", rssi_b3=" + rssi_b3 + ", rssi_b4=" + rssi_b4 + ", rssi_b5=" + rssi_b5 + ", rssi_b6=" + rssi_b6 + '}';
    }
    
}
