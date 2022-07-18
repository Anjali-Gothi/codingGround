package com.anjalig;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DiagonalElementsDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        Integer sumD=0,sumR=0,differnce=0;
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.size();j++){
                if(i==j){
                    sumD+=arr.get(i).get(j);
                }
                if(i+j==arr.size()-1){
                    sumR+=arr.get(j).get(i);
                }
            }
        }

        System.out.println(sumD+" "+sumR);
        return Math.abs(sumD-sumR);
    }
    public static void main(String[] args) throws IOException {
        List<List<Integer>>arr=new ArrayList<>();
        List<Integer> a = Arrays.asList(11, 2, 4);
        List<Integer> b = Arrays.asList(4, 5, 6);
        List<Integer> c = Arrays.asList(10, 8, -10);
        arr.addAll(Arrays.asList(a,b,c));
//        arr.add(b);
//        arr.add(c);
        int result = DiagonalElementsDifference.diagonalDifference(arr);
        System.out.println(result);
    }
}
