package org.example.test;

import org.example.entities.Brand;
import org.example.entities.Category;
import org.example.entities.Product;
import org.example.repository.abstracts.ProductRepository;
import org.example.repository.concretes.ProductRepositoryImpl;

import java.util.List;

public class Main {


    public static void main(String[] args) {

        ProductRepository productRepository = new ProductRepositoryImpl();

        /** TÜM ÜRÜNLERİ ALMA
        List<Product> products = productRepository.findProducts();

        products.forEach(System.out::println);
         */

        Product product = productRepository.findProductById(4);
        System.out.println(product);

        int count=productRepository.findProductCount();
        System.out.println(count);



        List<Product> productList =  productRepository.findProductsEntities(3,6);
        productList.forEach(System.out::println);





    }

    /**

    private static void insertData(){

        Brand brand = new Brand("Apple");
        Brand brand1 = new Brand("Lenovo");
        Brand brand2 = new Brand("BMW");
        Brand brand3 = new Brand("Volkswagen");
        Brand brand4 = new Brand("Audi");

        Category category = new Category("Telefon");
        Category category1 = new Category("Bilgisayar");
        Category category2 = new Category("Araba");

        Product product = new Product("Iphone 13",30000,5,brand,category);
        Product product1 = new Product("Passat",555000,10,brand3,category2);
        Product product2 = new Product("Z580",60000,66,brand1,category1);

        Product product3 = new Product("M8",700000,7,brand2,category2);
        Product product4 = new Product("R8",500000,90,brand4,category2);
        Product product5 = new Product("Iphone 15",60000,190,brand,category);

        Product product6 = new Product("MAC",70000,800,brand,category1);
        Product product7 = new Product("Lenovo Tlf",70000,37,brand1,category);
        Product product8 = new Product("Golf",600000,80,brand3,category2);

        productRepository.saveBrand(brand);
        productRepository.saveBrand(brand1);
        productRepository.saveBrand(brand2);
        productRepository.saveBrand(brand3);
        productRepository.saveBrand(brand4);

        productRepository.saveCategory(category);
        productRepository.saveCategory(category1);
        productRepository.saveCategory(category2);



        productRepository.saveProduct(product);
        productRepository.saveProduct(product1);
        productRepository.saveProduct(product2);
        productRepository.saveProduct(product3);
        productRepository.saveProduct(product4);
        productRepository.saveProduct(product5);
        productRepository.saveProduct(product6);
        productRepository.saveProduct(product7);
        productRepository.saveProduct(product8);
*/



}
