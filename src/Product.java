public class Product implements Comparable<Product> {
    int product_id;
    String product_name;
    double price;

    public Product(int product_id, String product_name, double price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.price = price;
    }

    @Override
    public int compareTo(Product otherProduct) {
        // Compare based on price
        if (this.price > otherProduct.price) {
            return -1; // this product should come before otherProduct
        } else if (this.price < otherProduct.price) {
            return 1; // this product should come after otherProduct
        } else {
            return 0; // prices are equal
        }
    }

    @Override
    public String toString() {
        return "Product ID: " + product_id + "\n" +
               "Product Name: " + product_name + "\n" +
               "Price: " + price;
    }
}
