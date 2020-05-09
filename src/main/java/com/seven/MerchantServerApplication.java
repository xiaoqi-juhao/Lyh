package com.seven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EntityScan(basePackages={"com.seven.merchant.entity"})
@MapperScan("com.seven.merchant.mapper")
public class MerchantServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MerchantServerApplication.class, args);
    }

}
