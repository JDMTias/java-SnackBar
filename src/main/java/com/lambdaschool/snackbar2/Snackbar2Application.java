package com.lambdaschool.snackbar2;





public class Snackbar2Application {

    private static void workWithData(){
        System.out.println("Its Working!");

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14 );
        Customer c3 = new Customer("Charly", 25.25);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getVmName() );
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getVmName() );
        Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getVmName() );
        Snack s4 = new Snack("Soda", 24, 2.50, v2.getVmName() );
        Snack s5 = new Snack("Water", 20, 2.75, v2.getVmName() );

        System.out.println(c1.getCustName() + " " + "has $" + c1.getAvailCash());
        System.out.println(c2.getCustName() + " " + "has $" + c2.getAvailCash());

        System.out.println(v1.getVmName());
        System.out.println(v2.getVmName());
        System.out.println(v3.getVmName());

        System.out.format("%s %s at %s for %s\n", s1.getQty(), s1.getName(),s1.getMachineId(),
                s1.getCost());

        System.out.format("%s %s at %s for %s\n", s2.getQty(), s2.getName(),s2.getMachineId(), s2.getCost());

        System.out.format("%s %s at %s for %s\n", s3.getQty(), s3.getName(),s3.getMachineId(), s3.getCost());

        System.out.format("%s %s at %s for %s\n", s4.getQty(), s4.getName(),s4.getMachineId(), s4.getCost());

        System.out.format("%s %s at %s for %s\n", s5.getQty(), s5.getName(),s5.getMachineId(), s5.getCost());

        c1.checkout(s4, 3);

        System.out.format("%s has $%s left, %s %s left\n", c1.getCustName(), c1.getAvailCash() , s4.getQty(), s4.getName());

        c1.checkout(s3, 1);

        System.out.format("%s has $%s left, %s %s left\n", c1.getCustName(), c1.getAvailCash() , s3.getQty(), s3.getName());

        c2.checkout(s4, 2);

        System.out.format("%s has $%s left, %s %s left\n", c2.getCustName(), c2.getAvailCash() , s4.getQty(), s4.getName());

        c1.setAvailCash(c1.getAvailCash() + 10);

        System.out.println(c1.getAvailCash());

        c1.checkout(s2, 1);

        System.out.format("%s has $%s left, %s %s left\n", c1.getCustName(), c1.getAvailCash() , s2.getQty(), s2.getName());

        s3.setQty(s3.getQty() + 12);

        System.out.println(s3.getQty());

        c2.checkout(s3, 3);

        System.out.format("%s has $%s left, %s %s left\n", c2.getCustName(), c2.getAvailCash() , s3.getQty(), s3.getName());


    }

    public static void main(String[] args) {
       workWithData();
    }

}
