package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {

        String camelCase = str.substring(0, 1).toUpperCase() + str.substring(1);



        return camelCase;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reverse="";
        for(int i=str.length()-1 ;i>=0 ;i--){
            reverse=reverse+str.charAt(i);
        }
        return reverse;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String rev=reverse(str);
        String revAndCamel=camelCase(rev);
        return revAndCamel;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String result="";
        for(int i=1;i<=str.length()-2;i++){
         result=result+str.charAt(i);
        }

        return result;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char [] chars=str.toCharArray();
        for(int i=0;i<chars.length;i++){
            char c=chars[i];
            if(Character.isUpperCase(c)){
                chars[i]=Character.toLowerCase(c);
            }
            else{
                chars[i]=Character.toUpperCase(c);
            }
        }


        return new String(chars);
    }
}
