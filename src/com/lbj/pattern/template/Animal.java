package com.lbj.pattern.template;

/**
 * 模板类
 * @author: libaijun
 * @create: 2019-08-30 22:47
 */
public abstract class Animal {

    /**
     * 模板方法,按照一定的顺序执行
     */
    public void show() {
        sit();
        System.out.println(getName() + "，我是一只可爱的小动物！");
        go();
    }

    public void sit() {
        System.out.println("坐下");
    }

    public void go() {
        System.out.println("走你");
    }

    public abstract String getName();

}
