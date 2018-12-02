package com.pattern;

public class Main {
    public static void main(String[] args) {
        FruitFactory northFruitFactory = new NorthFruitFactory();//北方水果工厂
        Fruit northApple = northFruitFactory.getApple();//生产苹果
        northApple.pick();
        Fruit northBanana = northFruitFactory.getBanana();//生产香蕉
        northBanana.pick();

        FruitFactory southFruitFactory = new SouthFruitFactory();//南方水果工厂
        Fruit southApple = southFruitFactory.getApple();//生产苹果
        southApple.pick();
        Fruit southBanana = southFruitFactory.getBanana();//生产香蕉
        southBanana.pick();
    }
}
