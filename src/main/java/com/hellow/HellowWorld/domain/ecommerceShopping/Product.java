package com.hellow.HellowWorld.domain.ecommerceShopping;

import java.util.List;

public class Product {
    private int productId;
    private String name;
    private double productPrice;
    private String productModel;
    private List<Category> categories;
    private List<Brand> brand;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getProdectPrice() {
        return productPrice;
    }

    public void setProdectPrice(double prodectPrice) {
        this.productPrice = prodectPrice;
    }

    public String getProdectModel() {
        return productModel;
    }

    public void setProdectModel(String prodectModel) {
        this.productModel = prodectModel;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Brand> getBrand() {
        return brand;
    }

    public void setBrand(List<Brand> brand) {
        this.brand = brand;
    }
}
