package com.gupaoedu.vip.pattern.factory.method;


import com.gupaoedu.vip.pattern.factory.simple.History;
import com.gupaoedu.vip.pattern.factory.simple.ICourse;

public class HistoryFactory implements ICourseFactory {

    public ICourse course() {
        return new History();
    }
}
