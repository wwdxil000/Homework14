package org.skypro.skyshop;

import org.skypro.skyshop.basket.Basket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Basket basket = new Basket();

        Product apple = new Product("Яблоко", 50);
        Product milk = new Product("Молоко", 90);
        Product bread = new Product("Хлеб", 40);
        Product cheese = new Product("Сыр", 200);
        Product juice = new Product("Сок", 120);
        Product extra = new Product("Шоколад", 80);
        basket.addProduct(apple);
        basket.addProduct(milk);
        basket.addProduct(bread);
        basket.addProduct(cheese);
        basket.addProduct(juice);
        basket.addProduct(extra);
        basket.printBasket();
        System.out.println("Стоимость корзины: " + basket.getTotalPrice());
        System.out.println("Есть ли Молоко: " + basket.containsProductByName("Молоко"));
        System.out.println("Есть ли Шоколад: " + basket.containsProductByName("Шоколад"));
        basket.clear();
        basket.printBasket();
        System.out.println("Стоимость корзины: " + basket.getTotalPrice());
        System.out.println("Есть ли Яблоко: " + basket.containsProductByName("Яблоко"));
    }
}