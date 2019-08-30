package com.lbj.pattern.template;

/**
 * 模板类
 * @author: libaijun
 * @create: 2019-08-30 22:47
 */
public abstract class Animal {

    public abstract String getName();


    public void show() {
        System.out.println(getName() + "，我是一只可爱的小动物！");
    }

}
