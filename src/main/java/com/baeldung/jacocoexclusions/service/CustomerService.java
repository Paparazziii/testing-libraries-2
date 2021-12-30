package com.baeldung.jacocoexclusions.service;

import com.baeldung.jacocoexclusions.generated.Generated;

/***
 * Project Name     : Sonar Jacoco Unit Test
 * Username         : Jing Tang
 * Date Time        : 12/29/2021
 */

public class CustomerService {

    //this method will be excluded from coverage due to @Generated.
    @Generated
    public String getProductId() {
        return "An ID";
    }

    public String getCustomerName() {
        return "A name";
    }
}
