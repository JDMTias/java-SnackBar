package snackBarApp;

public class Snack {

    // fields
  
    private static int maxId = 0;
    private int snackId;
    private String name;
    private int qty;
    private double cost;
    private String vmId;
    

    // constructor

    public Snack(String name, int qty, double cost, String vmId) {
        maxId++;
        snackId = maxId;
        this.name = name;
        this.qty = qty;
        this.cost = cost;
        this.vmId = vmId;   
    }

        
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

    public String getVmId() {
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

    public void setVmId(String vmId) {
        this.vmId = vmId;
    }

    public void buySnack(int amount) {
        this.qty = this.qty - amount;
    }












}