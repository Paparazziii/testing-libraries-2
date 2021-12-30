package com.baeldung.jacocoexclusions.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/***
 * Project Name     : Sonar Jacoco Unit Test
 * Username         : Jing Tang
 * Date Time        : 12/29/2021
 */

class CustomerServiceUnitTest {

    @Test
    public void givenCustomer_whenGetCustomer_thenReturnNewCustomer() {
        CustomerService customerService = new CustomerService();
        assertNotNull(customerService.getCustomerName());
    }
}
