package com.company;

public class Vowels {
    public static void main(String[] args) {
        String sentence = "My name is Karan";
        int count = 0;
        sentence = sentence.toLowerCase();

        for(char c : sentence.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }

        System.out.println("Number of Vowels : " + count);
    }
}
