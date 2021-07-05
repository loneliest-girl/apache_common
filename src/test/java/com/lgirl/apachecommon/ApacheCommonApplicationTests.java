package com.lgirl.apachecommon;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApacheCommonApplicationTests {

    @Test
    void contextLoads() {

    }

    @Test
    void stingTest() {
        StringUtils.equals("a", "b");
    }

}
