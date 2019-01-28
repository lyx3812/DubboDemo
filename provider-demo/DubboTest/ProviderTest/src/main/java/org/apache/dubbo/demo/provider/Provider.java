package org.apache.dubbo.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Provider {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Provider.class, args);
    }
}
