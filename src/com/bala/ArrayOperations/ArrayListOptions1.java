package com.bala.ArrayOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListOptions1 {
    public void ArrayListOptions1() {
        System.out.println("\n----------------------------");
        Integer[] hotNumbers = new Integer[] { 502, 202, 802, 402 };
        List<Integer> hotNumbersList = Arrays.asList(hotNumbers);
        for (int j : hotNumbersList) {
            System.out.print("\t" + j);
        }

        System.out.println("\n---------adding to List--------------");
//      hotNumbersList.add(602); // will error to validate uncomment
//      hotNumbersList.add(302);
        Integer[] coolNumbers = new Integer[] { 503,403,202,103,703 };
        List<Integer> coolNumbersList = new ArrayList<>(Arrays.asList(coolNumbers));

        coolNumbersList.add(803);
        coolNumbersList.add(603);
        for(int k = 0 ; k < coolNumbersList.size(); k++){
            System.out.print("\t"+ coolNumbersList.get(k));
        }

    }
}
