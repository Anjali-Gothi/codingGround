package com.anjalig.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
    int increment=incrementByOne.apply(1);
    int inc2=multiplyByTen.apply(increment);
        System.out.println(inc2);
        Function<Integer, Integer> addAndMultiply = incrementByOne.andThen(multiplyByTen);
        Integer result=addAndMultiply.apply(10);
        System.out.println("result "+result);
        Integer value=numberAddAndMultiply.apply(2,10);
        System.out.println("value "+value);

    }
    static Function<Integer,Integer>incrementByOne=number->number+1;
    static Function<Integer,Integer>multiplyByTen=number->number*10;
    static BiFunction<Integer, Integer, Integer> numberAddAndMultiply=(arg1,arg2)->(arg1+1)*arg2;

    static int increment(int number){
        return number+1;
    }
}
