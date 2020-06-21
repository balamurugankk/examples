package com.bala.StringOperations;

import java.util.Arrays;

public class StringOps {

    public void Operation1(){
        String statement = "This is my example statements of java";
        System.out.println(statement.toUpperCase());
        System.out.println(statement.toLowerCase());
        System.out.println(statement.contains("java"));
        System.out.println(statement.matches("This is my example statements"));
        System.out.println(statement.matches("This is my example statements of java"));
        System.out.println(statement.compareTo("This is my example statements"));
        System.out.println(statement.compareTo("This is my example statements of java"));
        System.out.println(statement.replaceAll("is","are"));
        System.out.println(statement.replace("example","sample"));
        System.out.println(statement.concat(" and my concat example"));
        System.out.println("-------------------------------");
        System.out.println(statement.charAt(0));
        System.out.println(statement.charAt(1));
        System.out.println(statement.charAt(2));
        System.out.println(statement.charAt(3));
        System.out.println("-------------------------------");
        System.out.println(statement.length());
        System.out.println(statement.isEmpty());
        System.out.println(statement.indexOf(10));
        System.out.println("-------------------------------");
        System.out.println(statement.hashCode());
        char[] statementInChars = statement.toCharArray();
        for (char value:statementInChars) {
            System.out.println(value);
        }

    }
}
