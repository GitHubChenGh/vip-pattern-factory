package com.gupaoedu.vip.pattern.factory.simple;

public class SimpleFactory {

    /** 简单工厂负责创建对象较少的情况下
     * 工厂类的职责相对过重，增加新工厂还需要修改工厂类的判断
     * 不利于扩展
     * */
//    public static void main(String[] args) {
//        ICourse history = SimpleFactory.createInstance("history");
//        System.out.println("创建的课程实例:" + history.getName());
//        ICourse mathematics = SimpleFactory.createInstance("mathematics");
//        System.out.println("创建的课程实例:" + mathematics.getName());
//
//        ICourse test = SimpleFactory.createInstance("test");
//        System.out.println("创建的课程实例:" + test.getName());
//    }
//    public static ICourse createInstance(String type){
//        if("history".equals(type)){
//            return new History();
//        }else if("mathematics".equals(type)){
//            return new Mathematics();
//        }else{
//            throw new RuntimeException("type["+type+"]类型不可识别！");
//        }
//    }

    public ICourse createInstance(Class<? extends ICourse> clazz){
        try{
            if (null != clazz){
                return clazz.newInstance();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return  null;
    }

}
