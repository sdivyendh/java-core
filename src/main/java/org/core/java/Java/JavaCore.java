package org.core.java.Java;

import java.util.List;
import java.util.stream.Collectors;

class Car {
        String model;
        int year;

    Car(String m,int y){
        model = m;
        year = y;
    }

    void display(){
        System.out.println("Model:" + model + "year:" + year);
    }

     List<String> names = List.of("Raj", "Rahul", "Amit");
     List<String> result = names.stream()
             .filter(name -> name.startsWith("R"))
             .collect(Collectors.toList());



    public static void main(String[] args){
        Car car1 = new Car("Tata Nano",1999);
        car1.display();
    }
}