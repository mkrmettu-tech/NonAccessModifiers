package com.example.NonAccessModifiers;


final class FinalClass {
    final int MAX = 100;

    final void show() {
        System.out.println("Final method");
    }
}

// ❌ Cannot extend FinalClass
