package main.java.com.monotonic.collections._2_what_are_collections.before;

import com.monotonic.collections.common.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionConcepts {
    public static void main(String[] args) {
        Product door = new Product("Wooden Door", 35);
        Product floorPanel = new Product("Floor Panel", 25);
        Product window = new Product("Glass Window", 10);

        //the on values contained in this collection are types of subclasses of Product
        // generic type parameter
        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);

        Collection<Product> toRemove = new ArrayList<>();
        toRemove.add(door);
        toRemove.add(floorPanel);
        products.removeAll(toRemove); // takes another collection as its argument (removes all elements from THIS collection from the OTHER collection)
        System.out.println(products);


//        System.out.println(products.size());
//        System.out.println(products.isEmpty());
//        System.out.println(products.contains(window));
//        System.out.println(products.remove(window));
//        System.out.println(products.contains(window));





//        Iterator<Product> iterator = products.iterator();
//        while (iterator.hasNext()) {
//            Product product = iterator.next();
//            if ((product.getWeight() > 20)) {
//                iterator.remove();
//            }
//        }


        // for each product in the Product collection
        // prints on new lines
        // cannot modify (remove/add) whilst iterating over it (for each)
        // user Iterator
//        for (Product product : products) {
//            System.out.println(product);
//        }

    }
}
