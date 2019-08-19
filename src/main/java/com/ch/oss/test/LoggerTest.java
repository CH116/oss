package com.ch.oss.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Author: chenhao 2019/8/19 17:33
 */

public class LoggerTest {

    private static Log logger = LogFactory.getLog(LoggerTest.class);

    public static void main(String[] args) {
        logger.trace("我是trace信息");
        logger.debug("我是debug信息");
        logger.info("我是info信息");
        logger.warn("我是warn信息");
        logger.error("我是error信息");
        logger.fatal("我是fatal信息");
    }
}