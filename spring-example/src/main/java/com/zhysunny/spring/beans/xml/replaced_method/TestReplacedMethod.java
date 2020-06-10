package com.zhysunny.spring.beans.xml.replaced_method;

import org.springframework.beans.factory.support.MethodReplacer;
import java.lang.reflect.Method;

/**
 * @author 章云
 * @date 2020/3/25 15:18
 */
public class TestReplacedMethod implements MethodReplacer {

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.println(obj);
        System.out.println(method.getName());
        System.out.println("已经替换方法");
        return null;
    }

}
