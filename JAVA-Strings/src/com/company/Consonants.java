package com.company;

public class Consonants {
    public static void main(String[] args) {
        String word = "Flabbergasted";
        int count = 0;
        word = word.toLowerCase();
        char c[] = word.toCharArray();

        for(int i=0; i<c.length; i++){
            if(c[i] != 'a' && c[i] != 'e' && c[i] != 'i' && c[i] != 'o' && c[i] != 'u'){
                count++;
                c[i] = '*';
            }
        }

        System.out.println("Number of Consonants : " + count);

        System.out.print("New Word : ");
        for(int i=0; i<c.length; i++)
            System.out.print(c[i]);
    }
}
