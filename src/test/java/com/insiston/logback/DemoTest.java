package com.insiston.logback;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ceshi
 * @Title:
 * @Package
 * @Description:
 * @date 2020/2/2413:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DemoTest {

    @Test
    public void test1(){
        log.debug("debug.....");
        log.info("info.....");
        log.error("error.....");
    }
}
