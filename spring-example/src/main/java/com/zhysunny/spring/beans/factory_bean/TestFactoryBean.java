package com.zhysunny.spring.beans.factory_bean;

import com.zhysunny.spring.beans.TestBean;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 章云
 * @date 2020/3/25 16:18
 */
public class TestFactoryBean implements FactoryBean<TestBean> {

    private String instanceInfo;

    @Override
    public TestBean getObject() throws Exception {
        TestBean bean = new TestBean();
        String[] split = instanceInfo.split(",");
        bean.setId(Long.parseLong(split[0]));
        bean.setName(split[1]);
        bean.setAge(Integer.parseInt(split[2]));
        return bean;
    }

    @Override
    public Class<?> getObjectType() {
        return TestBean.class;
    }

    public String getInstanceInfo() {
        return instanceInfo;
    }

    public void setInstanceInfo(String instanceInfo) {
        this.instanceInfo = instanceInfo;
    }

}
