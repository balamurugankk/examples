package com.bala.conditional;

public class ConditionalStatements {

    public void ifElse() {
        int a = 10, b =15 ;
        if (a > b){
            System.out.println("a is bigger");
        } else {
            System.out.println("b is bigger");
        }

        a = 20; b = 18 ;
        if (a > b){
            System.out.println("a is bigger");
        } else {
            System.out.println("b is bigger");
        }
    }

    public void elseIf() {
        int a = 10, b =15 ,c =30;
        if (a > b){
            if (a > c){
                System.out.println("a is bigger");
            } else {
                System.out.println("c is bigger");
            }
        } else if(b > c) {
            System.out.println("b is bigger");
        } else {
            System.out.println("c is bigger");
        }
    }

    public void switchCase(){
        int day = 3;
        switch (day){
            case 1:
                System.out.println("this is case value1");
                break;
            case 2:
                System.out.println("this is case value2");
                break;
            case 3:
                System.out.println("this is case value3");
                break;
            default:
                System.out.println("this is case default if no matches");
        }
    }

    public void switchCaseString(){
        String day_of_week = "Tuesday";
        switch (day_of_week){
            case "Sunday":
                System.out.println("This is Sunday work schedule");
                break;
            case "Monday":
                System.out.println("This is Monday work schedule");
                break;
            case "Tuesday":
                System.out.println("This is Tuesday work schedule");
                break;
            case "Wednesday":
                System.out.println("This is Wednesday work schedule");
                break;
            case "Thursday":
                System.out.println("This is Thursday work schedule");
                break;
            case "Friday":
                System.out.println("This is Friday work schedule");
                break;
            case "Saturday":
                System.out.println("This is Saturday work schedule");
                break;
            default:
                System.out.println("This is default working schedule");
        }

    }
}
