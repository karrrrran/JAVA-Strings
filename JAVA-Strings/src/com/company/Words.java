package com.company;

public class Words {
    public static void main(String[] args) {
        String word = "Java is a fun programming language.";
        String[] words = word.split("\\s+");

        System.out.println("Number of words in the string is: " + words.length);
    }
}
