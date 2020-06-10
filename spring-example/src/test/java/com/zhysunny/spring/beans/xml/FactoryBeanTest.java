package com.zhysunny.spring.beans.xml;

import static org.junit.Assert.*;
import com.zhysunny.spring.beans.xml.pojo.BaseBean;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * FactoryBeanTest Test.
 * @author 章云
 * @date 2020/3/25 16:22
 */
public class FactoryBeanTest {

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Test FactoryBeanTest Class Start...");
    }

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Test FactoryBeanTest Class End...");
    }

    @Test
    public void testFactoryBean() throws Exception {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans/FactoryBeanTest.xml");
        BaseBean bean = ac.getBean("test", BaseBean.class);
        assertEquals(bean.getId(), 111);
        assertEquals(bean.getName(), "name");
        assertEquals(bean.getAge(), 11);
        System.out.println(bean);
    }

}
