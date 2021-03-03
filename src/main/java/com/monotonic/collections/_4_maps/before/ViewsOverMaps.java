package main.java.com.monotonic.collections._4_maps.before;

import java.util.*;

public class ViewsOverMaps {

    public static void main(String[] args) {

        final Map<Integer, Product> idToProduct = new HashMap<>();

        idToProduct.put(1, ProductFixtures.door);
        idToProduct.put(2, ProductFixtures.floorPanel);
        idToProduct.put(3, ProductFixtures.window);

        // set: collection where each object is unique. only 1 element in set
        // - It basically returns a set view of the keys
        // - or we can create a new set and store the key elements in them.

        Set<Integer> ids = idToProduct.keySet();
        System.out.println(ids);
        System.out.println(idToProduct);
        System.out.println();

        ids.remove(1);
        System.out.println(ids);
        System.out.println(idToProduct);

        // ids.add(5);
        // can only add key AND value to map (both)

        Collection<Product> products = idToProduct.values();
        System.out.println(products);
        System.out.println(ids);

        products.remove(ProductFixtures.window);

        System.out.println("AFTER REMOVAL:");
        System.out.println(products);
        System.out.println(idToProduct);

        //  Set<Map.Entry<Integer, Product>> entries = idToProduct.entrySet();
        // we can modify values with the entry set

        var entries = idToProduct.entrySet();
        for (var entry : entries) {
            System.out.println("DEMONSTRATING ENTRY SET: ");
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

            //   entry.setValue(ProductFixtures.window);
        }
        //   System.out.println("\n AFTER SET VALUE:");
        //   System.out.println(idToProduct);

        Map.Entry<Integer, Product> entry = Map.entry(3, ProductFixtures.window);
        //   entries.add(entry);
        System.out.println("\n\n AFTER ENTRY:");
        System.out.println(idToProduct);

    }
}