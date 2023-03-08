import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for(int i = 1; i < numWeeks + 1; i++){
            sum += i;
        }
        return sum;
    }
    
    public double getOrderTotal(double[] prices){
        double sum = 0;
        for(int i = 0; i < prices.length; i++){
            sum += prices[i];
         }
         return sum;
    }
    
    public void displayMenu(ArrayList<String> menuItems) {
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println(String.format("Hello, %s", userName));
        System.out.println(String.format("There are %s customers in front of you.", customers.size()));
        customers.add(userName);
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        double [] priceArray;
        priceArray = new double[maxQuantity];
        for (int i = 0; i < priceArray.length; i++) {
            priceArray[i] = price * (i+1);
            System.out.println(String.format("%s" + ' ' + "$%s0",i+1, priceArray[i]));
        }
    }
}
   