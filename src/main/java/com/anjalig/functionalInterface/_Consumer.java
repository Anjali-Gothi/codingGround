package com.anjalig.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer anjali = new Customer("Anjali", "12345678");
        Customer anjali1 = new Customer("Anjali", "12345678");
        consumerFunc.accept(anjali);
        consumerFunc2.accept(anjali,anjali1);
    }
    static Consumer<Customer> consumerFunc = customer -> System.out.println("Hello "
            + customer.name + " number " + customer.number);
    static BiConsumer<Customer,Customer> consumerFunc2 = (customer1,customer2) -> System.out.println("Hello "
            + customer1.name + " number " + customer1.number+"\nHello again "+customer2.name+" with  number" +customer2.number);

    static class Customer{
        private String name;
        private String number;

        public Customer(String name, String number) {
            this.name = name;
            this.number = number;
        }
    }
}
