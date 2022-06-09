package com.company;

public class Hen extends Animal implements Printable {
    private int weight;

    public int getWeight() {
        return weight;
    }

    public Hen(int age, String name, int weight) {
        super(age, name);
        this.weight = weight;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() + "\nAge: " + getAge() + "\nWeight: " + getWeight() );

    }
}
