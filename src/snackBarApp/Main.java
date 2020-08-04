package snackBarApp;

public class Main {

    private static void workWithData() {
        System.out.println("Its Working!");

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14 );

        Vmachine v1 = new Vmachine("Food");
        Vmachine v2 = new Vmachine("Drink");
        Vmachine v3 = new Vmachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getMachinename() );
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getMachinename() );
        Snack s3 = new Snack("Prestzel", 30, 2.00, v1.getMachinename() );
        Snack s4 = new Snack("Soda", 24, 2.50, v2.getMachinename() );
        Snack s5 = new Snack("Water", 20, 2.75, v2.getMachinename() );

        System.out.println(c1.getCustName() + " " + "has $" + c1.getCashOh());
        System.out.println(c2.getCustName() + " " + "has $" + c2.getCashOh());

        System.out.println(v1.getMachinename());
        System.out.println(v2.getMachinename());
        System.out.println(v3.getMachinename());

        System.out.format("%s %s at %s for %s\n", s1.getQty(), s1.getName(),s1.getVmId(), s1.getCost());

        System.out.format("%s %s at %s for %s\n", s2.getQty(), s2.getName(),s2.getVmId(), s2.getCost());

        System.out.format("%s %s at %s for %s\n", s3.getQty(), s3.getName(),s3.getVmId(), s3.getCost());

        System.out.format("%s %s at %s for %s\n", s4.getQty(), s4.getName(),s4.getVmId(), s4.getCost());

        System.out.format("%s %s at %s for %s\n", s5.getQty(), s5.getName(),s5.getVmId(), s5.getCost());

        c1.purchase(s4, 3);
        
        System.out.format("%s has $%s left, %s %s left\n", c1.getCustName(), c1.getCashOh() , s4.getQty(), s4.getName());

        c1.purchase(s3, 1);

        System.out.format("%s has $%s left, %s %s left\n", c1.getCustName(), c1.getCashOh() , s3.getQty(), s3.getName());

        c2.purchase(s4, 2);

        System.out.format("%s has $%s left, %s %s left\n", c2.getCustName(), c2.getCashOh() , s4.getQty(), s4.getName());

        c1.setCashOh(c1.getCashOh() + 10);

        System.out.println(c1.getCashOh());

        c1.purchase(s2, 1); 

        System.out.format("%s has $%s left, %s %s left\n", c1.getCustName(), c1.getCashOh() , s2.getQty(), s2.getName());

        s3.setQty(s3.getQty() + 12);

        System.out.println(s3.getQty());

        c2.purchase(s3, 3);

        System.out.format("%s has $%s left, %s %s left\n", c2.getCustName(), c2.getCashOh() , s3.getQty(), s3.getName());


        
     






    }

    public static void main(String[] args) {
        workWithData();

    }

}


// * [ ] Customer 1 (Jane) buys 3 of snack 4 (Soda).
// * [ ] Print Customer 1 (Jane) Cash on hand.
// * [ ] Print quantity of snack 4 (Soda).
// * [ ] Customer 1 (Jane) buys 1 of snack 3 (Pretzel).
// * [ ] Print Customer 1 (Jane) Cash on hand.
// * [ ] Print quantity of snack 3 (Pretzel).
// * [ ] Customer 2 (Bob) buys 2 of snack 4 (Soda).
// * [ ] Print Customer 2 (Bob) Cash on Hand.
// * [ ] Print quantity of snack 4 (Soda).
// * [ ] Customer 1 (Jane) finds $10.
// * [ ] Print Customer 1 (Jane) Cash on Hand.
// * [ ] Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar).
// * [ ] Print Customer 1 (Jane) Cash on Hand.
// * [ ] Print quantity of snack 2 (Chocolate Bar).
// * [ ] Add 12 more items to snack 3 (Pretzel).
// * [ ] Print quantity of snack 3 (Pretzel).
// * [ ] Customer 2 (Bob) buys 3 of snack 3 (Pretzel).
// * [ ] Print Customer 2 (Bob) Cash on hand.
// * [ ] Print quantity of snack 3 (Pretzel).

// The MVP of this application would produce the following output

// ```TEXT
// Customer 1 cash on hand 37.75
// Quantity of snack 4 is 21

// Customer 1 cash on hand 35.75
// Quanity of snack 3 is 29

// Customer 2 cash on hand 28.14
// Quantity of snack 4 is 19

// Customer 1 cash on hand 45.75

// Customer 1 cash on hand 44.75
// Quantity of snack 2 is 35

// Quantity of snack 3 is 41

// customer 2 cash on hand 22.14
// Quantity of snack 3 is 38
// ```