package com.huibo;

import com.huibo.bean.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author davidlin
 * @description
 * @create 2019-01-15 10:34
 */
public class TemplateTest {

    public static final String abc = "";

    public static final Customer CUSTOMER = new Customer();
    public static final String NATION = "";



    public static void main(String[] args) {

        System.out.println("hello");
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");
        System.out.println("args = " + args);

        for (int i = 0; i < args.length; i++) {

        }

        for (String arg : args) {
            System.out.println(arg);
        }

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println("arg = " + arg);
        }

        List<String> arr = new ArrayList<>();
        arr.add("1");
        arr.add("2");
        arr.add("3");
        for (String s : arr) {

        }

        for (int i = 0; i < arr.size(); i++) {

        }

        for (int i = arr.size() - 1; i >= 0; i--) {

        }

        if (arr == null) {
        }

        if (args == null) {

        }

        if (arr != null) {

        }

        if (args != null) {

        }

        if (args == null) {

        }


    }

}
