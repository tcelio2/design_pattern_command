package br.com.command.exampleone.model;

public class Produto {
    private String name = "ABC";
    private int quantity = 10;

    public void comprar() {
        System.out.println("Stock [ Name: "+name+" Quantity: " + quantity +" ] bought");
    }
    public void vender() {
        System.out.println("Stock [ Name: "+name+" Quantity: " + quantity +" ] sold");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
