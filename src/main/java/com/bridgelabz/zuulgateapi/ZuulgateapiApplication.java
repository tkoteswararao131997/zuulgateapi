package com.bridgelabz.zuulgateapi;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulgateapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulgateapiApplication.class, args);
	}

}
