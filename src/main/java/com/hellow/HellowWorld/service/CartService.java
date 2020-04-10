package com.hellow.HellowWorld.service;

import com.hellow.HellowWorld.domain.ecommerceShopping.Cart;
import com.hellow.HellowWorld.domain.ecommerceShopping.CartItems;
import com.hellow.HellowWorld.domain.ecommerceShopping.Customer;
import com.hellow.HellowWorld.domain.ecommerceShopping.Product;
import com.hellow.HellowWorld.repository.ECommerceDataProvider;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CartService {

    ECommerceDataProvider eCommerceDataProvider = new ECommerceDataProvider();

    Cart cart = new Cart();
    Customer customer = new Customer();


    public Customer doShopping() {
        List<CartItems> listOfCartItems = new ArrayList<>();
        cart.setCartItems(listOfCartItems);
        customer.setCart(cart);
        return customer;
    }

    public List<Product> getECommerceDataProvider() {
        return eCommerceDataProvider.getSellerProducts();
    }

    public Cart addProductToCart(int index) {
        Product product = eCommerceDataProvider.getSellerProducts().get(index);
        CartItems cartItem1 = new CartItems();
        cartItem1.setProducts(product);
        cart.getCartItems().add(cartItem1);
        return cart;
    }


    public Map<String, Object> endShoping() {
        Map<String, Object> data = new HashMap<>();
        data.put("Total Bill ", cart.getTotalCost());
        data.put("Items", cart.getCartItems());
        return data;

    }
}
