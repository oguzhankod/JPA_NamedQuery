package org.example.repository.concretes;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.example.entities.Brand;
import org.example.entities.Category;
import org.example.entities.Product;
import org.example.jpaFactory.abstracts.JPAFactory;
import org.example.jpaFactory.concretes.JPAFactoryImpl;
import org.example.repository.abstracts.ProductRepository;

import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    private JPAFactory jpaFactory = new JPAFactoryImpl();
    private EntityManager entityManager = jpaFactory.getEntityManager();
    private EntityTransaction entityTransaction = jpaFactory.getTransaction();

    @Override
    public Product saveProduct(Product product) {

        entityTransaction.begin();
        entityManager.persist(product);
        entityTransaction.commit();


        return product;
    }

    @Override
    public Brand saveBrand(Brand brand) {

        entityTransaction.begin();
        entityManager.persist(brand);
        entityTransaction.commit();

        return brand;
    }

    @Override
    public Category saveCategory(Category category) {

        entityTransaction.begin();
        entityManager.persist(category);
        entityTransaction.commit();
        return category;
    }

    @Override
    public List<Product> findProducts() {

        TypedQuery<Product> typedQuery = entityManager.createNamedQuery("Product.findProducts",Product.class);

        List<Product> products = typedQuery.getResultList();

        return products;
    }

    @Override
    public List<Product> findProductsEntities(int firstResult, int maxResult) {

        TypedQuery<Product> typedQuery = entityManager.createNamedQuery("Product.findProducts",Product.class);
        typedQuery.setFirstResult(firstResult);
        typedQuery.setMaxResults(maxResult);

        List<Product> products = typedQuery.getResultList();
        return products;
    }

    @Override
    public Product findProductById(int productId) {

        TypedQuery<Product> typedQuery = entityManager.createNamedQuery("Product.findById",Product.class);
        typedQuery.setParameter("productId",productId);
        Product product = typedQuery.getSingleResult();

        return product;
    }

    @Override
    public List<Product> findByCategoryName(String categoryName) {
        TypedQuery<Product> typedQuery = entityManager.createNamedQuery("Product.findByCategory",Product.class);
        typedQuery.setParameter("categoryName",categoryName);
        List<Product> products = typedQuery.getResultList();

        return products;
    }

    @Override
    public int findProductCount() {

        TypedQuery<Long> typedQuery = entityManager.createNamedQuery("Product.findCount",Long.class);
        Long count = typedQuery.getSingleResult();

        return count.intValue();
    }



}
