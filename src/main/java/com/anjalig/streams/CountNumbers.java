package com.anjalig.streams;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
}

public class CountNumbers {
    public static void main(String[] args) throws IOException, ParseException {
//        System.out.println("Enter n");
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Arrays.asList(2,5,-6,-8,3,1,-3,0,0);

        Integer countNegative=0;
        Integer countPositive=0;
        Integer countZero=0;
        Integer total=arr.size();
        for(Integer value:arr){
            if(value < 0){
                countNegative+=1;}
             if(value > 0){
                countPositive+=1;}
             if(value == 0){
                countZero+=1;}
        }

        System.out.println();
        System.out.println(countNegative/total);
        System.out.println(countZero/total);
            String s="10:05:25 PM";
            SimpleDateFormat displayDate=new SimpleDateFormat("HH:mm:ss");
            SimpleDateFormat parseDate=new SimpleDateFormat("hh:mm:ss aa");
            Date date=parseDate.parse(s);
            System.out.println(displayDate.format(date));

    }
}
