package com.baeldung.systemstubs;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static uk.org.webcompere.systemstubs.SystemStubs.catchSystemExit;

/***
 * Project Name     : Sonar Jacoco Unit Test
 * Username         : Jing Tang
 * Date Time        : 12/29/2021
 */

class SystemExitExecuteAroundUnitTest {
    @Test
    void canCheckExitCode() throws Exception {
        int exitCode = catchSystemExit(() -> {
            System.exit(123);
        });
        assertThat(exitCode).isEqualTo(123);
    }
}
