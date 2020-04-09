package com.stock.markettrends;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.stock"})
public class MarketTrendsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketTrendsApplication.class,
                              args);
    }

}
