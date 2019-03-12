package com.gupaoedu.vip.pattern.factory.simple;
/** 简单工厂负责创建对象较少的情况下
 * 工厂类的职责相对过重，增加新工厂还需要修改工厂类的判断
 * 不利于扩展
 * */
public class SimpleFactoryTest {
        public static void main(String[] args) {
            SimpleFactory factory = new SimpleFactory();
        ICourse history = factory.createInstance(History.class);
        System.out.println("创建的课程实例:" + history.getName());
        ICourse mathematics = factory.createInstance(Mathematics.class);
        System.out.println("创建的课程实例:" + mathematics.getName());


    }

}
