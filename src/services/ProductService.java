package services;

import entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    static List<Product> productList = new ArrayList<>();
    static {
        addProduct(new Product("Men Fashion", "Áo Sweater Nam", "VESCA", 200000));
        addProduct(new Product("Men Fashion", "Áo Phông", "20we", 250000));
        addProduct(new Product("Men Fashion", "Áo Khoác Jeans", "Datino", 500000));

        addProduct(new Product("Women Fashion", "Áo Khoác Cardigan", "chew_berry", 200000));
        addProduct(new Product("Women Fashion", "Chân Váy Jeans", "chew_berry", 300000));
        addProduct(new Product("Women Fashion", "Quần Baggy Jeans", "chew_berry", 350000));

        addProduct(new Product("Phone", "S22", "Samsung", 21000000));
        addProduct(new Product("Phone", "Note10", "Samsung", 9500000));
        addProduct(new Product("Phone", "Iphone14", "Apple", 30000000));

        addProduct(new Product("Laptop", "DellLaptop", "Dell", 17000000));
        addProduct(new Product("Laptop", "MsiLaptop", "Msi", 20500000));
        addProduct(new Product("Laptop", "Asuslaptop", "Asus", 16000000));
    }

    public static void addProduct(Product product) {
        productList.add(product);
    }

    public Product chooseProductByID(int productID){
        for (Product product : productList){
            if (product.getProductID() == productID){
                return product;
            }
        }
        return null;
    }

    public void displayProductByCategoryName(String categoryName) {
        int count = 0;
        for (Product product : productList){
            if(product.getCategoryName().equals(categoryName)){
                count++;
                System.out.println(count + ". ID: " + product.getProductID()
                        + ", Name: " + product.getProductName()
                        + ", Brand: " + product.getProductBrand()
                        + ", Price: " + product.getProductPrice()
                );
            }

        }
    }
}
