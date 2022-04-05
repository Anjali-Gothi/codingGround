package com.anjalig;


import com.anjalig.imperative.MainApp;

import java.util.List;
import java.util.stream.Collectors;

import static com.anjalig._Stream.Gender.*;


public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Anjali", FEMALE),
                new Person("Isha", FEMALE),
                new Person("Parth", MALE),
                new Person("Someone", OTHER),
                new Person("Someone2", OTHER),
                new Person("Papa", MALE)
        );
        people.stream()
                .dropWhile(p->p.name.startsWith("A"))
                .forEach(System.out::println);
    }
    static  class  Person{
        private final String name;
        private final _Stream.Gender gender;

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
