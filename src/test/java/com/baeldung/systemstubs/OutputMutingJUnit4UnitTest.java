package com.baeldung.systemstubs;

import org.junit.Rule;
import org.junit.Test;
import uk.org.webcompere.systemstubs.rules.SystemOutRule;
import uk.org.webcompere.systemstubs.stream.output.NoopStream;

/***
 * Project Name     : Sonar Jacoco Unit Test
 * Username         : Jing Tang
 * Date Time        : 12/29/2021
 */

public class OutputMutingJUnit4UnitTest {
    @Rule
    public SystemOutRule systemOutRule = new SystemOutRule(new NoopStream());

    @Test
    public void givenMuteSystemOut() throws Exception {
        System.out.println("nothing is output");
    }
}
