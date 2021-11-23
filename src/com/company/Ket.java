package com.company;

public class Ket extends Animal{
    private String thisKet = "кот любит спать";
    public Ket(String name, int age) {
        super(name, age);
    }

    @Override
    public void print() { {
            peculiarity = " а " + getName() + "  глаза корчневые";
            System.out.println( "Зовут собаку " + getName() + "\n возраст кошки " + getAge() + " лет" + "\n" + peculiarity +
                    "\n" + thisKet + "\n-------------------------------------------------------------");
        }
    }
    }

