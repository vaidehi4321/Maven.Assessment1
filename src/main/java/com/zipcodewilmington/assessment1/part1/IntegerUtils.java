package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sumOfNumbers=0;
        for(int i=1; i<=n; i++){
            sumOfNumbers=sumOfNumbers+i;
        }

        return sumOfNumbers;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int productOfNumbers=1;
        for(int i=1; i<=n; i++){
            productOfNumbers=productOfNumbers*i;
        }


        return productOfNumbers;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        int rev=0;
        while(val!=0){
            int digit=val%10;
            rev=rev*10+digit;
            val=val/10;
        }





        return rev ;
    }
}
