
package com.mycompany.networking;


public class Singleton{
    private static Singleton instance=new Singleton();
    private Singleton(){
    System.out.println("Hello world");
    }
    public static Singleton getinstance(){
        return instance;
    }
    public void getmessage(){
        System.out.println("YESS, I CAN DO IT");
    }
}

