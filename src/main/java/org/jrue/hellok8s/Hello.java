package org.jrue.hellok8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
@RequestMapping("/hello")
public class Hello {

    @GetMapping
    public String hello() throws Exception {
        return String.format("Hello K8s! Hostname: %s", InetAddress.getLocalHost().getHostName());
    }

}