package org.example.repository.abstracts;

import org.example.entities.Brand;
import org.example.entities.Category;
import org.example.entities.Product;

import java.util.List;


public interface ProductRepository {

    Product saveProduct(Product product);
    Brand saveBrand(Brand brand);
    Category saveCategory(Category category);
    List<Product> findProducts();
    List<Product> findProductsEntities(int firstResult,int maxResult);
    Product findProductById(int productId);
    List<Product> findByCategoryName(String categoryName);
    int findProductCount();


}
