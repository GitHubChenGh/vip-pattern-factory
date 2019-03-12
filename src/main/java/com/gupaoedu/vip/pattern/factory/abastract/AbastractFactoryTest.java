package com.gupaoedu.vip.pattern.factory.abastract;

import com.gupaoedu.vip.pattern.factory.simple.ICourse;

/**
 * 抽象工厂模式：是指提供一个创建一系列相关或互相依赖对象的接口，无须指定他们具体的类。
 *属于创建型设计模式
 * 优点：
 *      1.具体的产品在应用层代码隔离，无须关心创建细节
 *      2.将一个系列的产品族统一到一起创建
 * 缺点：
 *      1.规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口。
 *      2.增加了系统的抽象性和理解难度。
 * */
public class AbastractFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new HistoryFactory();
        factory.createNote().edit();
        ICourseFactory factory1 = new MathematicsFactory();
        factory1.creteVideo().record();
    }
}
