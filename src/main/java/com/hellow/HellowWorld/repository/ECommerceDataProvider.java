package com.hellow.HellowWorld.repository;

import com.hellow.HellowWorld.domain.ecommerceShopping.*;

import java.util.ArrayList;
import java.util.List;

public class ECommerceDataProvider {

    public List<Product> getSellerProducts(){
        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(getTshirt(getAllCategory(), getListOfBrands()));
        listOfProducts.add(getPants(getAllCategory(), getListOfBrands()));
        listOfProducts.add(getshirt(getAllCategory(), getListOfBrands()));
        listOfProducts.add(getShoes(getAllCategory(), getListOfBrands()));
        return listOfProducts;

    }

    public List<Brand> getListOfBrands(){
        List<Brand> listOfBrands = new ArrayList<>();
        listOfBrands.add(getBrandLee());
        listOfBrands.add(getBrandNike());
        listOfBrands.add(getBrandParada());
        listOfBrands.add(getBrandPuma());
        return listOfBrands;
    }

    public List<Category> getAllCategory(){
        List<Category> listOfCategory = new ArrayList<>();
        listOfCategory.add(getMaleCategory());
        listOfCategory.add(getFemaleCategory());
        listOfCategory.add(getKidsCategory());
        return listOfCategory;
    }

    public Category getKidsCategory() {
        Category kids = new Category();
        kids.setCategoryId(3);
        kids.setCategoryName("kids");
        return kids;
    }

    public Category getFemaleCategory() {
        Category femaleCategory = new Category();
        femaleCategory.setCategoryId(2);
        femaleCategory.setCategoryName("Female");
        return femaleCategory;
    }

    public Category getMaleCategory() {
        Category maleCategory = new Category();
        maleCategory.setCategoryId(1);
        maleCategory.setCategoryName("Male");
        return maleCategory;
    }

    public Brand getBrandNike(){
        Brand nikeBrand = new Brand();
        nikeBrand.setBrandId(1);
        nikeBrand.setBrandName("Nike");
        return nikeBrand;
    }

    public Brand getBrandParada(){
        Brand paradaBrand = new Brand();
        paradaBrand.setBrandId(2);
        paradaBrand.setBrandName("Parada");
        return paradaBrand;
    }

    public Brand getBrandLee(){
        Brand leeBrand = new Brand();
        leeBrand.setBrandId(3);
        leeBrand.setBrandName("Lee");
        return leeBrand;
    }

    public Brand getBrandPuma(){
        Brand pumaBrand = new Brand();
        pumaBrand.setBrandId(4);
        pumaBrand.setBrandName("Puma");
        return pumaBrand;
    }



    public Product getTshirt(List<Category> categories, List<Brand> brands){
        Product tShirt = new Product();
        tShirt.setName("T-shirt");
        tShirt.setProductId(1);
        tShirt.setProdectModel("polo101");
        tShirt.setProdectPrice(500);
        tShirt.setCategories(categories);
        tShirt.setBrand(brands);
        return tShirt;
    }

    public Product getPants(List<Category> categories, List<Brand> brands){
        Product pants = new Product();
        pants.setName("Pants");
        pants.setProductId(2);
        pants.setProdectModel("local");
        pants.setProdectPrice(400);
        pants.setCategories(categories);
        pants.setBrand(brands);
        return pants;
    }

    public Product getshirt(List<Category> categories, List<Brand> brands){
        Product shirt = new Product();
        shirt.setName("Shirt");
        shirt.setProductId(3);
        shirt.setProdectModel("polo");
        shirt.setProdectPrice(600);
        shirt.setCategories(categories);
        shirt.setBrand(brands);
        return shirt;
    }

    public Product getShoes(List<Category> categories, List<Brand> brands){
        Product shoes = new Product();
        shoes.setName("shoes");
        shoes.setProductId(4);
        shoes.setProdectModel("rebook");
        shoes.setProdectPrice(1400);
        shoes.setCategories(categories);
        shoes.setBrand(brands);
        return shoes;
    }

    public Customer getCustomer(){
        Customer customer = new Customer();
        customer.setCustomerId(1);
        customer.setFirstName("Anju");
        customer.setLastName("Majoka");
        customer.setAddress("Vidyut nagar hisar");
        customer.setEmailId("anjumajoka9@gmail.com");
        customer.setUserName("anjumajoka");
        customer.setPassword("anju@123");
        return customer;
    }

    public List<CartItems> getCartItems(List<Product> products){
        Customer customer = new Customer();
        List<CartItems> cartItems = new ArrayList<>();
//        customer.setProduct(getPants());
        return cartItems;
    }
}
