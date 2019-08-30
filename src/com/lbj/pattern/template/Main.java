package com.lbj.pattern.template;

/**
 * 启动类
 * @author: libaijun
 * @create: 2019-08-30 22:51
 */
public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.show();

        Animal cat = new Cat();
        cat.show();
    }

}
