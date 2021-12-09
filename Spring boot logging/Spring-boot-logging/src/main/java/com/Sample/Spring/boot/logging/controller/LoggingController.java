package com.Sample.Spring.boot.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {


    Logger logger = LoggerFactory.getLogger(LoggingController.class);
    @GetMapping("/message")
    public String getMessage()
    {
        logger.info("[getMessage] info message");
        logger.warn("[getMessage] warn message");
        logger.error("[getMessage] error message");
        logger.debug("[getMessage] debug message");
        logger.trace("[getMessage]trace message");
        return "open console to check log messages";
    }

}


