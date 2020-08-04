package snackBarApp;

public class Main {

    private static void workWithData() {
        System.out.println("Its Working!");

        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14 );

        Vmachine v1 = new Vmachine("Food");
        Vmachine v2 = new Vmachine("Drink");
        Vmachine v3 = new Vmachine("Office");

        // Snack(String name, int qty, double cost, String vmId)

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getMachinename() );

        System.out.println(c1.getCustName() + " " + "has $" + c1.getCashOh());
        System.out.println(c2.getCustName() + " " + "has $" + c2.getCashOh());

        System.out.println(v1.getMachinename());
        System.out.println(v2.getMachinename());
        System.out.println(v3.getMachinename());

        System.out.println(s1.getQty() + s1.getName() + " " + "at" + " " + s1.getVmId() );





    }

    public static void main(String[] args) {
        workWithData();

    }

}


// * [ ] Instantiate 3 Vending Machines
// * [ ] Food
// * [ ] Drink
// * [ ] Office

// * [ ] Instantiate 5 snacks
// * [ ] In Vending Machine Food
// * [ ] 36 Chips at $1.75
// * [ ] 36 Chocolate Bar at $1.00
// * [ ] 30 Pretzel at $2.00
// * [ ] In Vending Machine Drink
// * [ ] 24 Soda at $2.50
// * [ ] 20 Water at $2.75

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