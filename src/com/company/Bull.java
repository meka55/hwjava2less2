package com.company;

public class Bull extends Animal implements Printable{
    private int size;
    private String color;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bull(int age, String name, String color, int size) {
        super(age, name);
        this.color = color;
        this.size = size;
    }

    @Override
    public void print() {
        System.out.println("age " + getAge() + ", " + "\nName " + getName() + ", " + "\ncolor " + getColor() +
                ", " + "\nSize " + getSize());

    }
}
