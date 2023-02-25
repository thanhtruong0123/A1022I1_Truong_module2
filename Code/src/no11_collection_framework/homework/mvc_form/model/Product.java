package no11_collection_framework.homework.mvc_form.model;

public class Product {
    private String name;
    private int id;
    private long value;

    public Product() {
    }

    public Product(int id, String name, long value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}
