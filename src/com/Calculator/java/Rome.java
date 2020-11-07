package com.Calculator.java;

public enum Rome {
    X(10),IX(9),VIII(8),VII(7),VI(6),V(5),IV(4),III(3),II(2),I(1);
    private int num;
    private Rome(int num){
        this.num=num;
    }
public int getnum(){
       return num;
}
}
