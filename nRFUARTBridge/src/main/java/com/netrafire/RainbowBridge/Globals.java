
package com.netrafire.RainbowBridge;

import android.app.Application;

public class Globals extends Application {

    private static String rx= "6e400002-b5a3-f393-e0a9-e50e24dcca9e";
    private static String svc= "6e400001-b5a3-f393-e0a9-e50e24dcca9e";
    private static String tx= "6e400003-b5a3-f393-e0a9-e50e24dcca9e";

    public String getrx(){
        return this.rx;
    }

    public void setrx(String r){
        this.rx=r;
    }

    public String getsvc(){
        return this.svc;
    }

    public void setsvc(String s){
        this.svc=s;
    }

    public String gettx(){
        return this.tx;
    }

    public void settx(String t){
        this.rx=t;
    }


}