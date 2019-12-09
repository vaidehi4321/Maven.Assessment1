package com.zipcodewilmington.assessment1.part5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Palindrome {

    public Integer countPalindromes(String input) {
        int counter = 0;
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < input.length(); i++){
            for(int j =i+1; j <=input.length(); j++){
                list.add(input.substring(i , j));
            }
        }
        //System.out.println(list);

        for(int i=0;i<list.size();i++){
            StringBuilder s = new StringBuilder(list.get(i));
            //String s1 = s.reverse().toString();
            //if(list.get(i).equals(s.reverse())){
            if (list.get(i).equals(s.reverse().toString())){
                counter=counter + 1;
            }
        }






        return counter;
    }
}
