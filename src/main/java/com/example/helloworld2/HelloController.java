package com.example.helloworld2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        String podIp = System.getenv("KUBERNETES_POD_IP");
        if (podIp == null) {
            return "Hello, World!";
        }
        return "Hello, World! (from pod " + podIp + ")";
    }
}
