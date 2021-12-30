package com.baeldung.systemstubs;

import uk.org.webcompere.systemstubs.resource.TestResource;

/***
 * Project Name     : Sonar Jacoco Unit Test
 * Username         : Jing Tang
 * Date Time        : 12/29/2021
 */


public class FakeDatabaseTestResource implements TestResource {
    // let's pretend this is a database connection
    private String databaseConnection = "closed";

    @Override
    public void setup() throws Exception {
        databaseConnection = "open";
    }

    @Override
    public void teardown() throws Exception {
        databaseConnection = "closed";
    }

    public String getDatabaseConnection() {
        return databaseConnection;
    }
}
