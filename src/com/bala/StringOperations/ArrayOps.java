package com.bala.StringOperations;

public class ArrayOps {

    public void ArrayOptions1(){
        String[] cars = { "VolksWagen", "Maruti", "Hyundai", "Audi" };
        System.out.println(cars[2]);
        System.out.println(cars.length);
        System.out.println("-----------------");
        int[] numberList = { 10, 54, 65, 34, 80, 20, 71 };
        System.out.println(numberList[2]);
        System.out.println(numberList.length);
        System.out.println("-----------------");
        String[] modelName = new String[10];
        modelName[0] = "polo";
        modelName[2] = "vento";
        modelName[1] = "jetta";
        System.out.println(modelName.length);
        System.out.println(modelName[2]);
    }

}


