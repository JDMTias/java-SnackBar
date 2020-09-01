package com.lambdaschool.snackbar2;

public class Snack {
    private static  int maxId = 0;
    private int snackId;
    private String name;
    private int qty;
    private double cost;
    private String machineId;

    public Snack(String name, int qty, double cost, String machineId) {
        maxId++;
        snackId = maxId;
        this.name = name;
        this.qty = qty;
        this.cost = cost;
        this.machineId = machineId;
    }

    public int getSnackId() {
        return snackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    public void buySnack(int amount) {
        this.qty = this.qty - amount;
    }
}
