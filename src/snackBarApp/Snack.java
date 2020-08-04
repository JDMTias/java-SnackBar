package snackBarApp;

public class Snack {

    // fields
  
    private static int maxId = 0;
    private int snackId;
    private String name;
    private int qty;
    private double cost;
    private int vmId;

    
    
    // getters

    public int getSnackId() {
        return snackId;
    } 

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public double getCost() {
        return cost;
    }

    public int getVmId() {
        return vmId;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

   
    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setVmId(int vmId) {
        this.vmId = vmId;
    }

    // buy snack when given how many to buy

    // get total cost given a quantity











}