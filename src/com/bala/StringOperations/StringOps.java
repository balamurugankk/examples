package com.bala.StringOperations;

public class StringOps {

    public void Operation1() {
        String statement = "This is my example statements of java";
        System.out.println(statement.toUpperCase());
        System.out.println(statement.toLowerCase());
        System.out.println(statement.contains("java"));
        System.out.println("-------------------------------");
        System.out.println(statement.matches("This is my example statements"));
        System.out.println(statement.matches("This is my example statements of java"));
        System.out.println(statement.compareTo("This is my example statements"));
        System.out.println(statement.compareTo("This is my example statements of java"));
        System.out.println("-------------------------------");
        System.out.println(statement.replaceAll("is","are"));
        System.out.println(statement.replace("example","sample"));
        System.out.println(statement.concat(" and my concat example"));
        System.out.println("-------------------------------");
        System.out.println(statement.charAt(0));
        System.out.println(statement.charAt(1));
        System.out.println(statement.charAt(3));
        System.out.println("-------------------------------");
        System.out.println(statement.length());
        System.out.println(statement.isEmpty());
        System.out.println(statement.indexOf(10)); // need to know more
        System.out.println("-------------------------------");
        System.out.println(statement.hashCode()); //need to know more
        String[] statementInString =  statement.split("my"); // need to know more
        System.out.println(statementInString);
        statementInString =  statement.split(statement,7); // need to know more
        System.out.println(statementInString);
        System.out.println("-------------------------------");
        char[] statementInChars = statement.toCharArray();
        for (char value:statementInChars) {
            System.out.print(value+"\t");
        }
    }

}
