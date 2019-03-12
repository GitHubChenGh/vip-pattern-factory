package com.gupaoedu.vip.pattern.factory.method;

import com.gupaoedu.vip.pattern.factory.simple.ICourse;

/**
 * 工厂方法模式：
 * 优点：
 * 1.用户只需要关心所需产品对用的工厂，无需关心创建的细节。
 * 2.加入新产品符合开闭原则，提高了系统的可扩展性。
 * 缺点：
 * 1.类的个数容易过多，增加代码结构复杂度。
 * 2.增加了系统的抽象性和理解难度。
 * */
public class MethodTest {
    public static void main(String[] args) {
        ICourseFactory factory = new HistoryFactory();
        ICourse course = factory.course();
        System.out.println(course.getName());
    }
}
