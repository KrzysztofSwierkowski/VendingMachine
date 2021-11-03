package com.company;

import java.util.Scanner;

public class Coin {


    private boolean coinVal = false;
    private double cost;
    private boolean isAbortet = true;

    public void setCost(double cost) {
        this.cost = cost;
    }


    public boolean isCoinVal() {
        return coinVal;
    }

    public boolean coinVer (double cost){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Koszt produktu: " + cost);
        System.out.printf("Włóż monety: (sumaryczna ilość włożonej gotówki)%n");
        double enteredCoin = scanner.nextDouble();

        if (enteredCoin == cost){

            coinVal = true;
        }
        else if (enteredCoin < cost){
            while (enteredCoin < cost & isAbortet) {
                double diff = cost - enteredCoin;
                System.out.printf("Włożono za mało gotówki! Brakuje %f: %n", diff);
                System.out.printf("Czy anulować? TAK/NIE %n");
                scanner.nextLine();
                String buttonClicked = scanner.nextLine();
                isAbortet = Abort(buttonClicked);
                System.out.printf("Włóż gotówkę %n ");

                double addCoin = scanner.nextDouble();
                enteredCoin = enteredCoin + addCoin;
            }
            if (enteredCoin > cost){
                double restCoin = enteredCoin - cost;
                System.out.printf("Wydaje produkt, reszta : %f%n", restCoin );
                //a function that returns a coin
                coinVal = true;
            }


        }

        else if (enteredCoin > cost){
            double restCoin = enteredCoin - cost;
            System.out.printf("Wydaje produkt, reszta : %f%n", restCoin );
            //a function that returns a coin

            coinVal = true;
        }




        return coinVal;
    }

public boolean Abort(String buttonClicked){
        if (buttonClicked.equals("TAK")){
            //a function that returns a all coin
            return true;
        }



      return false;
}


}
