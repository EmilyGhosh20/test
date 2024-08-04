import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

	public class ProductUI {

	    public static void main(String[] args) {
	        List<Product> prodList = new ArrayList<>();
	        prodList.add(new Product(34, "SmartPhone", 65000.00));
	        prodList.add(new Product(13, "Grocery", 20000.00));
	        prodList.add(new Product(82, "Books", 90000.00));

	        // Sorting products based on price using Comparable
	        System.out.println("Comparing Prices of Products:");
	        Collections.sort(prodList);

	        for (Product p : prodList) {
	            System.out.println(p); // toString() method of Product will be called
	            System.out.println(); // for a blank line between products
	        }
	    }
	}


