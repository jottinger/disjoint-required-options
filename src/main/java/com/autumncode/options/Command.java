package com.autumncode.options;

public class Command implements Runnable {
    @Override
    public void run() {
        System.out.println(this);
    }
}
