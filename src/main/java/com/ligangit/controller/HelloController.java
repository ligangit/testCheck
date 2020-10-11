package com.ligangit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloController {
    /**
     * 日志
     */
    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);

    public static void main(String[] args) {
        logger.info("hello world！");
        logger.info("检查代码！");
        System.out.println("hello");
    }
}
