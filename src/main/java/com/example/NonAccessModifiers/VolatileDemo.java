package com.example.NonAccessModifiers;


class VolatileDemo {

    volatile boolean flag = false;

    void update() {
        flag = true;
    }

    void check() {
        while (!flag) {
            // waiting
        }
        System.out.println("Flag updated!");
    }
}
