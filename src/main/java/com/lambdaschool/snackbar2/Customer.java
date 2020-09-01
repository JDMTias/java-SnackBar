package com.lambdaschool.snackbar2;

public class Customer {
    private static int maxid = 0;
    private int custId;
    private String custName;
    private double availCash;

    public Customer(String custName, double availCash) {
        maxid++;
        custId = maxid;
        this.custName = custName;
        this.availCash = availCash;
    }

    public int getCustId() {
        return custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public double getAvailCash() {
        return availCash;
    }

    public void setAvailCash(double availCash) {
        this.availCash = availCash;
    }

    public void checkout(Snack snack, int qty) {
        snack.buySnack(qty);
        double cost = snack.getCost();
        this.availCash -= cost * qty;
    }
}
