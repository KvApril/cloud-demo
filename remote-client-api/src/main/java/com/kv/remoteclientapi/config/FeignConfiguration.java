package com.kv.remoteclientapi.config;

import feign.Logger;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
