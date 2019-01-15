package com.huibo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HelloWorld {

    public HelloWorld() {
    }

    @Override
    public String toString() {
        return "HelloWorld{}";
    }

    //这是单行注释
    public static void main(String[] args){
        test();

        Date date = new Date();
        System.out.println("ss");


        List<String> listaaa = new ArrayList<>();

        listaaa.add("1");
        System.out.println("hello world !!!");
        System.out.println();

        try {
            FileInputStream fileInputStream = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println("hello world !!!");




    }

    private static void test() {
        System.out.println("hello world !!!");
        System.out.println("hello world !!!");
    }

}
