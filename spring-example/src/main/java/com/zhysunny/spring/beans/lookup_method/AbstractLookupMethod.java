package com.zhysunny.spring.beans.lookup_method;

import com.zhysunny.spring.beans.User;

/**
 * @author 章云
 * @date 2020/3/25 14:40
 */
public abstract class AbstractLookupMethod {

    public void show() {
        this.getBean().show();
    }

    public abstract User getBean();

}
