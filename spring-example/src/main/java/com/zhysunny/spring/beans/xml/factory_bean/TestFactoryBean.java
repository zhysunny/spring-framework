package com.zhysunny.spring.beans.xml.factory_bean;

import com.zhysunny.spring.beans.xml.pojo.BaseBean;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 章云
 * @date 2020/3/25 16:18
 */
public class TestFactoryBean implements FactoryBean<BaseBean> {

    private String instanceInfo;

    @Override
    public BaseBean getObject() throws Exception {
        BaseBean bean = new BaseBean();
        String[] split = instanceInfo.split(",");
        bean.setId(Long.parseLong(split[0]));
        bean.setName(split[1]);
        bean.setAge(Integer.parseInt(split[2]));
        return bean;
    }

    @Override
    public Class<?> getObjectType() {
        return BaseBean.class;
    }

    public String getInstanceInfo() {
        return instanceInfo;
    }

    public void setInstanceInfo(String instanceInfo) {
        this.instanceInfo = instanceInfo;
    }

}
