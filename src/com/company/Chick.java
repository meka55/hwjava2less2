package com.company;

public class Chick extends Hen implements Printable {
    private String color;
    private int growth;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public Chick(int age, String name, int weight, String color, int growth) {
        super(age, name, weight);
        this.color = color;
        this.growth = growth;
    }

    @Override
    public void print() {
        System.out.println("age " + getAge() + ", " + "\nName " + getName() + ", " + "\nWeight " + getWeight() +
                ", " + "\nColor " + getColor() + ", " + "\nGrowth   " + getGrowth());

    }
}
