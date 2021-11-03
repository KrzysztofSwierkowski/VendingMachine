package com.company;

import java.util.*;

public class EnterNumber {

    private int number;
    private int cost;
    private String product;

    public String getProduct() {
        return product;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

public String EnterNumber(){
    this.product = product;
    this.number = number;
Map<Integer,String> codeNumber = new HashMap<>();

    codeNumber.put(1,"Kanapka");
    codeNumber.put(2,"Baton");
    codeNumber.put(3,"Woda");
    codeNumber.put(4,"Sok");
    codeNumber.put(5,"Paluszki");
    codeNumber.put(6,"Chrupki");

    Set<Map.Entry<Integer, String>> entries = codeNumber.entrySet();
    Iterator<Map.Entry<Integer, String>> code = entries.iterator();
    
    while(code.hasNext()) {
        Map.Entry<Integer, String> entry = code.next();
        System.out.println(entry.getKey());
        System.out.println(entry.getValue());
    }
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wybierz produkt:");
    int productNumber = scanner.nextInt();

    String product = codeNumber.get(productNumber);
return product;
    
}

public double products (String product){


    Map<String,Double> costMap = new HashMap<>();
    costMap.put("Kanapka", 3.5);
    costMap.put("Baton", 2.0);
    costMap.put("Woda", 1.0);
    costMap.put("Sok", 2.0);
    costMap.put("Paluszki", 1.5);
    costMap.put("Chrupki", 2.5);

    double cost = costMap.get(product);

return cost;
}

}
