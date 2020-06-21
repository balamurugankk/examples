package com.bala.loops;

public class Loops {
    public void forLoop(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }
    }

    public void foreachLoop() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }

    public void whileLoop(){
        int i = 0 ;
        while( i <= 5){
            System.out.println("while value :" + i);
            i++;
        }
    }

    public void doWhileLoop(){
        int i = 0 ;
        do {
            System.out.println("do while value :" + i);
            i++;
        } while( i <= 5);
    }
}
