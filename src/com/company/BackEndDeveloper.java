package com.company;

public class BackEndDeveloper extends Developer {

    @Override
    void drinkCoffee() {
        System.out.println("drinkCoffee");
    }

    @Override
    void smoke() {
        System.out.println("smoke");
    }

    public void developAPI() {
        System.out.println("create API");
    }

}
