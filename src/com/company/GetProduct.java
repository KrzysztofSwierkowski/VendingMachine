package com.company;

import java.io.PrintStream;

public class GetProduct {
    private boolean isPaid;
    private String nameProduct;

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }



    public PrintStream giveProduct(){
        if (isPaid = true){
            return System.out.printf("Wydaję produkt : %s%n",nameProduct);

        }


        return null;
    }


}
