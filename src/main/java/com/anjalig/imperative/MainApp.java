package com.anjalig.imperative;

import java.util.ArrayList;
import java.util.List;

import static com.anjalig.imperative.MainApp.Gender.*;

public class MainApp {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Anjali", FEMALE),
                new Person("Isha", FEMALE),
                new Person("Parth", MALE),
                new Person("Someone", OTHER),
                new Person("Someone2", OTHER),
                new Person("Papa", MALE)
        );
//        Imperative style
        List<Person> females=new ArrayList<>();
        for(Person p:people){
            if(FEMALE.equals(p.gender))
                females.add(p);
        }
        for(Person p:females){
            System.out.println(p);
        }
    }
    static  class  Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        FEMALE,MALE,OTHER
    }
}
