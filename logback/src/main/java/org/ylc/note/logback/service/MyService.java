package org.ylc.note.logback.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 代码千万行，注释第一行，
 * 注释不规范，同事泪两行。
 *
 * @author YuLc
 * @version 1.0.0
 * @date 2019/11/11
 */
@Service
public class MyService {

    private final Logger logger = LoggerFactory.getLogger(MyService.class);


    public void myLog() {
        logger.info("this is info service log");
        logger.error("this is error service log");
    }

}
