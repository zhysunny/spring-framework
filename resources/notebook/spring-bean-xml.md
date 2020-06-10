# Spring Beans Xml配置

## 标签Element
* root标签为beans，属性profile用于开发环境和生产环境分开配置，spring通过spring.profiles.active来选择
* root下标签有bean、import、alias、beans，对beans标签使用递归解析
    * bean
        * id：beanName优先使用
        * name：id为空使用name
        * class：必填，创建对象的类