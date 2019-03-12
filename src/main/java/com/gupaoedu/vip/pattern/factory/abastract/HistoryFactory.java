package com.gupaoedu.vip.pattern.factory.abastract;

public class HistoryFactory implements ICourseFactory {
    public INote createNote() {
        return new HistoryNote();
    }

    public IVideo creteVideo() {
        return new HistoryVideo();
    }
}
