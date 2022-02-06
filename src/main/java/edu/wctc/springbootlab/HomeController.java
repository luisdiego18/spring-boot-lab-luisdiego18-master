package edu.wctc.springbootlab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    //GET and POST requests to "/" return the page "index.html"
    @RequestMapping("/")
    public String showHomePage(){
        return "index";
    }

    //GET requests to "view-cart" return the page "cart.html"
    @GetMapping("/cart")
    public String showCartPage() {
        return "orders/cart";
    }

    //GET and POST requests to "product/detail" return the page "product-detail.html"
    @RequestMapping("/product-detail")
    public String showProductDetailPage() {
        return "catalog/product-detail";
    }

    //POST requests to "place-order" redirect to the URL "/"
    @PostMapping("/place-order")
    public String showPlaceOrder() {
        return "index";
    }

    //GET and POST requests to "search" redirect to the URL "http://www.google.com"
    @RequestMapping("/search")
    public String redirectToGoogle() {
        return "redirect:https://www.google.com";
    }

}
