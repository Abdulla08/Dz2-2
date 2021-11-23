package com.company;

public class Goat extends Animal{
    private String thisGoat = "коза чёрный";
    public Goat(String name, int age) {
        super(name, age);
    }

    @Override
    public void print() { {
            peculiarity = " л " + getName() + "  глаза чёрный";
            System.out.println( "Зовут козу " + getName() + "\n возраст козы " + getAge() + " лет" + "\n" + peculiarity +
                    "\n" + thisGoat + "\n-------------------------------------------------------------");
        }
    }
    }

