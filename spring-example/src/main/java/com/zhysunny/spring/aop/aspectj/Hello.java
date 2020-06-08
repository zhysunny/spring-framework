package com.zhysunny.spring.aop.aspectj;

/**
 * @author 章云
 * @date 2020/6/8 23:25
 */
public class Hello {
    public void sayHello() {
        System.out.println("Hello, AspectJ!");
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.sayHello();
    }
}
