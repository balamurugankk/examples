package com.bala.math;

public class InfiniteLoops {

    public void ForLoopInfinite(){
        for (;;) {
            System.out.println("this is for loops test ..");
            try {
                Thread.sleep(15000);
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public void WhileLoopInfinite(){
        while(true){
            System.out.println("This is while loops test ...");
            try{
                Thread.sleep(15000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }

}
