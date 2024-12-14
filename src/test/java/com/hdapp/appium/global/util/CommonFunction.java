package com.hdapp.appium.global.util;

public class CommonFunction {

    public void getTerm(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
            System.out.println(milliseconds + "초가 지난 후 실행");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
