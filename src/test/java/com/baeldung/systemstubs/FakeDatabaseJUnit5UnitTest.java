package com.baeldung.systemstubs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import uk.org.webcompere.systemstubs.jupiter.SystemStubsExtension;

import static org.assertj.core.api.Assertions.assertThat;

/***
 * Project Name     : Sonar Jacoco Unit Test
 * Username         : Jing Tang
 * Date Time        : 12/29/2021
 */


@ExtendWith(SystemStubsExtension.class)
class FakeDatabaseJUnit5UnitTest {

    @Test
    void useFakeDatabase(FakeDatabaseTestResource fakeDatabase) {
        assertThat(fakeDatabase.getDatabaseConnection()).isEqualTo("open");
    }
}
