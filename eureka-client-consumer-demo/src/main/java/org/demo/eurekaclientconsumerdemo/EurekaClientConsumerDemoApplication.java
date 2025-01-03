package org.demo.eurekaclientconsumerdemo;

import jakarta.annotation.PostConstruct;
import org.demo.eurekaclientconsumerdemo.test.CallEurekaClientTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EurekaClientConsumerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientConsumerDemoApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

/*	@PostConstruct
	public void testMain() {
		CallEurekaClientTest callEurekaClientTest = new CallEurekaClientTest();
		callEurekaClientTest.callHelloTest();

	}*/
}
