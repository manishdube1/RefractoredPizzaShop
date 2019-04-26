package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Order {
    //Class Level Variables - Protect the data
    private int orderId;
    public double itemNumber;
    public String itemO;
    private double totalPrice;
    private Customer cust;
    private ArrayList<Menu> menuItem;

    //Constructor Method
    public Order(int _orderId, double _itemNumber, String _itemO, double _totalPrice){
        this.orderId = _orderId;
        this.itemNumber = _itemNumber;
        this.itemO = _itemO;
        this.totalPrice = _totalPrice;

    }


    //Setters and Getters
    public int getorderId() { return orderId; }
    public void setorderId(int _orderId) {this.orderId = _orderId;}

    public double getitemNumber(){
        System.out.println("How many items would you like to order: ");
        Scanner reader = new Scanner(System.in);
        double itemNumber = reader.nextInt();

        return itemNumber;}
    public double setitemNumber(double _itemNumber) {


        return itemNumber;
    }
    public String getitemO () {
        System.out.println("What item would you like to order: ");
        Scanner reader = new Scanner(System.in);

        String itemO = reader.nextLine();

        return itemO;
    }

    public String setitemO (String _itemO){


        return itemO;
    }



    public static void listOrder(ArrayList<Order> oList) {
        for (Order order : oList) {
            System.out.println(order.getorderId());
            System.out.println(order.getitemO());

        }
    }

}