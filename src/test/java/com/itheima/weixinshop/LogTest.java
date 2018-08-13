package com.itheima.weixinshop;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 金帆
 * @version 1.0
 * @package com.itheima.weixinshop
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Data
@Slf4j
public class LogTest {

     private final Logger logger= LoggerFactory.getLogger(LogTest.class);
    @Test
    public void text01(){
        logger.debug("aaaaaaaaaa");
        logger.info("bbbbbbbbbbbb");
        logger.warn("ccccccccccc");
    }

    public void test02(){
        
    }
}
