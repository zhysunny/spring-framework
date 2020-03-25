package com.zhysunny.spring.beans;

import org.junit.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import static org.junit.Assert.*;

/**
 * MyBeanTest Test.
 * @author 章云
 * @date 2020/3/24 11:20
 */
public class MyBeanTest {

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Test MyBeanTest Class Start...");
    }

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Test MyBeanTest Class End...");
    }

    @Test
    public void testXmlBeanFactory() throws Exception {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans/MyBeanTest.xml"));
        TestBean test = (TestBean)factory.getBean("com.zhysunny.spring.beans.TestBean#0");
        assertEquals(test.getId(), 14);
        assertEquals(test.getName(), "zhysunny");
        assertEquals(test.getAge(), 0);
        System.out.println(test);
    }

}
