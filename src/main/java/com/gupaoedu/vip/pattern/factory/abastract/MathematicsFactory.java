package com.gupaoedu.vip.pattern.factory.abastract;

public class MathematicsFactory implements ICourseFactory {
    public INote createNote() {
        return new MathematicsNote();
    }

    public IVideo creteVideo() {
        return new MathematicsVideo();
    }
}
