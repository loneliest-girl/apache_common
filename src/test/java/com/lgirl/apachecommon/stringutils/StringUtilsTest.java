package com.lgirl.apachecommon.stringutils;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @program: apachecommon
 * @description 测试StringUtils类
 * @author: zhujingxing
 * @create: 2021-07-05 22:02
 **/
@SpringBootTest
public class StringUtilsTest {
    @Test
    public void equals() {
        try {
            String a = null;
            String b = "b";
            System.out.println(a.equals(b));
            StringUtils.equals("a", "b");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
