package com.bala.ArrayOperations;

import com.bala.StringOperations.StringOps;

import java.util.Arrays;
import java.util.List;

public class ArrayOptions2 {
    public void ArrayOptions2(){
       Integer baseNumbers[] = { 30, 40, 20, 70, 50, 60};
        Arrays.sort(baseNumbers);
        System.out.println("----------------------------");
        System.out.println("\tlength : "+ baseNumbers.length);
        for(int i: baseNumbers){
           System.out.print("\t" + i);
        }

        System.out.println("\n------------method 1----------------"); //need to understand to know more
        // convert int array to String array in Java
        int[] favouriteNumber = { 25, 65, 15, 35, 85, 65 };
        String favouriteNumberString[] = Arrays.stream(favouriteNumber).mapToObj(String::valueOf).toArray(String[]::new);
        System.out.println( "\n\tlength of favouriteNumberString : "+ favouriteNumberString.length ) ;
        for(String charValue: favouriteNumberString){
            System.out.print("\t" + charValue);
        }

        System.out.println("\n------------method 2----------------");
        // convert int array to String array in Java
        int[] favNumber = { 23, 63, 13 , 33, 83, 63, 53 };
        String favNumberString[] = new String[favNumber.length];
        for (int i = 0; i < favNumber.length; i++ ){
            favNumberString[i] = String.valueOf( favNumber[i]);
        }
        System.out.print("\n\t"+Arrays.toString(favNumberString));

        System.out.println("\n------------method 3 ----------this is not recommended way------");
        // convert int array to String array in Java
        int[] iceNumber = { 22, 62, 12, 32, 82, 62, 52 };
        String iceNumberString = Arrays.toString(iceNumber).replaceAll("\\s+","");
        System.out.println("The length of iceNumber : " + iceNumber.length + " and actual string is :" + iceNumber);
        System.out.println("The length of iceNumberString: " + iceNumberString.length() + " and actual string is :" + iceNumberString.toUpperCase());
        String iceNumberArray[] = iceNumberString.substring(1,(iceNumberString.length() -1)).split(",");
        for (String k: iceNumberArray ){
            System.out.print("\t"+k);
        }



    }

}
