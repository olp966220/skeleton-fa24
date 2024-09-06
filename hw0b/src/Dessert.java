public class Dessert {
    public int flavor;
    public int price;
    public static int numDesserts = 0;  // keeps track of the number of desserts created so far.
    public Dessert(int flavor, int price) {
        this.flavor = flavor;
        this.price = price;
        numDesserts++;
    }
    public void printDessert() {
        System.out.println(this.flavor + " " + this.price + " " + numDesserts);
    }

    public static void main(String[] args) {
        System.out.print("I love dessert!");
        // test printDessert()
        /*
        Dessert dessert = new Dessert(1, 2);
        printDessert(dessert);
        Dessert dessert1 = new Dessert(3, 4);
        printDessert(dessert1);
         */
    }
}
