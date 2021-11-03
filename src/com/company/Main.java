package com.company;


public class Main {

    public static void main(String[] args) {

        EnterNumber enterNumber = new EnterNumber();

        String product = enterNumber.EnterNumber();
        double productCost = enterNumber.products(product);

        Coin coin = new Coin();
        coin.setCost(productCost);
        System.out.println(productCost);
        boolean isPaid = coin.coinVer(productCost);
        String nameProduct = enterNumber.getProduct();
        GetProduct getProduct = new GetProduct();
        getProduct.setNameProduct(nameProduct);
        getProduct.setPaid(isPaid);
        getProduct.giveProduct();


    }
}
