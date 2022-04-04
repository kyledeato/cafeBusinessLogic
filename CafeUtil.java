import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(int days) {
        int total = 0;
        for (int i = 0; i <= days; i++) {
            total += i;
        }
        return total;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        // like for price in prices
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public void displayMenu(ArrayList<String>menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            String name = menuItems.get(i);
            System.out.println(i + " " + name);
        }
    }

    public void addCustomer(ArrayList<String>customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s ", userName);
        int total = customers.size();
        System.out.printf("There are %d people in front of you", total);
        customers.add(userName);
        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        int total = 0;
        for (int i = 1; i <= maxQuantity; i++) {
            total += price;
            System.out.println(i + "- $" +total);
        }
        
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices) {
        if (menuItems.size() != prices.size()) {
            return false;
        } 
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d %s -- $d \n", i, menuItems.get(i), prices.get(i) );
        }
        return true;
    }
}