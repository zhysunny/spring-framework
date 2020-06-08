package com.zhysunny.spring.aop.aspectj;

/**
 * @author 章云
 * @date 2020/6/8 22:54
 */
public class Demo {
    static Demo d;

    public static void main(String[] args){
        new Demo().go();
    }

    void go(){
        d = new Demo();
        //调用foo方法
        d.foo(1,d);
        //调用bar方法
        System.out.println(d.bar(new Integer(3)));
    }

    void foo(int i, Object o){
        //打印foo
        System.out.println("Demo.foo(" + i + ", " + o + ")\n");
    }

    String bar (Integer j){
        System.out.println("Demo.bar(" + j + ")\n");
        return "Demo.bar(" + j  + ")";
    }
}
