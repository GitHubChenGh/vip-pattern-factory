package com.gupaoedu.vip.pattern.factory.method;

import com.gupaoedu.vip.pattern.factory.simple.ICourse;
import com.gupaoedu.vip.pattern.factory.simple.Mathematics;

public class MathematicsFactory implements ICourseFactory {
    public ICourse course() {
        return new Mathematics();
    }
}
