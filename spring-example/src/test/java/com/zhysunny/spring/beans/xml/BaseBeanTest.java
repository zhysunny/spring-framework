package com.zhysunny.spring.beans.xml;

import com.zhysunny.spring.beans.xml.pojo.BaseBean;
import org.junit.*;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import static org.junit.Assert.*;

/**
 * BaseBeanTest Test.
 * @author 章云
 * @date 2020/3/24 11:20
 */
public class BaseBeanTest {

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Test BaseBeanTest Class Start...");
    }

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Test BaseBeanTest Class End...");
    }

    @Test
    public void testHelloBeans() throws Exception {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans/base/base-beans.xml"));
        BaseBean test = (BaseBean)factory.getBean("test");
        assertEquals(test.getId(), 14);
        assertEquals(test.getName(), "zhysunny");
        assertEquals(test.getAge(), 0);
    }

    @Test
    public void testAlias() throws Exception {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans/base/base-beans.xml"));
        BaseBean test = (BaseBean)factory.getBean("test");
        BaseBean test0 = (BaseBean)factory.getBean("test0");
        assertEquals(test, test0);
    }

    @Test
    public void testImport() throws Exception {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans/base/base-beans.xml"));
        BaseBean test = (BaseBean)factory.getBean("test1");
        assertEquals(test.getId(), 1);
        assertNull(test.getName());
        assertEquals(test.getAge(), 0);
    }

}
