package com.company;

public class Main {
    public static void main(String[] args) {
        Developer devFront = new FrontEndDeveloper();
        Developer devBack = new BackEndDeveloper();

        if (devFront instanceof FrontEndDeveloper) {
            ((FrontEndDeveloper) devFront).developGUI();
        }
        if (devBack instanceof FrontEndDeveloper) {
            ((FrontEndDeveloper) devBack).developGUI();
        }
        //Дополнение вызов метода developAPI()
//        if (devBack instanceof BackEndDeveloper){
//            ((BackEndDeveloper)devBack).developAPI();
//        }

    }
}
