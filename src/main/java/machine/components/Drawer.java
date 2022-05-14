package machine.components;
import products.Product;
import java.util.ArrayList;

public class Drawer {

    private ArrayList<Product> items;
    private EnumCode enumCode;
    private double price;

    // Constructor
    public Drawer(EnumCode enumCode, double price) {
        this.items = new ArrayList<Product>();
        this.enumCode = enumCode;
        this.price = price;
    }

    public EnumCode getEnumCode() {
        return enumCode;
    }

    public int itemCount() {
        return items.size();
    }

    public void addItem(Product product) {
        this.items.add(product);
    }

    public Product removeItem() {
        return items.remove(0);
    }

    public double getPrice() {
        return price;
    }

}
