package com.company;

public class Main {

    public static void main(String[] args) {
        Hen hen = (Hen) createObject("Hen");
        hen.print();
        System.out.println("------------------------");
        Chick chick = (Chick) createObject("Chick");
        chick.print();
        System.out.println("-------------------------");
        Bull bull = (Bull)  createObject("Bull");
        bull.print();
    }
    public static Animal createObject(String className) {
        Hen hen = new Hen(3,"hen", 2);
        Chick chick = new Chick(1,"chuk",4,"yellow", 10);
        Bull bull = new Bull(39,"Rog",  "black", 92);
        if (className == "Hen") {
            return hen;
        }else if (className == "Chick"){
            return chick;
        }else {
            return bull;
        }
    }

}