package com.company;

public class Palindrome {
    public static void main(String[] args) {
        String pal = "Malayalam";
        int check = 0;
        int i = 0, j = pal.length()-1;

        pal = pal.toLowerCase();

        while(i < j){
            if(pal.charAt(i) != pal.charAt(j)){
                check = 1;
                break;
            }
            i++;
            j--;
        }

        if(check == 0)
            System.out.println("Given string is a Palindrome!");
        else
            System.out.println("Given string is not a Palindrome!!");
    }
}
