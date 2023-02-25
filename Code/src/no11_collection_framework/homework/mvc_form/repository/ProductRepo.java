package no11_collection_framework.homework.mvc_form.repository;

import no11_collection_framework.homework.mvc_form.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo implements IProductRepo {
    static List<Product> productArray = new ArrayList<>();
    static {
        productArray.add(new Product(01, "Mu", 100));
        productArray.add(new Product(02, "Ao", 500));
        productArray.add(new Product(03, "Quan", 1000));
        productArray.add(new Product(04, "Vay", 700));
        productArray.add(new Product(05, "Dam", 300));
    }

    public void show() {
        for (int i = 0; i < productArray.size(); i++) {
            System.out.println(productArray.get(i));
        }
    }

    public void add(int id, String name, long value) {
        Product product= new Product(id, name, value);
        productArray.add(product);
    }

    public void edit(int id, String newName, long newValue) {
        Product newProduct= new Product(id, newName, newValue);
        for (int i = 0; i < productArray.size(); i++) {
            if (id == productArray.get(i).getId()) {
                productArray.set(i, newProduct);
            }
        }
    }

    public void search(String name) {
        for (int i = 0; i < productArray.size(); i++) {
            if (name.equals(productArray.get(i).getName())) {
                System.out.println(productArray.get(i));
            }
        }
    }
}
