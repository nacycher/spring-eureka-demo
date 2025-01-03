package org.demo.eurekaclientconsumerdemo.test;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Log4j2
@RestController
@RequestMapping("/test")
public class CallEurekaClientTest {
    @Autowired
    private RestTemplate restTemplate;

    private final String EUREKA_CLIENT_DEMO = "EUREKA-CLIENT-DEMO";

    @GetMapping("/hello")
    public String callHelloTest() {
        log.info("callHelloTest start");
        String result = restTemplate.
                getForObject(StringUtils.join(new String[]{"http://", EUREKA_CLIENT_DEMO, "/test/hello"}),
                        String.class);
        return result;
    }
}
