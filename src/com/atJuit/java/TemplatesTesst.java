package com.atJuit.java;

import com.juit.bean.Customer;

import java.util.ArrayList;

/**
 * @author Juit
 * @create 2020--04--28 10:14
 */
public class TemplatesTesst {

    private static final Customer  CUST = new Customer();

    public static final  Customer  CUST1 = new Customer();

    public static void main(String[] args) {

        System.out.println("hello!");

        int num = 10;

        String[] arr = new String[]{"Tom","jack","hanmeimei"};


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            System.out.println(s);
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(678);

        if (list == null) {

        }
        for (Object o : list) {
            
        }

    }
}
