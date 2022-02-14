package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        Animal shark = new Shark(650, "Blue", true);
        Animal eagle = new Eagle(10, "Brown", 200);
        Animal turtle = new Turtle(30, "Brown", 85);
        Animal[] animals = {shark, eagle, turtle};

        for (Animal s : animals) {
            if (s instanceof Shark) {
                ((Shark) s).attack();
            }
            if (s.getClass().getName().equals("com.company.Shark")) {
                ((Shark) s).attack();
            }
            if (s instanceof Turtle) {
                ((Turtle) s).swim();

            }
            if (s.getClass().getName().equals("com.company.Turtle")) {
                ((Turtle) s).swim();
            }
            if (s instanceof Eagle) {
                ((Eagle) s).fly();

            }
            if (s.getClass().getName().equals("com.company.Eagle")) {
                ((Eagle) s).fly();
            }
            Animal[] reptile = {turtle};
            Animal[] fish = {shark};
            Animal[] bird = {eagle};


        }
    }
}
