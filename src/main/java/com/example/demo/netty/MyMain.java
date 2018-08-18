package com.example.demo.netty;

/**
 * @Author YXG
 * @Date 2018-08-13 17:27
 */
public class MyMain {
    public static void main(String[] args) {
        System.out.println("MyMain.main");
        
        System.out.println("not bug");

        System.out.println("master ");


        System.out.println("args = " + args);

        System.out.println("hot fix");


        System.out.println("hot fix2");
        String[] strings = new String[9];
        
        strings[0] = "a";

        for (String string : strings) {

            System.out.println("string = " + string);
            
        }
    }
}
