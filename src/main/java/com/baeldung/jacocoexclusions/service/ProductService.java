package com.baeldung.jacocoexclusions.service;

/***
 * Project Name     : Sonar Jacoco Unit Test
 * Username         : Jing Tang
 * Date Time        : 12/29/2021
 */

public class ProductService {
    private static final double DISCOUNT = 0.25;
    private static final Integer Count = 100;

    public double getSalePrice(double originalPrice) {
        return originalPrice - originalPrice * DISCOUNT;
    }

    public double getFinalProfit(double originalPrice){
        return Count*(originalPrice-originalPrice*DISCOUNT);
    }
}
