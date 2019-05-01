package com.demo.shippingbilling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableFeignClients("com.demo.shippingbilling")
@EnableDiscoveryClient
public class ShippingBillingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(com.demo.shippingbilling.ShippingBillingServiceApplication.class, args);
	}


}
