package com.company;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Zoopark zoo = new Zoopark();
        zoo.newSob("Bobik", 1);
        zoo.newSob("Sharik", 3);
        zoo.newSob("Brat", 5);
        zoo.allInfo();
    }
}
