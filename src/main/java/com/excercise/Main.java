package com.excercise;


public class Main {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter("sTreSS"));
    }
    public static String firstNonRepeatingLetter( String s){
        String [] byLetter=s.split("");
        String lowerCaseString=s.toLowerCase();

        for(int i=0;i<lowerCaseString.length();i++){
            String x=lowerCaseString.substring(i,i+1);
            if(lowerCaseString.indexOf(x)==lowerCaseString.lastIndexOf(x)){
                return byLetter[i];
            }
        }
        return "";

    }
}