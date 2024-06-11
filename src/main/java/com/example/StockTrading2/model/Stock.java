package com.example.StockTrading2.model;

public class Stock {

    private String name;
    private int price;
    private int quantity;


    public Stock(String n, int p, int q) {
        this.name = n;
        this.price = p;
        this.quantity = q;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //subtracts from quantity if buying and adds if selling
    public void modifyStockQuantity(boolean isBuying, int quant){
        if(isBuying){
            this.quantity = this.quantity - quant;
        }
        else {
            this.quantity = this.quantity + quant;
        }

    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
