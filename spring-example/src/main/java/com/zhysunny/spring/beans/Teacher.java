package com.zhysunny.spring.beans;

/**
 * @author 章云
 * @date 2020/3/25 14:20
 */
public class Teacher extends User {

    @Override
    public void show() {
        System.out.println("I am Teacher");
    }

}
