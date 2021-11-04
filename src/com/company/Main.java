package com.company;


public class Main {

    public static void main(String[] args) {

        EnterNumber enterNumber = new EnterNumber();

        String product = enterNumber.EnterNumber();
        double productCost = enterNumber.products(product);

        Coin coin = new Coin();
        coin.setCost();
        System.out.println(productCost);
        boolean isPaid = coin.coinVer(productCost);

        GetProduct getProduct = new GetProduct();
        getProduct.setNameProduct(product);
        getProduct.setPaid(isPaid);
        getProduct.giveProduct();


    }
}
