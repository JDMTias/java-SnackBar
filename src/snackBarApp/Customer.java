package snackBarApp;

public class Customer {

    // fields 
    private static int maxId = 0;
    private int custId;
    private String custName;
    private double cashOh;

    // constructors 
    public Customer(String custName, double cashOh) {
        maxId++;
        custId = maxId;
        this.custName = custName;
        this.cashOh = cashOh;
        
    }


    // getters

    public int getCustId() {
        return custId;
    }
    public String getCustName() {
        return custName;
    }
    public double getCashOh() {
        return cashOh;
    }

    // setters

    public void setCustName(String custName) {
        this.custName = custName;
        
    }

    public void setCashOh(double cashOh) {
        this.cashOh = cashOh;
    }

    
}



