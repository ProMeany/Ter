package com.company;

public class Dog {
    private String name;
    private int age;

    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public int pesAgeSeven() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog: " +
                "Name = '" + name + '\'' +
                ", Age = " + age +", "+
                "HumanAge = "+age*7;
    }
}
