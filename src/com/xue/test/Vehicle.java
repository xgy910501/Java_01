package com.xue.test;

/**
 * Created by Administrator on 2016/9/10.
 */
public class Vehicle {
    String type;
    String color;
    int size;
    double speed;
    boolean isPerson;

    public Vehicle(String type, String color, int size, double speed, boolean isPerson) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.speed = speed;
        this.isPerson = isPerson;
    }

    String  target(){
        return "北京";
    }
    int sum(){
        return 0;
    }

    void tansport(){

    }

    void run(){
        System.out.println("running");
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("汽车","白色",10,100,true);
        System.out.println(car.isPerson);
        System.out.println(car.color);
        System.out.println(car.type);
        car.run();
        System.out.println("去"+car.target());
    }

}
