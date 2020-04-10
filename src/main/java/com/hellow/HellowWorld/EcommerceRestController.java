package com.hellow.HellowWorld;

import com.hellow.HellowWorld.domain.ecommerceShopping.Cart;
import com.hellow.HellowWorld.domain.ecommerceShopping.Customer;
import com.hellow.HellowWorld.domain.ecommerceShopping.Product;
import com.hellow.HellowWorld.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class EcommerceRestController {

    @Autowired
    CartService cartService;

    @RequestMapping("/products")
    public List<Product> getSellerProducts(){
        return cartService.getECommerceDataProvider();
    }

    @RequestMapping("/start-shopping")
    public Customer startShoping(){
        return cartService.doShopping();
    }

    @RequestMapping("/add-product-to-cart/{productId}")
    public Cart addToCart(@PathVariable Integer productId){
        return cartService.addProductToCart(productId);
    }

    @RequestMapping("/end-shopping")
    public Map<String,Object> endShoping(){
        return cartService.endShoping();
    }
}
