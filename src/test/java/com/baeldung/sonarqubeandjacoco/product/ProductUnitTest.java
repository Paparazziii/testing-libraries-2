package com.baeldung.sonarqubeandjacoco.product;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.baeldung.sonarqubeandjacoco.product.Product;

/***
 * Project Name     : Sonar Jacoco Unit Test
 * Username         : Jing Tang
 * Date Time        : 12/29/2021
 */

public class ProductUnitTest {

    @Test
    public void test() {
        Product product = new Product();
        product.setId(1);
        assertNull(product.getName());
        assert (product.getId() == 1);
    }

    @Test
    public void testProduct() {
        Product product = new Product(1, "product", 1, 2.0);
        assertNotNull(product.getName());
    }

    @Test
    public void testProduct2(){
        Product product2 = new Product(2, "product2", 1, 1.0);
        assertNotNull(product2.getName());
    }

}
