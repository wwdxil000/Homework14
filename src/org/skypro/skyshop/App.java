package org.skypro.skyshop;

import org.skypro.skyshop.basket.Basket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.addProduct(new SimpleProduct("Яблоко", 50));
        basket.addProduct(new DiscountedProduct("Молоко", 100, 20));
        basket.addProduct(new FixPriceProduct("Хлеб"));
        basket.addProduct(new SimpleProduct("Сыр", 200));
        basket.addProduct(new DiscountedProduct("Сок", 150, 10));
        basket.addProduct(new SimpleProduct("Лишний", 10));

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