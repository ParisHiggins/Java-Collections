package main.java.com.monotonic.collections._4_maps.before;

import java.util.HashMap;
import java.util.Map;
import java.util.PropertyResourceBundle;

public class Java8Enhancements {
    public static void main(String[] args) {
        Product defaultProd = new Product(-1, "Whatever the customer wants", 100);

        Map<Integer, Product> idToProduct = new HashMap<>();
        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        Product testProduct = idToProduct.get(4);
        System.out.println(testProduct); // prints null
        System.out.println(idToProduct.get(4)); // prints null

        // SO DO THIS!

        Product product = idToProduct.getOrDefault(4, defaultProd);
        System.out.println(product);
        System.out.println(idToProduct.get(4)); // doesn't update map

        Product oldValue = idToProduct.replace(1, new Product(1, "BIG DOOR", 50));
        System.out.println("\n REPLACE: ");
        System.out.println(oldValue);
        System.out.println(idToProduct.get(1));

        ///////////////

        // THE BEST WAY TO LOOP THROUGH ELEMENTS!!!
        idToProduct.forEach((id, prod) ->{
            System.out.println(prod.getName() + " has an ID of: "+ id);
        });
    }
}
