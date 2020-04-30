package com.wiley.main;

import com.wiley.functions.Basic;

public class Application {

    public static void main(String[] args) {
        Basic basic = new Basic();
        long input1 = Long.parseLong(args[0]);
        long input2 = Long.parseLong(args[1]);
        System.out.println(basic.add(input1, input2));
    }
}
