package org.jrue.hellok8s;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.util.List;

@RestController
@RequestMapping
public class Hello {

    @Autowired
    private EmployeeRepository repository;

    @GetMapping("/hello")
    public String hello() throws Exception {
        return String.format("Hello K8s! Hostname: %s", InetAddress.getLocalHost().getHostName());
    }

    @GetMapping("/employees")
    public List<Employee> employees() throws Exception {
        return repository.findAll();
    }

}